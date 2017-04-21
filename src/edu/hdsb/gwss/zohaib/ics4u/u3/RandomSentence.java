/*
 +* Name: Zohaib Ahmad
 
 + * Date : Friday , April 21 , 2017
 
 + * Version : v0.01

 + * Description : Reads data from file to create a random sentence 

 */
package edu.hdsb.gwss.zohaib.ics4u.u3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
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
        HashMap<String, ArrayList<String>> grammar = new HashMap<>();

        //Variables
        String line, tag = null;

        while (fileReader.hasNextLine()) {

            line = fileReader.nextLine().trim();

            if ("{".equals(line)) {

                tag = fileReader.nextLine();

                grammar.put(tag, getOptions(fileReader));
            }

        }

        System.out.println( Sentence(grammar) );

    }

    public static ArrayList<String> getOptions(Scanner fileReader) {
        ArrayList<String> o = new ArrayList<>();
        String line;
        boolean done = false;

        while (!done) {

            line = fileReader.nextLine().trim();

            if ("}".equals(line)) {
                done = true;
            } else {
                o.add(line);

            }
        }

        return o;
    }

    public static String Sentence(HashMap<String, ArrayList<String>> grammar) {

        //Variable
        String sentenceStarter = "<start>";
        
        int size = grammar.get(sentenceStarter).size();

        String s = grammar.get(sentenceStarter).get(0);

        return Sentence( grammar, s );

    }
    
    public static String Sentence(HashMap<String, ArrayList<String>> grammar, String s ) {

        // BASE CASE: are they any tags left?
        //  NO MORE; return s;
        
        
        // MORE TAGS
        //  - find the next tag
        //  - go into grammar;  grammar.get(tag)
        //  - how many options?
        //  - generate random option
        //  - get sub-sentence:  grammar.get(tag).get(randomnumber);
        
        // - replace tag with new sentence
        //  s.replaceFirst( tag, newSentence );
        // return Sentence( grammar, s )
        
        return null;

    }

}
