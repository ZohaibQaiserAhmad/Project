/*
 +* Name: Zohaib Ahmad
 
 + * Date : Friday , 24 Feburary 
 
 + * Version : v0.01

 + * Description : The Sieve of Eratosthenes is the name given to an

algorithm for finding prime numbers. A prime number is a whole number 

greater than one that has no exact divisors except one and the

number itself.The sieve starts by considering all numbers greater than one

as possible primes.

 */
package edu.hdsb.gwss.zohaib.ics4u.u2;

import java.util.ArrayList;

/**
 *
 * @author 1ahmadzoh
 */
public class Eratosthenes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Array
        ArrayList numbers = new ArrayList();
        ArrayList evenNumbertoremove = new ArrayList();
        ArrayList oddNumbertoremove = new ArrayList();

        //Variable
        //for statement
        for (int i = 2; i < 1000; i++) {
            numbers.add(i);

        }

        for (int i = 2; i < 1000; i = i + 2) {

            int one = i + 1;

            int two = i + 2;

            int five = i + 5;

            int seven = i + 7;

            if (two % 2 == 0) {

                evenNumbertoremove.add(two);

            }

            if (one % 3 == 0 && one > 3) {

                oddNumbertoremove.add(one);

            }

            if (five % 5 == 0 && five > 5) {

                oddNumbertoremove.add(five);

            }

            if (seven % 7 == 0 && seven > 7) {

                oddNumbertoremove.add(seven);

            }

        }
        numbers.removeAll(evenNumbertoremove);
        numbers.removeAll(oddNumbertoremove);
        
        

        System.out.println(numbers);

    }

}
