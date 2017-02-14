/*
 +* Name: Zohaib Ahmad
 
 + * Date : Monday , February 13 , 2017
 
 + * Version : v0.01

 + * Description : A very simple encryption algorithm it is alphabetic rotation.
 */
package edu.hdsb.gwss.zohaib.ics4u.u1;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author Zohaib-PC
 */
public class SimpleEncryption {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Scanner Object

        Scanner userInput = new Scanner(System.in);

        //Variables
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        String sentence, sentenceone;

        int rotation, ciphertype;

        int count = 0;

        //Intro
        System.out.println("This program will encrpyt or decrpyt a phrase using the \n "
                + "simple encryption method of rotating the letters");

        System.out.println("--------------------------------------------------- \n");

        System.out.println("Please enter a phrase");

        sentence = userInput.nextLine();

        sentenceone = sentence;

        sentence = sentence.toLowerCase();

        sentence = sentence.replaceAll("\\s+", "");

        System.out.println("Enter the rotation amount (1 - 25)");

        rotation = userInput.nextInt();

        System.out.println("1 - Encrpytion" + "\n" + "2 - Decryption");

        ciphertype = userInput.nextInt();

        //Calculations
        if (ciphertype == 1) {
            for (int i = sentence.length(); i > 0; i--) {

                for (int x = rotation; x > 0; x--) {
                  if(sentence.substring(i).contains(alphabet.substring(0,26))){
                      System.out.println("sentence");
                  }
                }

                count++;

            }
        }

    }

}
