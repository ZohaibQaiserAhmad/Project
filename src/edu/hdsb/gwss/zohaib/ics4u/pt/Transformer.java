/*
 +* Name: Zohaib Ahmad
 
 + * Date : Wednesday , June 14 , 2017
 
 + * Version : v0.02

 + * Description : Final performance task (transformer) : adds basics of photoshop
through methods

 */
package edu.hdsb.gwss.zohaib.ics4u.pt;

import becker.xtras.imageTransformation.ITransformations;
import java.util.Stack;

public class Transformer extends Object implements ITransformations {

    public static final int MIN_NUM_TRANS = 10;
    public static final String DARKEN = "Darken";
    public static final String FLIPX = "flipX";
    public static final String FLIPY = "flipY";
    public static final String INVERT = "invert";
    public static final String ROTATE = "rotate 90 degrees right";
    public static final String MIRROR = "mirror across y axis";
    private static final String SCALE50 = "Scale 50 %";
    private static final String BLUR = "Blur";
    private static final String RESET = "Reset";
    private static final String UNDO = "Undo";

    //Creates stack to hold transformations
    Stack transformation = new Stack();

    private String[] transformations;
    private static final int MAX_INTENSITY = 255;   // the value for pure white
    private static final int MIN_INTENSITY = 0;     // the value for pure black
    private static final int INTENSITY_STEP = 10;   // the value used to increase or decrease the brightness
    private int[][] pictureOriginal;
    private int[][] picture;

    /**
     * Construct a Transformer object by setting the possible transformations
     * available.
     */
    public Transformer() {
        super();

        this.transformations = new String[MIN_NUM_TRANS];
        this.transformations[0] = DARKEN;
        this.transformations[1] = FLIPX;
        this.transformations[2] = FLIPY;
        this.transformations[3] = INVERT;
        this.transformations[4] = ROTATE;
        this.transformations[5] = MIRROR;
        this.transformations[6] = SCALE50;
        this.transformations[7] = BLUR;
        this.transformations[8] = RESET;
        this.transformations[9] = UNDO;

    }

    /**
     * Construct a Transformer object by setting the possible transformations
     * available and initializing the state of the image.
     *
     * @param originalPic A 2-D array representing a grey scale image. The array
     * contains values from 0 - 255.
     */
    public Transformer(int[][] originalPic) {
        this();
        this.setPixels(originalPic);
    }

    /**
     * Get the image that was transformed.
     *
     * @return The pixels representing the image.
     */
    @Override
    public int[][] getPixels() {
        return ((this.picture));
    }

    /**
     * Set the image to be transformed to a new set of pixels.
     *
     * @param newPix The new image to be used for subsequent transformations.
     */
    @Override
    public void setPixels(int[][] newPix) {
        this.pictureOriginal = newPix;

        this.picture = this.copyArray(newPix);
    }

    /**
     * A array filled with the names of the transformations implemented by this
     * class.
     *
     * @return The array of transformation names.
     */
    @Override
    public String[] getTransformationNames() {
        return transformations;
    }

    public static void display(int[][] twoDArray) {
        for (int row = 0; row < twoDArray.length; row++) {
            for (int col = 0; col < twoDArray[row].length; col++) {
                if (twoDArray[row][col] == 0) {
                    System.out.print(" .");
                } else {
                    System.out.print(" O");
                }
            }
            System.out.println("");
        }
    }

    /**
     * Perform the transformation indicated.
     *
     * @param transformationName The name of the transformation to perform. Must
     * be one of the transformation names returned by {@link #getTransformationNames
     * getTransformationNames}.
     */
    public void performTransformation(String transformationName) {

        if (DARKEN.equals(transformationName)) {
            transformation.push(copyArray(this.picture));
            this.picture = changeIntensity(this.picture, -1 * INTENSITY_STEP);

        } else if (FLIPX.equals(transformationName)) {
            transformation.push(copyArray(this.picture));
            this.picture = flipX(this.picture);

        } else if (FLIPY.equals(transformationName)) {
            transformation.push(copyArray(this.picture));
            this.picture = flipY(this.picture);

        } else if (INVERT.equals(transformationName)) {
            transformation.push(copyArray(this.picture));
            this.picture = invert(this.picture);

        } else if (ROTATE.equals(transformationName)) {
            transformation.push(copyArray(this.picture));
            this.picture = rotate(this.picture);

        } else if (MIRROR.equals(transformationName)) {
            transformation.push(copyArray(this.picture));
            this.picture = mirror(this.picture);

        } else if (BLUR.equals(transformationName)) {
            transformation.push(copyArray(this.picture));
            this.picture = blur(this.picture);

        } else if (SCALE50.equals(transformationName)) {
            transformation.push(copyArray(this.picture));
            this.picture = scale50(this.picture);

        } else if (RESET.equals(transformationName)) {

            this.picture = copyArray(this.pictureOriginal);

        } else if (UNDO.equals(transformationName)) {

            this.picture = undo();

        } else {
            throw new Error("Invalid transformation requested.");
        }
    }

    /**
     * TODO: ICS4U PERFORMANCE TASK
     */
    //Method to Copy Array
    private int[][] copyArray(int[][] a) {

        //Gets the dimensions of a (argument)
        //Column size
        int Column = a.length;

        //Row size
        int Row = a[0].length;

        //Array that will copy the argument - sets it to dimensions of argument array
        int[][] copy = new int[Column][Row];

        //For loop to iterate through the array
        //Iterates through the columns
        for (int c = 0; c < Column; c++) {

            //Iterates through the rows
            for (int r = 0; r < Row; r++) {

                //Sets individual values to copy of array
                copy[c][r] = a[c][r];

            }

        }

        //Returns copy array
        return copy;
    }

    /**
     * TODO: ICS4U PERFORMANCE TASK
     *
     * Darken or Brighten based on the step size.
     *
     */
    //Method that changes (bright/dark) based on stepsize
    private int[][] changeIntensity(int[][] sourcePixels, int stepSize) {

        // TO DO
        //Variables
        //Sets max and min of how much intensity can go (max:255) , (min : 0)
        //max
        int max = MAX_INTENSITY;

        //min
        int min = MIN_INTENSITY;

        //Add or subtract intensity (10) based on stepsize
        int intensity = INTENSITY_STEP;

        //Gets the dimensions of sourcepixels (argument)
        //Column size
        int Column = sourcePixels.length;

        //Row size
        int Row = sourcePixels[0].length;

        //For loop to iterate through the array
        //Iterates through the columns
        for (int c = 0; c < Column; c++) {

            //Iterates through the rows
            for (int r = 0; r < Row; r++) {

                //if statement to check it does'nt go over max or min near min increase
                if (stepSize > min) {

                    sourcePixels[c][r] = sourcePixels[c][r] + intensity;

                    //If its below max then decrease (near)   
                } else if (stepSize < max) {

                    sourcePixels[c][r] = sourcePixels[c][r] - intensity;

                }

            }

        }

        return sourcePixels;
    }

    /**
     * TODO: ICS4U PERFORMANCE TASK
     */
    //Method to invert the picture
    private int[][] invert(int[][] sourcePixels) {
        // TO DO

        //Gets the dimensions of a (argument)
        //Column size
        int Column = sourcePixels.length;

        //Row size
        int Row = sourcePixels[0].length;

        //Copies the array
        int[][] copyArray = copyArray(sourcePixels);

        //For loop to iterate through the array in sequential order
        //Iterates through the columns
        for (int r = 0; r < Row; r++) {

            //Iterates through the rows
            for (int c = 0; c < Column; c++) {

                //Goes reverse for column and row
                copyArray[c][r] = sourcePixels[sourcePixels.length - 1 - c][Row - 1 - r];

            }

        }

        return copyArray;
    }

    /**
     * TODO: ICS4U PERFORMANCE TASK
     */
    //Method to flip the picture across the x axis
    private int[][] flipX(int[][] sourcePixels) {
        // TO DO

        //Gets the dimensions of a (argument)
        //Column size
        int Column = sourcePixels.length;

        //Row size
        int Row = sourcePixels[0].length;

        //Copies the array
        int[][] copyArray = copyArray(sourcePixels);

        //For loop to iterate through the array in sequential order
        //Iterates through the columns
        for (int r = 0; r < Row; r++) {

            //Iterates through the rows
            for (int c = 0; c < Column; c++) {

                //Goes reverse for column
                copyArray[c][r] = sourcePixels[c][Row - 1 - r];

            }

        }

        return copyArray;
    }

    /**
     * TODO: ICS4U PERFORMANCE TASK
     */
    //Method to flip the picture across the y axis 
    private int[][] flipY(int[][] sourcePixels) {
        // TO DO

        //Gets the dimensions of a (argument)
        //Column size
        int Column = sourcePixels.length;

        //Row size
        int Row = sourcePixels[0].length;

        //Copies the array
        int[][] copyArray = copyArray(sourcePixels);

        //For loop to iterate through the array in sequential order
        //Iterates through the columns
        for (int r = 0; r < Row; r++) {

            //Iterates through the rows
            for (int c = 0; c < Column; c++) {

                //Goes reverse for row
                copyArray[c][r] = sourcePixels[sourcePixels.length - 1 - c][r];

            }

        }

        return copyArray;
    }

    /**
     * TODO: ICS4U PERFORMANCE TASK
     */
    //Method to rotate right (90 degrees)
    private int[][] rotate(int[][] sourcePixels) {

        // TO DO
        //Gets the dimensions of a (argument)
        //Column size
        int Column = sourcePixels.length;

        //Row size
        int Row = sourcePixels[0].length;

        //For loop to iterate through the array in sequential order
        //Iterates through the columns
        for (int r = 0; r < Row; r++) {

            //Iterates through the rows
            for (int c = 0; c < Column; c++) {

                //rotates each pixel
                if (r > 0 && r < sourcePixels.length - 1) {
                    sourcePixels[c][r] = sourcePixels[r - 1][c + 1];
                }
            }

        }

        return sourcePixels;
    }

    /**
     * TODO: ICS4U PERFORMANCE TASK
     */
//Mirror across y axis
    private int[][] mirror(int[][] sourcePixels) {

        // TO DO
        //Gets the dimensions of a (argument)
        //Column size
        int Row = sourcePixels.length;

        //Row size
        int Column = sourcePixels[0].length;

        //Doubles the size of picture (y range) to mirror
        int[][] canvas = new int[Row * 2][Column];

        //For loop to iterate through the array in sequential order
        //expands the picture (row) to mirror
        for (int r = 0; r < Row; r++) {

            //Expands the picture (column) to mirror
            for (int c = 0; c < Column; c++) {

                canvas[r][c] = sourcePixels[r][c];
                canvas[canvas.length - r - 1][c] = sourcePixels[r][c];

            }

        }

        return canvas;
    }

    /**
     * TODO: ICS4U PERFORMANCE TASK
     */
    private int[][] scale50(int[][] sourcePixels) {

         // TO DO
        //Gets the dimensions of a (argument)
        //Column size
        int Row = sourcePixels.length;

        //Row size
        int Column = sourcePixels[0].length;

        //Doubles the size of picture (y range) to mirror
        int[][] canvas = new int[Row * 2][Column * 2];

        //For loop to iterate through the array in sequential order
        //expands the picture (row) to mirror
        for (int r = 0; r < Row; r++) {

            //Expands the picture (column) to mirror
            for (int c = 0; c < Column; c++) {

                canvas[r*2][c*2] = sourcePixels[r][c];
                

            }

        }

        return canvas;
    }

    /**
     * TODO: ICS4U PERFORMANCE TASK
     */
    private int[][] blur(int[][] sourcePixels) {

        // TO DO
        //Gets the dimensions of a (argument)
        //Column size
        int Row = sourcePixels.length;

        //Row size
        int Column = sourcePixels[0].length;

        int averageValue = 0;

        //For loop to iterate through the array in sequential order
        //expands the picture (row) to mirror
        for (int r = 0; r < Row; r++) {

            //Expands the picture (column) to mirror
            for (int c = 1; c < Column - 1; c++) {

                //Exceptions to getting average r == 0 , length - 1 - row etc
                if (r == 0) {

                    //Gets the average of the values surounding the pixels
                    averageValue = (sourcePixels[r + 1][c] + sourcePixels[r][c + 1] + sourcePixels[r][c - 1]) / 3;

                    //Sets pixel to average value
                    sourcePixels[r][c] = averageValue;

                } else if (r == Row - 1) {

                    //Gets the average of the values surounding the pixels
                    averageValue = (sourcePixels[r][c + 1] + sourcePixels[r - 1][c] + sourcePixels[r][c - 1]) / 3;

                    //Sets pixel to average value
                    sourcePixels[r][c] = averageValue;

                    //Gets the average of the values surounding the pixels   
                } else {
                    averageValue = (sourcePixels[r + 1][c] + sourcePixels[r][c + 1] + sourcePixels[r - 1][c] + sourcePixels[r][c - 1]) / 4;
                }

                //Sets pixel to average value
                sourcePixels[r][c] = averageValue;

            }
        }

        //Returns blurred version
        return sourcePixels;
    }

//Reset method
    private int[][] reset(int[][] sourcePixels) {

        //Returns original and sets it to sourcePixels resetting everything
        sourcePixels = pictureOriginal;
        return sourcePixels;

    }

    //Undo Method
    private int[][] undo() {

        this.picture = (int[][]) transformation.pop();
        return this.picture;

    }

    /**
     * TODO: ICS4U PERFORMANCE TASK
     */
    public static void main(String[] args) {

        int[][] myPicture = new int[4][15];

        myPicture[0][0] = 1;
        myPicture[1][1] = 1;
        myPicture[2][2] = 1;
        myPicture[3][3] = 1;
        myPicture[2][4] = 1;
        myPicture[1][5] = 1;
        myPicture[2][6] = 1;
        myPicture[3][7] = 1;
        myPicture[2][8] = 1;
        myPicture[1][9] = 1;
        myPicture[0][10] = 1;

//       Construct the test object
        Transformer test = new Transformer(myPicture);

//       Display Original Image
        System.out.println("Original\n");
        display(myPicture);
//
        //Test flip on X-axis
        System.out.println("\nFlipped on the X axis.\n");
        test.performTransformation(FLIPX);
        display(test.getPixels());
//
//       Test flip on Y-axis
        System.out.println("\nFlipped on the Y axis.\n");
        test.performTransformation(FLIPY);
        display(test.getPixels());
//
////       Test Rotate 90 degrees
        System.out.println("\nRotated 90 degrees.\n");
        test.performTransformation(ROTATE);
        display(test.getPixels());
//
//       Test Rotate Scale 50%
        System.out.println( "\nScaled 50%.\n" );
        test.performTransformation( SCALE50 );
        display( test.getPixels() );
//
//       Test Mirror Image
        System.out.println("\nMirror image.\n");
        test.performTransformation(MIRROR);
        display(test.getPixels());
//
//       Test Reset
        System.out.println("\nReset image.\n");
        test.performTransformation(RESET);
        display(test.getPixels());

    }

}
