/*
 * Mountain Paths - Greedy Algorithm
 * Mr. Muir
 * 2017.01.24 - v1.0
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
        System.out.println("TASK 1: READ DATA");
        //Variables
        int row = 0;
        int col = 0;
        // TODO
        Scanner file = new Scanner(".\\data\\mountain.paths\\Colorado.480x480.dat");
        
        
        String line = file.nextLine();
        
        StringTokenizer st = new StringTokenizer(line);
        
        while(st.hasMoreTokens()){
            
            col++;
            
        }
        
        while (file.hasNextLine()) {

            row++;

        }
        
        data = new int[col][row];
        
        System.out.println(data);
        

//        // ***********************************
//        // Construct DrawingPanel, and get its Graphics context
//        //
//        DrawingPanel panel = new DrawingPanel( data[0].length, data.length );
//        Graphics g = panel.getGraphics();
//
//        // ***********************************
//        // TASK 2:  find HIGHEST & LOWEST elevation; for GRAY SCALE
//        //
//        System.out.println( "TASK 2: HIGHEST / LOWEST ELEVATION" );
//        int min = findMinValue( data );
//        System.out.println( "\tMin: " + min );
//
//        int max = findMaxValue( data );
//        System.out.println( "\tMax: " + max );
//
//        // ***********************************
//        // TASK 3:  Draw The Map
//        //
//        System.out.println( "TASK 3: DRAW MAP" );
//        drawMap( g, data );
//
//        // ***********************************
//        // TASK 4:  implement indexOfMinInCol
//        //
//        System.out.println( "TASK 4: INDEX OF MIN IN COL 0" );
//        int minRow = indexOfMinInCol( data, 0 );
//        System.out.println( "\tRow with lowest Col 0 Value: " + minRow );
//
//        // ***********************************
//        // TASK 4:  use minRow as starting point to draw path
//        //
//        System.out.println( "TASK 5: PATH from LOWEST STARTING ELEVATION" );
//        g.setColor( Color.RED );
//        int totalChange = drawLowestElevPath( g, data, minRow ); //
//        System.out.println( "\tLowest-Elevation-Change Path starting at row " + minRow + " gives total change of: " + totalChange );
//
//        // ***********************************
//        // TASK 5:  determine the BEST path
//        //
//        g.setColor( Color.RED );
//        int bestRow = indexOfLowestElevPath( g, data );
//
//        // ***********************************
//        // TASK 6:  draw the best path
//        //
//        System.out.println( "TASK 6: DRAW BEST PATH" );
//        //drawMap.drawMap(g); //use this to get rid of all red lines
//        g.setColor( Color.GREEN ); //set brush to green for drawing best path
//        totalChange = drawLowestElevPath( g, data, bestRow );
//        System.out.println( "\tThe Lowest-Elevation-Change Path starts at row: " + bestRow + " and gives a total change of: " + totalChange );
    }

    /**
     * This method reads a 2D data set from the specified file. The Graphics'
     * industry standard is width by height (width x height), while programmers
     * use rows x cols / (height x width).
     *
     * @param fileName the name of the file
     * @return a 2D array (rows x cols) of the data from the file read
     */
    public static int[][] read(String fileName) {
        int[][] data = null;

        //Variables
        int row = 0;
        int col = 0;
        // TODO
        Scanner file = new Scanner(".\\data\\mountain.paths\\Colorado.480x480.dat");

        while (file.hasNextLine()) {

            row++;

        }

        return data;
    }

    /**
     * @param grid a 2D array from which you want to find the smallest value
     * @return the smallest value in the given 2D array
     */
    public static int findMinValue(int[][] grid) {

        // TODO
        return -1;

    }

    /**
     * @param grid a 2D array from which you want to find the largest value
     * @return the largest value in the given 2D array
     */
    public static int findMaxValue(int[][] grid) {

        // TODO
        return -1;

    }

    /**
     * Given a 2D array of elevation data create a image of size rows x cols,
     * drawing a 1x1 rectangle for each value in the array whose color is set to
     * a a scaled gray value (0-255). Note: to scale the values in the array to
     * 0-255 you must find the min and max values in the original data first.
     *
     * @param g a Graphics context to use
     * @param grid a 2D array of the data
     */
    public static void drawMap(Graphics g, int[][] data) {
        // TODO
    }

    /**
     * Scan a single column of a 2D array and return the index of the row that
     * contains the smallest value
     *
     * @param grid a 2D array
     * @col the column in the 2D array to process
     * @return the index of smallest value from grid at the given col
     */
    public static int indexOfMinInCol(int[][] grid, int col) {
        // TODO
        return -1;
    }

    /**
     * Find the minimum elevation-change route from West-to-East in the given
     * grid, from the given starting row, and draw it using the given graphics
     * context
     *
     * @param g - the graphics context to use
     * @param grid - the 2D array of elevation values
     * @param row - the starting row for traversing to find the min path
     * @return total elevation of the route
     */
    public static int drawLowestElevPath(Graphics g, int[][] data, int row) {

        // TODO
        return -1;
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
    public static int indexOfLowestElevPath(Graphics g, int[][] data) {

        // TODO
        return -1;
    }

}
