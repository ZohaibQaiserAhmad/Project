/*
 +* Name: Zohaib Ahmad
 
 + * Date : Tuesday , April 04 , 2017
 
 + * Version : v0.01

 + * Description : Reads data from file to create a random sentence 

 */
package edu.hdsb.gwss.zohaib.ics4u.u3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author 1ahmadzoh
 */
public class RandomSentence {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        //Objects

        Scanner fileReader = new Scanner(new FileReader("Insult.g"));

        //Array
        ArrayList<String> options = new ArrayList();

        ArrayList<String> read = new ArrayList();

        //Variables
        while (fileReader.hasNext()) {

            String[] line = fileReader.nextLine().split(" ");

            System.out.println(Arrays.toString(line));

        }

    }
}
