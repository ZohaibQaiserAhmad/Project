/*
 +* Name: Zohaib Ahmad
 
 + * Date : Saturday , February 11 , 2017
 
 + * Version : v0.01

 + * Description : Library full of useful methods such as Palindrome

 */
package edu.hdsb.gwss.zohaib.ics4u.u1;

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
}
