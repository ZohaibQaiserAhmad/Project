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

import java.util.Arrays;

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
    public static Double wordreview(String word) throws FileNotFoundException {

        //Objects
        Scanner fileReader = new Scanner(new FileReader("MovieReviews.txt"));

        //Variables
        //Variable that holds how many times the while loop will repeat
        double repeat = 0;

        //Variable that will be used to calculate moviereviewaverage
        double moviereview = 0;

        //Stores value of moviereview average that will be used to print out value for user
        double moviereviewaverage = 0;

        //Hold value of the file of which will specify which file to calculate moviereview average
        String wordfile;

        // Loop
        while (fileReader.hasNext()) {

            //While filereader the file has a token in its input wordfile will equal the files next line
            wordfile = fileReader.nextLine();

            //If wordfile the files next line to upper case contains the word the user specified to upper case do this statement
            if (wordfile.toUpperCase().contains(word.toUpperCase())) {

                //If file reader has a double that do these calculations
                if (fileReader.hasNextDouble()) {

                    //moviereview is equal to the files next double the number at the front of each file
                    moviereview = fileReader.nextDouble();

                    //Each time the if statement is true increase repeat by one
                    repeat++;

                }

                //Accumulate moviereview and add it to the value of moviereviewaverage
                moviereviewaverage += moviereview;
            }

        }

        //Calculation for average
        moviereviewaverage = (moviereviewaverage / repeat);

        //Return the value of moviereviewaverage
        return moviereviewaverage;

    }

    //Review method (part two)
    public static double sentencereview(String file) throws FileNotFoundException {
        //Objects

        Scanner negReader = new Scanner(new FileReader("NegativeReview.txt"));

        Scanner wordReader = new Scanner(new FileReader("WordList.txt"));

        //Variables
        //Holds the value of moviereviewaverage and repeat as 0
        double moviereviewaverage = 0, repeat = 0;

        //Holds variables words of which will be each line of the file under string
        String words;

        //If the file is equal to this string then do this
        if (file.equals("negtest.txt")) {

            //While the file has a token do this
            while (negReader.hasNext()) {

                //words is equal to the files next line
                words = negReader.nextLine();

                //put the word through the method .wordreview and add the value returned each time to moviereviewaverage
                moviereviewaverage += Library.wordreview(words);

                //every time there is a token add one to repeat
                repeat++;

            }

            //if the file is not equal to 'negtest.txt' see if the file is equal to 'words.txt' and if it is do this
        } else if (file.equals("words.txt")) {

            //While the file has a token
            while (wordReader.hasNext()) {

                //words is equal to the files next line
                words = wordReader.nextLine();

                //put the word through the method .wordreview and add the value returned each time to moviereviewaverage
                moviereviewaverage += Library.wordreview(words);

                //every time there is a token add one to repeat
                repeat++;

            }
        }

        //Calculations for moviereviewaverage : moviereviewaverage is equal to moviereviewaverage value divided by repeat value
        moviereviewaverage = (moviereviewaverage) / (repeat);

        //Return moviereviewaverage everytime this method is used with specified perameter
        return moviereviewaverage;
    }

    //Review Method Multiple Choice(Part 3)
    public static void multiplechoice(String file) throws FileNotFoundException {
        //Object

        Scanner negReader = new Scanner(new FileReader("NegativeReview.txt"));

        Scanner wordReader = new Scanner(new FileReader("WordList.txt"));

        //Variables
        //Declares a valuable int 'repeat' as 0 for later calculations
        int repeat = 0;

        //Stores word and original word into string inorder to retain value of word once it has changed later
        String word, originalword;

        //Declares two double arrays and two string arrays
        double[] negArray;
        double[] wordArray;

        String[] negArrays;
        String[] wordArrays;

        //If file inputed by user is equal to this then do this
        if (file.equals("negtest.txt")) {

            //Declares negarray as a double with size of 8 and negarrays as a string with size of 8
            negArray = new double[8];

            negArrays = new String[8];

            //While file has next do this
            while (negReader.hasNext()) {

                //word is equal to file next line
                word = negReader.nextLine();

                //Incase user inputs a capital put word into lowercase
                word = word.toLowerCase();

                //original word is equal to word before word is changed
                originalword = word;

                //Stores original word into string array
                negArrays[repeat] = originalword;

                //Stores values of word scores that have been calculated using method into double array
                negArray[repeat] = Library.wordreview(word);

                //Add one to repeat everytime file has a token
                repeat++;

            }

            //Sorts values from least to greatest
            Arrays.sort(negArrays);

            //Sorts values from least to greatest
            Arrays.sort(negArray);

            //Gives information of what user asked for
            System.out.println(" The most positive word , with a score of  " + negArray[(negArray.length) - 1] + " is "
                    + negArrays[(negArray.length) - 1] + " \n The most negative word , with a score of  " + negArray[0] + " is "
                    + negArrays[0]);

            //If file is not equal to "negtest.txt" see if they inputted "words.txt"
        } else if (file.equals("words.txt")) {

            //Declares wordarray as a double with size of 8 and wordarrays as a string with size of 8
            wordArray = new double[44];

            wordArrays = new String[44];
            
            //While file has a next line do this
            while (wordReader.hasNext()) {
                
                //word is equal to file next line
                word = wordReader.nextLine();
                
                //word is equal to word but lower cased
                word = word.toLowerCase();
                
                //retain original value of word before its changed
                originalword = word;
                
                //Creates array to store values of orginal word and word
                wordArrays[repeat] = originalword;

                wordArray[repeat] = Library.wordreview(word);
                
                //every time the file has a token add one to repeat
                repeat++;

            }
            
            //Sorts the values gained from while loop from least to greatest
            Arrays.sort(wordArray);

            Arrays.sort(wordArrays);
            
            //Prints out the information user wants
            System.out.println(" The most positive word , with a score of  " + wordArray[(wordArray.length) - 1] + " is "
                    + wordArrays[(wordArray.length) - 1] + " \n The most negative word , with a score of  " + wordArray[0] + " is "
                    + wordArrays[0]);

        }

    }

}
