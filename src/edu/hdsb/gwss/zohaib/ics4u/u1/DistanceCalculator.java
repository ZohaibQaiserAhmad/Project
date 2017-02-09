/*
 +* Name: Zohaib Ahmad
 
 + * Date : Wednesday , 9 Feburary 
 
 + * Version : v0.02

 + * Description : Calculates for Distance on earth based on two places inputed by user

and alongside with latitude and longtitude.

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
        final double Rrad = 180 / Math.PI;

        //Earth Radius
        final double Erad = 6378.8;

        //Variables
        double longtitudeone, latitudeone, longtitudetwo, latitudetwo, greatDistance;
        String placeone, placetwo;

        //Introduction with instructions on how to use program
        System.out.print("When entering latitude and longitude,please use degrees.\n For Example :"
                + " 43 degrees 40 minutes would be entered as 43.67. \n Use positive values for North "
                + "latitudes \n and West longitudes. "
                + " Use negatives values for South latitudes and East \n \n \n");

        //Prompts for place one
        System.out.print("Enter name of place one : ");
        placeone = input.nextLine();

        //Asks user for latitude for place one and save it in variable (latitudeone)
        System.out.print("Enter the latitude of " + placeone + " : ");
        latitudeone = Double.parseDouble(input.nextLine());

        //Asks user for longtitude for place one and saves it in variable(longtitudeone)
        System.out.print("Enter the longtitude of " + placeone + " : ");
        longtitudeone = Double.parseDouble(input.nextLine());

        System.out.println("------------------------------------------");

        //Prompts for place two
        System.out.print("Enter name of place two :");
        placetwo = input.nextLine();

        //Asks user for latitude for place two and saves it in variable(latitudetwo)
        System.out.print("Enter the latitude of " + placetwo + " : ");
        latitudetwo = Double.parseDouble(input.nextLine());

        //Asks user for longtitude for place two and saves it in variable(longtitudetwo)
        System.out.print("Enter the longtitude of " + placetwo + " : ");
        longtitudetwo = Double.parseDouble(input.nextLine());

        System.out.println("------------------------------------------");

        //Calculations to determine distance on earth
        greatDistance = Erad * Math.acos(Math.sin(latitudeone / Rrad) * Math.sin(latitudetwo / Rrad)
                + Math.cos(latitudeone / Rrad) * Math.cos(latitudetwo / Rrad)
                * Math.cos((longtitudetwo / Rrad) - (longtitudeone) / Rrad));

        //Great Distance Displayed
        System.out.println("Therefore the Distance is " + greatDistance + " " + "KM");
    }

}
