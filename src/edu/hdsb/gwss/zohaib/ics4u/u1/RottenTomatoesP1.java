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
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        //Objects

        Scanner input = new Scanner(System.in);

        Scanner wordReader = new Scanner(new FileReader("WordList.txt"));

        //Variables
        String word, file;

        double moviereviewaverage = 0, repeat = 0;

        //Intro
        System.out.println("Movie Reviews \n"
                + "--------------------------------------------------------");

        System.out.print("Enter a word : ");

        word = input.nextLine();

        System.out.println(word + " appears " + repeat + " times" + " \n"
                + "The average score for reviews containing the word " + word + " is " + Library.wordreview(word));

        //Part Two
        //Intro
        System.out.print("Enter the name of the file with words you want to find the average score for : ");

        //Retains value of name of file from user
        file = input.nextLine();

        //Calls upon a method to determine if overall negative review average or overall positive
        moviereviewaverage = Library.sentencereview(file);

        if (moviereviewaverage >= 2.01) {
            System.out.println("The overall score of words in " + file + " is " + moviereviewaverage
                    + "\nThe overall sentiment of " + file + " is positive ");

        } else if (moviereviewaverage <= 1.99) {
            System.out.println("The overall score of words in " + file + " is " + moviereviewaverage
                    + " \n The overall sentiment of " + file + " is negative");
        } else {
            System.out.println("file does not exist");
        }

        //Part Three
        //Intro
        System.out.print("Enter the name of the file with words you want to score: ");

        file = input.nextLine();

        //Variables
        int positive = 0, negative = 0;

        int i = 0, a = 0;

        double[] filesize;

        while (wordReader.hasNext()) {
            wordReader.next();
            i++;

        }

        //Array
        filesize = new double[i];

        if (file.equals("words.txt")) {
            a++;
            while (wordReader.hasNext()) {

                word = wordReader.nextLine();

                filesize[a] = Library.sentencereview(word);

                System.out.print(filesize[a]);

            }

        }
    }
}
