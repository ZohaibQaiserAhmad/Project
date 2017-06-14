/*
 +* Name: Zohaib Ahmad
 
 + * Date : Wednesday , June 14 , 2017
 
 + * Version : v0.02

 + * Description : Final performance task (transformer) : adds basics of photoshop
through methods

 */
package edu.hdsb.gwss.zohaib.ics4u.pt;

import becker.xtras.imageTransformation.ITransformations;

public class Transformer extends Object implements ITransformations {

    public static final int MIN_NUM_TRANS = 6;
    public static final String DARKEN = "Darken";
    public static final String FLIPX = "flipX";
    public static final String FLIPY = "flipY";
    public static final String INVERT = "invert";
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
            this.picture = changeIntensity(this.picture, -1 * INTENSITY_STEP);
        } else if (FLIPX.equals(transformationName)) {

            this.picture = flipX(this.picture);

        } else if (FLIPY.equals(transformationName)) {

            this.picture = flipY(this.picture);

        } else if (INVERT.equals(transformationName)) {

            this.picture = invert(this.picture);

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
    private int[][] rotate(int[][] sourcePixels) {
        // TO DO
        return new int[1][1];
    }

    /**
     * TODO: ICS4U PERFORMANCE TASK
     */
    private int[][] mirror(int[][] sourcePixels) {
        // TO DO
        return new int[1][1];
    }

    /**
     * TODO: ICS4U PERFORMANCE TASK
     */
    private int[][] scale50(int[][] sourcePixels) {
        // TO DO
        return new int[1][1];
    }

    /**
     * TODO: ICS4U PERFORMANCE TASK
     */
    private int[][] blur(int[][] sourcePixels) {
        // TO DO
        return new int[1][1];
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
////       Test flip on Y-axis
//        System.out.println( "\nFlipped on the Y axis.\n" );
//        test.performTransformation( FLIPY );
//        display( test.getPixels() );
//
////       Test Rotate 90 degrees
//        System.out.println( "\nRotated 90 degrees.\n" );
//        test.performTransformation( ROTATE );
//        display( test.getPixels() );
//
////       Test Rotate Scale 50%
//        System.out.println( "\nScaled 50%.\n" );
//        test.performTransformation( SCALE50 );
//        display( test.getPixels() );
//
////       Test Mirror Image
//        System.out.println( "\nMirror image.\n" );
//        test.performTransformation( MIRROR );
//        display( test.getPixels() );
//
////       Test Reset
//        System.out.println( "\nReset image.\n" );
//        test.performTransformation( RESET );
//        display( test.getPixels() );

    }

}
