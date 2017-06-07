/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.zohaib.ics4u.u6;

import java.util.Scanner;

/**
 *
 * @author 1ahmadzoh
 */
public class StudentRecordAccessFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Creates an array of objects to store all the records(data)
        

        //Record #1 : For mujtaba : name - mujtaba , coursetitle - chemistry , 
        //grade - 12 , student id - 5528132 , average - 83 (in course) , weight ~ 180 , gender - male ,
        //can graduate - true
        StudentRecord studentOne = new StudentRecord("Mujtaba", "Chemistry", 12, 5528132, 83, 180, 'M', true);
        
        //Record # 2 :  For Zohaib : name - zohaib , coursetitle - Calculus and vectors ,
        //grade - 12 , student id - 8017977 , average - 82 (in course) , weight ~ 190 , gender - male ,
        //can graduate - true
        StudentRecord studentTwo = new StudentRecord("Zohaib", "Calculus and Vectors", 12, 8017977, 82, 190, 'M', true);

        //Record # 3 :  For Nick : name - Nick , coursetitle - English ,
        //grade - 12 , student id - 6195049 , average - 65 (in course) , weight ~ 135 , gender - male ,
        //can graduate - true
        StudentRecord studentThree = new StudentRecord("Nick", "English", 12, 6195049, 65, 135, 'M', true);

        //Record # 4 :  For Rishi : name - Rishi , coursetitle - Chemistry ,
        //grade - 12 , student id - 1570535 , average - 87 (in course) , weight ~ 175 , gender - male ,
        //can graduate - true
        StudentRecord studentFour = new StudentRecord("Rishi", "English", 12, 1570535, 87, 175, 'M', true);

        //Record # 5 :  For Lauren : name - Lauren , coursetitle - Arts ,
        //grade - 12 , student id - 4266301 , average - 92 (in course) , weight ~ 170 , gender - female ,
        //can graduate - true
        StudentRecord studentFive = new StudentRecord("Lauren", "Arts", 12, 4266301, 92, 170, 'F', true);

        //Record # 6 :  For Audrey : name - Audrey , coursetitle - Music ,
        //grade - 12 , student id - 7104724 , average - 60 (in course) , weight ~ 150 , gender - female ,
        //can graduate - true
        StudentRecord studentSix = new StudentRecord("Audrey", "Music", 12, 7104724, 60, 150, 'F', true);

        //Record # 7 :  For Lea : name - Lea , coursetitle - GLE ,
        //grade - 12 , student id - 2013734 , average - 30 (in course) , weight ~ 150 , gender - female ,
        //can graduate - true
        StudentRecord studentSeven = new StudentRecord("Lea", "GLE", 12, 2013734, 30, 130, 'F', true);

        //Record # 8 :  For Ella : name - Ella , coursetitle - Advanced Functions ,
        //grade - 12 , student id - 7346850 , average - 95 (in course) , weight ~ 160 , gender - female ,
        //can graduate - true
        StudentRecord studentEight = new StudentRecord("Ella", "Advanced Functions", 12, 7346850, 95, 160, 'F', true);


        
        Database db = new Database();
        
        //Saves All the students recorded so far
        db.save( studentOne );
        db.save( studentTwo );
        db.save(studentThree);
        db.save(studentFour);
        db.save(studentFive);
        db.save(studentSix);
        db.save(studentSeven);
        db.save(studentEight);
        

        db.close();
        
//
//        //Creates a file
//       StudentRecordAccessFile file = new StudentRecordAccessFile();
//        
//        
//        
//        //Creates Scanner of which will be used to read input
//        Scanner input = new Scanner(System.in);
//
//        //Tells User to type in lower case
//        System.out.println("-------In lower Case answer the following questions------");
//
//        //Asks user of which student data they want to modify
//        System.out.println("Which student data would you like to modify (1 - sizeofclass) : ");
//        int choice = input.nextInt();
//        
//        if(choice == 0 || choice <=)
//        
//   
//
//        //Changing Name
//        System.out.println("Enter [new name] or [k]eep current name ([k]/[new name]) : ");
//        String name = input.nextLine();
//
//        //If the user chooses to not keep name change the record(modify) for new name
//        if (!"k".equals(name)) {
//
//            //Sets the new name in file
//        }

    }

}
