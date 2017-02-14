/*
 +* Name: Zohaib Ahmad
 
 + * Date : Monday , February 13 , 2017
 
 + * Version : v0.01

 + * Description : Rotten Tomatoes Part One

 */
package edu.hdsb.gwss.zohaib.ics4u.u1;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 *
 * @author 1ahmadzoh
 */
public class RottenTomatoesP1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        //Objects

        Scanner input = new Scanner(System.in);
        
        Scanner fileReader = new Scanner(new FileReader("MovieReviews.txt"));

        //Variables
        String word;
        
        int repeat;
        
        double moviereview;
        
        String line = fileReader.nextLine();

        //Intro
        System.out.println("Movie Reviews \n"
                + "--------------------------------------------------------");
        
        System.out.print("Enter a word : ");
        
        word = input.nextLine();
        
        repeat = 0;

        // Loop
        while (fileReader.hasNext()) {
            
            if (fileReader.next().toUpperCase().equals(word.toUpperCase())) {
                repeat++;
               // fileReader.index(0);
            }
            
        }
        
        //Calculation for average 
        
        System.out.println("The word " + " ' " + word + " ' " + " repeats " + repeat
                + " times");
        
    }
    
}
