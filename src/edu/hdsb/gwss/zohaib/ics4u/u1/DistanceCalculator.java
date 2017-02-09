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
        //To convert degrees to radians divide by 180/pi
        double Rrad = 180 / Math.PI;

        //Earth Radius
        double Erad = 6378.8;

        //Variables
        double longtitudeone, latitudeone, longtitudetwo, latitudetwo, greatDistance;
        String placeone, placetwo;

        //Prompts for place one and place two 
        System.out.print("Enter place one :    ");
        placeone = input.nextLine();

        System.out.print("Enter the latitude of " + placeone + " :   ");
        latitudeone = Double.parseDouble(input.nextLine());
        

        System.out.print("Enter the longtitude of " + placeone + " :  ");
        longtitudeone = Double.parseDouble(input.nextLine());

        System.out.println("------------------------------------------");

        System.out.print("Enter place two :");
        placetwo = input.nextLine();

        System.out.print("Enter the latitude of " + placetwo + " : ");
        latitudetwo = Double.parseDouble(input.nextLine());

        System.out.print("Enter the longtitude of " + placetwo + " : ");
        longtitudetwo = Double.parseDouble(input.nextLine());
        
         System.out.println("------------------------------------------");

        //Calculations
        greatDistance = Erad * Math.acos( Math.sin(latitudeone/Rrad) * Math.sin(latitudetwo/Rrad)
                + Math.cos(latitudeone/Rrad) * Math.cos(latitudetwo/Rrad)
                * Math.cos((longtitudetwo/Rrad) - (longtitudeone)/Rrad) );

        //Great Distance Displayed
        System.out.println("Therefore the Distance is " + greatDistance);
    }

}
