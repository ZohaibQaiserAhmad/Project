/*


 +* Name: Zohaib Ahmad
 +
 + * Date : Wednesday , May 3rd
 +
 + * Version : v0.03
 +
 +  * Description : Stack data structure

 */
package edu.hdsb.gwss.zohaib.ics4u.u5;

import java.util.Arrays;

/**
 *
 * @author 1ahmadzoh
 */
public class Stack {

    //Array
    private int[] data;

    //Variables
    public final int DEFAULT_SIZE = 5;
    private int top;
    private int size;

    //Returns value of the array "data" in integer form
    public int[] getData() {

        return data;
    }

    //Sets value of data
    public void setData(int number) {

        data[0] = number;
        size++;

    }

    //Default constructor
    public Stack() {
      
        this.size = 10;
        this.data = new int[size];
        top = -1;
        
        
    }

    //Determines top
    public int top() {

        return 0;
    }

}
