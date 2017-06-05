/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.zohaib.ics4u.u6;

/**
 *
 * @author 1ahmadzoh
 */
public class StudentRecordAccessFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        //Record #1 : For mujtaba : name - mujtaba , coursetitle - chemistry , 
        //grade - 12 , student id - 5528132 , average - 83 (in course) , weight ~ 180 , gender - male ,
        //can graduate - true
        StudentRecord studentOne = new StudentRecord("Mujtaba" , "Chemistry" , 12 , 5528132 , 83 , 180 , 'M' , true);
        
        
     //Record # 2 :  For ZOghaib : name - zohaib , coursetitle - Calculus and vectors ,
     //grade - 12 , student id - 8017977 , average - 82 (in course) , weight ~ 190 , gender - male ,
     //can graduate - true
          StudentRecord studentTwo = new StudentRecord("Zohaib" , "Calculus and Vectors" , 12 , 8017977 , 82 , 190 , 'M' , true);
        
        
        
        
        
        
        
        
    }
    
}
