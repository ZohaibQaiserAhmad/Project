/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.zohaib.ics4u.u1;

import java.util.Scanner;

/**
 *
 * @author 1ahmadzoh
 */
public class DistanceCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Scanner Input to get year from user 
        Scanner input = new Scanner(System.in);

        //Constants
        double Erad = 57.29577951;

        //Variables
        double radDis, degDis ;
    
    //Prompts for place one and 2 
    System.out.println("Enter place 1 :");
    double place1 = Double.parseDouble(input.nextLine());
    
    System.out.println("Enter place 2 :");
    double place2 = Double.parseDouble(input.nextLine());
    
    

    }

}
