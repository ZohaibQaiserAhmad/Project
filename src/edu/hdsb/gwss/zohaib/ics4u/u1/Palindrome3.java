/*
 +* Name: Zohaib Ahmad
 
 + * Date : Monday , February 13 , 2017
 
 + * Version : v0.01

 + * Description : Modified version of palindrome 2 , instead of word the whole sentence.

 */
package edu.hdsb.gwss.zohaib.ics4u.u1;

import java.util.Scanner;

/**
 *
 * @author 1ahmadzoh
 */
public class Palindrome3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Scanner Object

        Scanner userInput = new Scanner(System.in);

        //Variables
        String sentence, word, sentenceone;

        //Intro
        System.out.println("Words that are the same forwards and backwards are called palindromes. \n "
                + "This program determines if the words are palindromes");

        System.out.println("Enter a sentence (do not include a punctuation mark) :");

        sentence = userInput.nextLine();

        sentenceone = sentence;

        //Stores original value of sentence
        // sentenceone = userInput.nextLine();
        word = sentence.replaceAll("\\s+", "");

        // if statements to check for palindrome
        if (Library.Palindrome(word)) {
            System.out.print("------------------------------------------------ \n");
            System.out.print("Therefore the sentence " + " ' " + sentenceone + " ' "
                    + "is the same backwards");

        } else {
            System.out.print("------------------------------------------------ \n");
            System.out.println("Therefore the sentence " + " ' " + sentenceone + " ' "
                    + "is not the same backwards");
        }

    }
}
