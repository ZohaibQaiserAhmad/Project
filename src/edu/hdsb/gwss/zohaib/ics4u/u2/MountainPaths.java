/*
 * Mountain Paths - Greedy Algorithm
 * Zohaib Ahmad
 *  Saturday , April 1st - v2.0

 */
package edu.hdsb.gwss.zohaib.ics4u.u2;

import java.util.*;
import java.io.*;
import java.awt.*;

public class MountainPaths {

    /**
     * Mount Paths
     */
    public static void main(String[] args) throws Exception {

        // ***********************************
        // TASK 1:  read data into a 2D Array
        // 
        System.out.println("TASK 1: READ DATA");
        int[][] data = read("Colorado.844x480.dat");

//        // TODO
//        // ***********************************
        // Construct DrawingPanel, and get its Graphics context
//        
        DrawingPanel panel = new DrawingPanel(data[0].length, data.length);
        Graphics g = panel.getGraphics();
//
//        // ***********************************
//        // TASK 2:  find HIGHEST & LOWEST elevation; for GRAY SCALE
//      
        //Prints out "Task 2: Highest/Lowest Elevation"
        System.out.println("TASK 2: HIGHEST / LOWEST ELEVATION");

        //Calls upon "findMinValue(data)" to get minimum value
        int min = findMinValue(data);

        //Prints out value of min
        System.out.println("\tMin: " + min);

        //Calls upon "findMaxValue(data)" to get maxium value
        int max = findMaxValue(data);

        //Prints out value of Maximum
        System.out.println("\tMax: " + max);
//
//        // ***********************************
//        // TASK 3:  Draw The Map
        //Prints out "Task 3: Draw Map"
        System.out.println("TASK 3: DRAW MAP");

        //draws the map using calculated grey scale and data
        drawMap(g, data);
//
//        // ***********************************
//        // TASK 4:  implement indexOfMinInCol

        //Prints out "Task 4: Index of min in Col 0"
        System.out.println("TASK 4: INDEX OF MIN IN COL 0");

        //sets a variable "minRow" to indexOfMinInCol at (data , 0);
        int minRow = indexOfMinInCol(data, 0);

        //Prints the value of lowest col 0 value using minRow value
        System.out.println("\tRow with lowest Col 0 Value: " + minRow);
//
//        // ***********************************
//        // TASK 4:  use minRow as starting point to draw path

        //Prints "Task 5 : Path from Lowest starting elevation "
        System.out.println("TASK 5: PATH from LOWEST STARTING ELEVATION");

        //sets the color to red
        g.setColor(Color.RED);

        //Sets variable "totalChange" to the value of the function drawLowestElevPath(g,data,minRow), where g is color we set (red) and data is data read from file and minRow is calculated using indexOfMinInCol
        int totalChange = drawLowestElevPath(g, data, minRow);

        //Prints out "\tLowest-Elevation-Change Path starting at row + minRow value + gives total change of: + totalChange value"
        System.out.println("\tLowest-Elevation-Change Path starting at row " + minRow + " gives total change of: " + totalChange);
//
//        // ***********************************
//        // TASK 5:  determine the BEST path
        //Sets color to red
        g.setColor(Color.RED);

        //Finds the index of best row
        int bestRow = indexOfLowestElevPath(g, data);

        // TASK 6:  draw the best path
        //Prints out "'TASK 6: DRAW BEST PATH'"
        System.out.println("TASK 6: DRAW BEST PATH");

        //Sets color to green
        g.setColor(Color.GREEN);

        //returns total change of best row
        totalChange = drawLowestElevPath(g, data, bestRow);

        //Prints out best row index with its total change
        System.out.println("\tThe Lowest-Elevation-Change Path starts at row: " + bestRow + " and gives a total change of: " + totalChange);
        /**
         * This method reads a 2D data set from the specified file. The
         * Graphics' industry standard is width by height (width x height),
         * while programmers use rows x cols / (height x width).
         *
         * @param fileName the name of the file
         * @return a 2D array (rows x cols) of the data from the file read
         */
    }

    //Creates a function "public static int[][]" which will be used to read the file and throws an exception if file not found
    public static int[][] read(String fileName) throws FileNotFoundException {

        //Creates a 2D array "data"
        int[][] data;

        //creates a scanner to read file
        Scanner file = new Scanner(new File(fileName));

        //Variables
        //Create integer variable "row" and sets it to 0
        int row = 0;

        //Creates integer variable COl
        int col;

        //Creates a string of which will be used to read each line of the file
        String line = file.nextLine();

        //Tokenizes the line inorder to seperate each piece of data
        StringTokenizer st = new StringTokenizer(line);

        //Sets col to each piece of data (column) the y portion of the data
        col = st.countTokens();

        //While the file has a next line do this
        while (file.hasNextLine()) {

            //Increase the row each time the while loop is called
            row++;

            //move to the next line once row is increased
            file.nextLine();

        }

        //Sets 2D array data to new int with the size of row by col (844 by 480)
        data = new int[row][col];

        //Creates a new scanner of which is used to input each piece of data into the 2D array
        Scanner files = new Scanner(new File(fileName));

        //for loop (for, sets i to 0 , while i is less then row value, increase i)
        for (int i = 0; i < row; i++) {

            //Nested for loop , set j to 0 , while j is less then col value , increase j
            for (int j = 0; j < col; j++) {

                //if file has a next int (piece of data)
                if (files.hasNextInt()) {

                    //Subs the int value into the 2D array
                    data[i][j] = files.nextInt();

                }

            }

        }

        //Returns the 2D array with its values stored of which was gathered from file
        return data;

    }

    /**
     * @param grid a 2D array from which you want to find the smallest value
     * @return the smallest value in the given 2D array
     */
    //Function of which will be used to find minimum value in data
    public static int findMinValue(int[][] data) {

        //Sets minimum value to  data at position (0,0)
        int min = data[0][0];

        //for loop , int j is equal to o, j has to be less then data at the row specified [0] length , increase j each time (j++)
        for (int j = 0; j < data[0].length; j++) {

            //For loop of which is used to iterate through the data and find minimum value
            for (int[] data1 : data) {

                //If data at j is less then min then data at position specified then j becomes new minimum
                if (data1[j] < min) {
                    min = data1[j];
                }
            }

        }

        //Return value of min
        return min;

    }

    /**
     * @param grid a 2D array from which you want to find the largest value
     * @return the largest value in the given 2D array
     */
    //Function of which will be used to find maximim value in data
    public static int findMaxValue(int[][] data) {

        // Sets maximum value to data at position (0,0);
        int max = data[0][0];

        //For loop , j is equal to 0 , j has to be less then data at row specified [0], increase j each time (j++)
        for (int j = 0; j < data[0].length; j++) {

            //For loop of which is used to iterate through the data and find maximum value
            for (int[] data1 : data) {

                //If data at j is more then data at position specified then j becomes new maximum 
                if (data1[j] > max) {
                    max = data1[j];
                }
            }

        }

        //Returns value of maximum
        return max;

    }

    /**
     * Given a 2D array of elevation data create a image of size rows x cols,
     * drawing a 1x1 rectangle for each value in the array whose color is set to
     * a a scaled gray value (0-255). Note: to scale the values in the array to
     * 0-255 you must find the min and max values in the original data first.
     *
     * @param g a Graphics context to use
     * @param data
     */
    //Creates function drawMap of which will be used to create the map via data 
    public static void drawMap(Graphics g, int[][] data) {

        //Minimum is equal to return value from function of findMinValue 
        int min = findMinValue(data);

        //Maximum is equal to return value from function of findMaxValue
        int max = findMaxValue(data);

        //Create a double "scale" of which will be calculated by dividing 255.0 by max - min
        double scale = 255.0 / (max - min);

        //Creates a 2D array of which will have the same dimensions as data
        int[][] greyscale = new int[data.length][data[0].length];

        //For loop , int i is equal to 0 , i has to be less then data.length , increas i each time ( goes through each row)
        for (int i = 0; i < data.length; i++) {

            //Nested for loop of which will be used to go through the column
            for (int j = 0; j < data[0].length; j++) {

                //grey scale at point i(row value) and j(column value) is equal to data[i][j] - min value time the scale
                greyscale[i][j] = (int) (((data[i][j]) - min) * scale);

                //Int c (color) is equal to grey scale value
                int c = greyscale[i][j];

                //Sets the color to c at that pont
                g.setColor(new Color(c, c, c));

                //Fills the map with shade of grey of which was calculated
                g.fillRect(j, i, 1, 1);

            }
        }
    }

    /**
     * Scan a single column of a 2D array and return the index of the row that
     * contains the smallest value
     *
     * @param grid a 2D array
     *
     * @col the column in the 2D array to process
     * @return the index of smallest value from grid at the given col
     */
    //Creates function (indexOfMinInCol) which holds data , and col 
    public static int indexOfMinInCol(int[][] data, int col) {

        //Sets value of min to data at 0 row and col
        int min = data[0][col];
        //Creates variable minRow and sets it to 0
        int minRow = 0;
        //For loop , int i is equal to 1 , while i is less then data.length , i++
        for (int i = 1; i < data.length; i++) {

            //if data at i and col specified is less then min , min is equal to data[i][col] , and minRow is equal to i
            if (data[i][col] < min) {

                min = data[i][col];
                minRow = i;

            }

        }
        //Return minRow
        return minRow;
    }

    /**
     * Find the minimum elevation-change route from West-to-East in the given
     * grid, from the given starting row, and draw it using the given graphics
     * context
     *
     * @param g - the graphics context to use
     * @param data
     * @param row - the starting row for traversing to find the min path
     * @return total elevation of the route
     */
    //Creates function "drawLowestElevPath" of which will be used to draw lowest elev path of each row
    public static int drawLowestElevPath(Graphics g, int[][] data, int row) {

        //Creates variable total Change and sets it to 0
        int totalChange = 0;

        //Creates variable smallestDif and sets it to 0
        int smallestDiff = 0;

        //Creates an array and sets it to integer type with size of 3
        int[] value = new int[3];

        //For loop, int col is equal to 0 , col has to be less then data at 0 length - 1, col ++ , This will be used to move the column as in every move the column is moved forward
        for (int col = 0; col < data[0].length - 1; col++) {

            //If row is greater then 0 and row is less then data.length - 1 then do this
            if (row > 0 && row < data.length - 1) {

                //Value at 0 is equal to the absolute value of data at forward up - current position : data at row - 1, column plus one - data at current row and column
                value[0] = Math.abs(data[row - 1][col + 1] - data[row][col]);

                //Value at 1 is equal to absolute value of data at forward - current position : data at row, column plus one - data at current row and column
                value[1] = Math.abs(data[row][col + 1] - data[row][col]);

                //Value at 2 is equal to absolute value of data at forward down - current position : data at row plus one , column plus one - data at current row and column
                value[2] = Math.abs(data[row + 1][col + 1] - data[row][col]);

            }

            //Sets smallest Difference to value at 0 from array
            smallestDiff = value[0];

            //For loop , int i is equal to 0 , i has to be less then value.length (3) , i ++
            for (int i = 0; i < value.length; i++) {

                //If value at i is less then smallest Difference , then value at i is equal to smallest Difference
                if (value[i] < smallestDiff) {

                    smallestDiff = value[i];

                }
            }

            //CoinFlip (If forwardUp difference is equal to forwardDOwn difference)
            //If smallest difference is equal to value at 0 (forwardUp difference) and equal to value at 2 (forwardDown difference) then do this
            if (smallestDiff == value[0] && smallestDiff == value[2]) {

                //Creates a integer of which will generate a random number between 1 and 10
                int random = (int) (Math.random() * 10 + 1);

                //If the number is less then 5
                if (random < 5) {

                    //Move forwardDown  (increase the row by one)
                    row = row + 1;

                    //Else if the number is greater then 5
                } else if (random > 5) {

                    //Move forwardUp (decrease the row by one)
                    row = row - 1;

                }

            }
            //Down

            //If the smallest Difference is equal to value at 2 then do this
            if (smallestDiff == value[2]) {

                //Increase the row by one (Move forwardDown)
                row = row + 1;

            }
            //Up

            //If the smallest Difference is equal to value at 0 then do this
            if (smallestDiff == value[0]) {

                //Decrease the row by one (Move forwardUp)
                row = row - 1;

            }

            //Total change is equal to totalChange plus the smallestDifference
            totalChange = totalChange + smallestDiff;

            //Fill the col and row by color specified when function is called
            g.fillRect(col, row, 1, 1);

        }
        //Return the value of total change when function is called
        return totalChange;
    }

    /**
     * Generate all west-to-east paths, find the one with the lowest total
     * elevation change, and return the index of the row that path starts on.
     *
     * @param g - the graphics context to use
     * @param grid - the 2D array of elevation values
     * @return the index of the row where the lowest elevation-change path
     * starts.
     */
    //Creates a function of which will be used to get the index of lowest elev path (best path)
    public static int indexOfLowestElevPath(Graphics g, int[][] data) {

        //Creates a variable index and sets it to 0
        int index = 0;

        //Creates a variable least
        int least;

        //For loop , int i is equal to 0 , i has to be less then data.length, i plus one
        for (int i = 0; i < data.length; i++) {

            //Int change is equal to function return of drawLowestElevPath at data and i : g is parameter for color
            int change = drawLowestElevPath(g, data, i);

            //If the change is less then drawLowestElevPath at data, position 0 then do this
            if (change < drawLowestElevPath(g, data, 0)) {

                //Least is equal to change
                least = change;

                //Sets the index value to i
                index = i;
            }
        }

        //Returns the index value
        return index;

    }

}
