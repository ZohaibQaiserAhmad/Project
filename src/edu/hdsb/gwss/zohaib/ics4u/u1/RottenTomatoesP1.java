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
        String word, file;

        double moviereviewaverage = 0, repeat = 0;

        //Intro
        System.out.println("Movie Reviews \n"
                + "--------------------------------------------------------");

        System.out.print("Enter a word : ");

        word = input.nextLine();

        System.out.println("The average score for reviews containing the word " + word
                + " is "
                + Library.moviereview(word));

        //Part Two
        //Intro
        System.out.print("Enter the name of the file with words you want to find the average score for : ");

        file = input.nextLine();

        if (file.equals("negTest.txt")) {

            while (negReader.hasNext()) {

                repeat++;

                String words = negReader.nextLine();

                moviereviewaverage += Library.moviereview(words);

            }

            moviereviewaverage = (moviereviewaverage) / repeat;

            System.out.println(moviereviewaverage);

            if (moviereviewaverage >= 2.01) {
                System.out.println("The overall score of words in " + file + " is " + moviereviewaverage
                        + " \n The overall sentiment of " + file + " is positive");
            } else {
                System.out.println("The overall score of words in " + file + " is " + moviereviewaverage
                        + " \n The overall sentiment of " + file + " is negative");
            }
        }

        //Part Three
        //Intro
        System.out.print("Enter the name of the file with words you want to score: ");
    }
}
