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

        //Scanner to read file 
        Scanner fileReader = new Scanner(new FileReader("Insult.g"));

        //Hashmap to keep track of nonterminals(non tags) and terminals (tags)
        HashMap<String, ArrayList<String>> grammar = new HashMap<>();

        //Variables : Line and tag which is set to null both string type
        String line, tag = null;

        //while(the file has a next line do this
        while (fileReader.hasNextLine()) {

            //Line is equal to the files next line with trim
            line = fileReader.nextLine().trim();

            //If line equals "{" do this
            if ("{".equals(line)) {

                //Tag is equal to files next line
                tag = fileReader.nextLine();

                //put the  tag into hashmap
                grammar.put(tag, getOptions(fileReader));
            }

        }

        //Print out the  generated sentence
        System.out.println(Sentence(grammar));

    }

    //Array method - get Options (in order to get options from each tag)
    public static ArrayList<String> getOptions(Scanner fileReader) {
        //Creates a array list string with undetermines size
        ArrayList<String> o = new ArrayList<>();

        //Creates String- "line"
        String line;

        //creates boolean and sets to false
        boolean done = false;

        //While not done (while not false) do this
        while (!done) {

            //Line is equal to file next line but trimmed();
            line = fileReader.nextLine().trim();

            //If line is equal to "}" do this
            if ("}".equals(line)) {

                //Set done to true
                done = true;

                //Else add line to options
            } else {
                o.add(line);

            }
        }

        //return options
        return o;
    }

    //Creates method Sentence that takes hashmap as a argument
    public static String Sentence(HashMap<String, ArrayList<String>> grammar) {

        //Variable : Sentence starter which is equal to string "<start>"
        String sentenceStarter = "<start>";

        //Creates a int 'size' which is equal to grammar "Sentence starter" size
        int size = grammar.get(sentenceStarter).size();

        //Random - to get all options and randomize what will be picked
        int random = (int) (Math.random() * size);

        //String s is equal to grammar sentence starter random option
        String s = grammar.get(sentenceStarter).get(random);

        //Return the sentence at (grammar and s)
        return Sentence(grammar, s);

    }

    //Creates a method Sentence which will be used for recursion with argument hashmap - grammar and a string - s : sentence
    public static String Sentence(HashMap<String, ArrayList<String>> grammar, String s) {

        //Creates a string tag and sets default value of tag to null
        String tag;

        //Creates a int "size"
        int size;

        //Creates a variable string "subsentence" and "replace" which is set to null
        String subSentence;
        String replace = null;

        // BASE CASE: Checks to see if there are any tags left
        //If NO MORE return s;
        if (!(s.contains("<"))) {

            return s.replaceAll(";", "");

        }

        //Creates a array "sentence" which will split the sentence into each token
        String[] sentence = s.split("\\s");

        //For loop of which iterates through each 'token' in order to look for tag
        for (String sentence1 : sentence) {

            //If sentence starts with "<" do this
            if (sentence1.startsWith("<")) {

                //tag is equal to sentence
                tag = sentence1;

                //use grammar and get tag
                grammar.get(tag);

                //size is equal to grammar tag(the options within tag)
                size = grammar.get(tag).size();

                //Random
                int random = (int) (Math.random() * size);

                //subSentence is equal to grammar at tag with random options and replace ; with no space - nothing
                subSentence = grammar.get(tag).get(random).replaceAll(";", "");

                //replace is equal to  replace sentence tag with its sub sentence
                replace = s.replaceFirst(tag, subSentence);

            }
        }

        //Returns the sentence at grammar with replace value
        return Sentence(grammar, replace);
    }

}
