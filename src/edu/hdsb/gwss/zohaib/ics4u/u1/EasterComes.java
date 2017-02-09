/*
 +* Name: Zohaib Ahmad
 
 + * Date : Wednesday , 8 Feburary 
 
 + * Version : v0.01

 + * Description : Calculates the date of easter after 

prompting the user for year(Easter day calculator).

 */
package edu.hdsb.gwss.zohaib.ics4u.u1;

import java.util.Scanner;

/**
 *
 * @author 1ahmadzoh
 */
public class EasterComes {

    public static void main(String[] args) {

        //Scanner Input to get year from user 
        Scanner input = new Scanner(System.in);

        //Variables
        int year, month, day, a, b, c, d, e, f, g, h, i, j, k, m, p;

        //Title
        System.out.print("Easter Day calculator \n" +
                
                         "----------------------- \n");
        
        //Prompt for User to enter data
        System.out.print("Enter the year : ");
        year = input.nextInt();

        //Calculations
        a = year % 19;

        b = year / 100;

        c = year % 100;

        d = b / 4;

        e = b % 4;

        f = (b + 8) / 25;

        g = (b - f + 1) / 3;

        h = (19 * a + b - d - g + 15) % 30;

        i = c / 4;

        k = c % 4;

        j = (32 + 2 * e + 2 * i - h - k) % 7;

        m = (a + 11 * h + 22 * j) / 451;

        p = (h + j - 7 * m + 114) % 31;

        month = (h + j - 7 * m + 114) / 31;

        day = p + 1;

        //Tells the user the day and month of easter
        System.out.print("Easter day is"
                + " in the month : " + month
                + "\n" + "Day of easter : " + day +"\n");

    }

}
