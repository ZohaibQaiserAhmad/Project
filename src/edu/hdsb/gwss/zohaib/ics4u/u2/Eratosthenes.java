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

        for (int i = 0; i < 1000; i++) {
            numbers.add(i);

            if (i % 10 == 0) {
                numbers.add("\n");

            }

        }

        for (int i = 0; i < numbers.size(); i++) {
            

        }

        System.out.print(numbers);
    }

}
