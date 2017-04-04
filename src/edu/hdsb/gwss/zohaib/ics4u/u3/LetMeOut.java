/*
 * Name: Zohaib Ahmad           Let Me Out
 * Date:            March, 2017
 */
package edu.hdsb.gwss.zohaib.ics4u.u3;

public class LetMeOut {

    private static final char WALL = 'W';
    private static final char EXIT = 'X';
    private static final char OPEN = '.';
    private static final char TRIED = '-';
    private static final char GOOD_PATH = '+';

    private char[][] maze = {
        {'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W'},
        {'W', '.', '.', '.', 'W', '.', '.', '.', '.', '.', '.', '.', '.', 'W'},
        {'W', '.', 'W', '.', 'W', '.', 'W', 'W', 'W', '.', 'W', 'W', 'W', 'W'},
        {'W', '.', 'W', '.', '.', '.', 'W', 'W', '.', '.', '.', '.', 'W', 'W'},
        {'W', 'W', 'W', '.', 'W', '.', 'W', 'W', '.', 'W', 'W', 'W', 'W', 'W'},
        {'W', '.', 'W', 'W', 'W', 'W', 'W', '.', '.', '.', '.', '.', 'W', 'W'},
        {'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W'}
    };

    /**
     * Display the current maze.
     * @param row
     * @param col
     * @return 
     */
    public boolean findExitFrom(int row, int col) {
        boolean successful = false;
        
        //Check if you are at the exit
        if (maze[row][col] == EXIT) {
            
           
            return successful;

        }
        
        //Right
     
        if(maze[row][col + 1] == OPEN || maze[row][col + 1] == EXIT){
            
            col++;
            successful = findExitFrom(row , col);
           
        }
        
       
        
        //Down
        if(maze[row++][col] == OPEN || maze[row++][col] == EXIT){
            
            row ++;
            successful = findExitFrom(row , col);
          
        }
        
        //Up
        if(maze[row--][col] == OPEN || maze[row--][col] == EXIT){
            
            row --;
            successful = findExitFrom(row  , col);
          
            
        }
        
        
        //Left
        
        if(maze[row][col --] == OPEN || maze[row][col --] == EXIT){
            col--;
            successful = findExitFrom(row, col);
         
            
        }
        
        
        return successful;

    }

    /**
     * Display the current maze.
     */
    public void solve() {

        // VARIABLES
        int row = -1;
        int col = -1;

        // FIND RANDOM EXIT
        boolean exitPlaced = false;
        int wall = 3; // (int) (Math.random() * 4);

        do {
            switch (wall) {
                case 0:  // RIGHT EDGE
                    row = (int) (Math.random() * maze.length);
                    col = maze[0].length - 1;
                    if (maze[row][col - 1] == OPEN) {
                        exitPlaced = true;
                    }
                    break;
                case 1:  // BOTTOM EDGE
                    row = maze.length - 1;
                    col = (int) (Math.random() * maze[0].length);
                    if (maze[row - 1][col] == OPEN) {
                        exitPlaced = true;
                    }
                    break;
                case 2:  // LEFT EDGE
                    row = (int) (Math.random() * maze.length);
                    col = 0;
                    if (maze[row][col + 1] == OPEN) {
                        exitPlaced = true;
                    }
                    break;
                case 3:  // TOP EDGE
                    row = 0;
                    col = (int) (Math.random() * maze[0].length);
                    if (maze[row + 1][col] == OPEN) {

                        exitPlaced = true;
                    }
                    break;
            }
        } while (!exitPlaced);

        maze[row][col] = EXIT;

        // FIND RANDOM START LOCATION
        do {
            row = (int) (Math.random() * maze.length);
            col = (int) (Math.random() * maze[0].length);
        } while (maze[row][col] != OPEN);

        // START!
        System.out.println("START LOCATION: (" + row + "," + col + ")");
        findExitFrom(row, col);

        // SHOW EXIT
        displayMaze();

    }

    /**
     * Display the current maze.
     */
    public void displayMaze() {
        for (int row = 0; row < maze.length; row++) {
            for (int col = 0; col < maze[row].length; col++) {
                System.out.print(maze[row][col]);
            }
            System.out.println();
        }
        System.out.println("-------------------------------");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        LetMeOut lmo = new LetMeOut();
        lmo.displayMaze();
        lmo.solve();

    }

}
