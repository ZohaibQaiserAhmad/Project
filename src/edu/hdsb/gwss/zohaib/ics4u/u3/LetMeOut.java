/*
 * Name: Zohaib Ahmad           Let Me Out
 * Date:            March, 2017
 * V2
 * Creating a path to the exit through recursion in a generated maze
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
     *
     * @param row
     * @param col
     * @return
     */
    public boolean findExitFrom(int row, int col) {
        boolean successful = false;

        //Check if you are at the exit
        if (maze[row][col] == EXIT) {
            
            //If maze at row and col is exit then it is apart of good path
            maze[row][col] = GOOD_PATH;
            
            //return true
            return true;

        }
        
        //If none of the statements worked then row and col is apart of tried
        maze[row][col] = TRIED;

        //If statement for right : if maze at row and col to right is equal to exit and open do this
        if (maze[row][col + 1] == EXIT || maze[row][col + 1] == OPEN) {
            
            //successful  is equal to method at row and col to right (recursion)
            successful = findExitFrom(row, col + 1);

        }

        //If statement for down : if maze at row -1 and same col is equal to exit and open do this
        if (!successful && maze[row + 1][col] == EXIT || maze[row + 1][col] == OPEN) {
            
            //successful is equal to method at row+1 and col (recursion)
            successful = findExitFrom(row + 1, col);

        }

        //If statement for left : if maze at same row and col to left is equal to exit and open do this
        if (!successful && maze[row][col - 1] == EXIT || maze[row][col - 1] == OPEN) {
            
            //successful is equal to method at row , and col to left (recursion)
            successful = findExitFrom(row, col - 1);

        }
        
        //If statement for  up : if maze and row above and same col is equal to exit and open do this
        if (!successful && maze[row - 1][col] == EXIT || maze[row - 1][col] == OPEN) {
            
            //successful is equal to row above and same col (recursion)
            successful = findExitFrom(row - 1, col);

        }
        
        //If successful do this
        if (successful) {
            //Maze at row and col is apart of good path
            maze[row][col] = GOOD_PATH;
        }
        
        //return successful 
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
