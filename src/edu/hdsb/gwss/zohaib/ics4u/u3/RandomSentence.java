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
        HashMap<String,ArrayList<String>> grammar = new HashMap<>();
        
        //Array
//        ArrayList<String> options = new ArrayList();
//
//        ArrayList<String> read = new ArrayList();

        //Variables
        String line, tag;
        
        
        while (fileReader.hasNextLine()) {

            line = fileReader.nextLine().trim();
            
            if( "{".equals(line) ) {
                
                tag = fileReader.nextLine();
                System.out.println( "TAG FOUND:" + tag );
          
                
                grammar.put( tag, getOptions( fileReader  ) );
            }

//            for (int i = 0; i < line.length; i++) {
//
//                if (line[i].contains("<")) {
//
//                    while (!(line[i].contains("}"))) {
//
//                        options.add(line[i]);
//
//                        System.out.println(options);
//
//                    }
//
//                }
//
//            }

        }

    }
    
    public static ArrayList<String> getOptions( Scanner fileReader ) {
        ArrayList<String> o = new ArrayList<>();
        String line;
        boolean done = false;
        
        while (!done) {

            line = fileReader.nextLine().trim();
            
            if( "}".equals(line) ) {
                done = true;
            }
            else {
                o.add(line);
                
                System.out.println( "\t" + line );
                
            }
        }
        
        return o;
    }
    
}
