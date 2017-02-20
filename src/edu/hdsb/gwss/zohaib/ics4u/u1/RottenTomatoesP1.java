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

public class RottenTomatoesP1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        //Objects

        Scanner input = new Scanner(System.in);

        Scanner fileReader = new Scanner(new FileReader("MovieReviews.txt"));

        Scanner negReader = new Scanner(new FileReader("NegativeReview.txt"));

        Scanner wordReader = new Scanner(new FileReader("WordList.txt"));

        //Variables
        String word, wordfile, file;

        int repeat = 0;

        int moviereview = 0;

        double moviereviewaverage = 0;

        //Intro
        System.out.println("Movie Reviews \n"
                + "--------------------------------------------------------");

        System.out.print("Enter a word : ");

        word = input.nextLine();

        // Loop
        while (fileReader.hasNext()) {

            wordfile = fileReader.nextLine();

            if (wordfile.toUpperCase().contains(word.toUpperCase())) {
                repeat++;

                moviereview = fileReader.nextInt();

                moviereviewaverage += moviereview;

            }

        }

        //Calculation for average
        moviereviewaverage = (moviereviewaverage) / repeat;

        System.out.println("The word " + " ' " + word + " ' " + " repeats " + repeat
                + " times");

        System.out.println("The average score for reviews containing the word " + word
                + " is "
                + moviereviewaverage);

        //Part Two
        //Intro
        /*  System.out.print("Enter the name of the file with words you want to find the average score for : ");

        file = input.nextLine();

        if (file.equals("negTest.txt")) {

            String words = negReader.nextLine();

            Library.moviereview(words);

        } */
    }
}
