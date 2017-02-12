/*
 +* Name: Zohaib Ahmad
 
 + * Date : Saturday , February 11 , 2017
 
 + * Version : v0.01

 + * Description : Palindrome with sentences

 */
package edu.hdsb.gwss.zohaib.ics4u.u1;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author Zohaib-PC
 */
public class Palindrome2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Scanner Object

        Scanner userInput = new Scanner(System.in);

        //Variables
        String sentence;

        String word;

        int count = 0;

        //Intro
        System.out.println("Words that are the same forwards and backwards are called palindromes. \n "
                + "This program determines if the words are palindromes");

        System.out.println("Enter a sentence (do not include a punctuation mark) :");

        sentence = userInput.nextLine();

        StringTokenizer st = new StringTokenizer(sentence, "!, ");

        System.out.println("Therefore the palindrome word(s) are the ones listed  : ");

        for (int i = st.countTokens(); i > 0; i--) {

            if (Library.Palindrome(st.nextToken())) {
                count++;
            }

        }

        System.out.println("--------------------------------------------------- \n" + "The amount of palindrome(s) are : " + count);

    }

}
