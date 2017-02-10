
import java.util.Scanner;

/*

 +* Name: Zohaib Ahmad
 +
 + * Date : Friday , February 19
 +
 + * Version : v0.01
 +
 +  * Description : User enters a word and code print it backwards. Words that are arranged 

 the same way forwards as they are backwards are called palindromes

package edu.hdsb.gwss.zohaib.ics4u.u1;

/**
 *
 * @author 1ahmadzoh
 */
public class Palindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Scanner Object

        Scanner userInput = new Scanner(System.in);

        //Variables
        String word;

        int lastLetter;

        int firstLetter;

        boolean pal = true;

        //Intro
        System.out.print("Words that are the same forwards and backwards are called palindromes."
                
                + " \n This program determines if a words is a palindrome. \n");
        
        System.out.println("----------------------------------------------------------------------------- ");
        
        System.out.print("Enter a word : ");

        word = userInput.nextLine();

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

            System.out.println(word + " is not " + word + " backwards and therefore"
                    + " is not a palindrome");
            

        } else {

            System.out.print(word + "  is " + word + " backwards ");

            System.out.println(word + "and therefore is a palindrome");

        }

    }

}
