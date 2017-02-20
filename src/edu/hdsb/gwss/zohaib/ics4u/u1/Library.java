/*
 +* Name: Zohaib Ahmad
 
 + * Date : Saturday , February 11 , 2017
 
 + * Version : v0.01

 + * Description : Library full of useful methods such as Palindrome

 */
package edu.hdsb.gwss.zohaib.ics4u.u1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author Zohaib-PC
 */
public class Library {

    //Palindrome Method
    public static boolean Palindrome(String word) {
        //Variables
        int lastLetter, firstLetter;

        boolean pal = true;

        //makes word lower case
        word = word.toLowerCase();

        //For Loops
        for (int i = 0; i < word.length(); i++) {
            //Calculations
            lastLetter = word.charAt(i);

            firstLetter = word.charAt(word.length() - i - 1);

            //IF statment
            if (lastLetter != firstLetter) {

                pal = false;

            }
        }
        //Output

        if (pal == false) {
            return false;
        } else {
            System.out.println(word);
            return true;

        }

    }

    //review method (part one)
    public static void moviereview(String word) throws FileNotFoundException {

        //Objects
        Scanner fileReader = new Scanner(new FileReader("MovieReviews.txt"));

        //variables
        int repeat = 0;

        int moviereview = 0;

        double moviereviewaverage = 0;

        String wordfile;

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

    }
}
