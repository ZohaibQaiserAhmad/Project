/*
 +* Name: Zohaib Ahmad
 
 + * Date : Monday , February 13 , 2017
 
 + * Version : v0.04

 + * Description : Rotten Tomatoes Except Part 4 

 */
package edu.hdsb.gwss.zohaib.ics4u.u1;

//Imports scanner of which is used in program to get input values from user
import java.util.Scanner;

//File not found : tells java to ignore if file is not found
import java.io.FileNotFoundException;

public class RottenTomatoesP1 {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        //Objects

        Scanner input = new Scanner(System.in);

        //Variables
        //String Variable that holds file name and word , file name and word that is specified by user
        String word, file;

        //A double that keeps value of moviereviewaverage
        double moviereviewaverage = 0;

        //Variable for choice (initialize
        int choice = 0;

        //Intro
        //Title
        System.out.println("Movie Reviews \n"
                + "--------------------------------------------------------");

        //Part(5) Menu : Creates options for user to pick what they want to do
        //While loop to reopen menu till user presses 5
        while (choice != 5) {
            System.out.println("\n" + "What would you Like to do?");

            System.out.println("1:Get The Score of a word");

            System.out.println("2:Get the average score of words in a file(one word per line)");

            System.out.println("3:Find the highest/lowest scoring words in a file");

            System.out.println("4: Sort words from a file into positive.txt and negative.txt");

            System.out.println("5:Exit the program");

            System.out.print(" Enter a number 1 - 5: ");

            choice = input.nextInt();

            //Part One : Choice One
            switch (choice) {
                case 1:
                    //Prompts user to enter word
                    System.out.print("Enter a word : ");

                    //Takes the value of what user entered and stores it into word
                    word = input.next();

                    //Calculates average scoring through method from library and tells user the given information
                    System.out.println("The average score for reviews containing the word " + word + " is " + Library.wordreview(word));

                    break;

                //Part Two : Choice Two
                case 2:

                    //Intro
                    //Prompts user to enter a name of file they would like to find average score of 
                    System.out.print("Enter the name of the file with words you want to find the average score for : ");

                    //Retains value of name of file from user
                    file = input.next();

                    //In case user puts in any capitals for file name it converts it back into lower case
                    file = file.toLowerCase();

                    //Calls upon a method to determine if overall negative review average or overall positive
                    moviereviewaverage = Library.sentencereview(file);

                    //If movie review average is greater than or equal to 2.01 then the overall sentiment is positive in the file specified
                    if (moviereviewaverage >= 2.01) {
                        System.out.println("The overall score of words in " + file + " is " + moviereviewaverage
                                + "\nThe overall sentiment of " + file + " is positive ");

                        //If movie review average is less than or equal to 1.99 than overall sentiment is negative in the file specified
                    } else if (moviereviewaverage <= 1.99) {
                        System.out.println("The overall score of words in " + file + " is " + moviereviewaverage
                                + " \n The overall sentiment of " + file + " is negative");

                        //If user inputs a file that does not exist
                    } else {
                        System.out.println("File does not exist");
                    }

                    break;

                //Part Three : Choice Three
                case 3:

                    //Intro
                    //Prompts user to enter name of file they would like to score
                    System.out.print("Enter the name of the file with words you want to score: ");

                    //takes the input of the user and stores it into the variable "file"
                    file = input.next();

                    //Calls the method from Library to calculate for score and of which lists the score user wants
                    Library.multiplechoice(file);

                    break;

                //Part Four : Choice Four
                case 4:

                    System.out.println("Not available");

                    break;

                //Part Five: Choice Five
                default:

                    System.out.println("");

            }

        }

    }
}
