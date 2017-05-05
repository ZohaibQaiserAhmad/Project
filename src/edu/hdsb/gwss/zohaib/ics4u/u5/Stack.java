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
public class Stack implements StackInterface {

    public static final int DEFAULT_SIZE = 5;

    //Array
    private int[] data;

    //Variables    
    private int top;

    //Default constructor
    public Stack() {
        this(DEFAULT_SIZE);
    }

    public Stack(int capacity) {

        this.data = new int[capacity];
        top = -1;

    }

    //Determines top
    public int top() {

        if (this.isEmpty()) {
            return -1;
        } else {
            return this.data[this.top];
        }

    }

    @Override
    public int pop() {
        if (this.isEmpty()) {
            return -1;
        } else {
            int top = this.top();
            this.top--;
            return top;
        }
    }

    @Override
    public void push(int value) {

        this.data = new int[value];
        this.top = value;

    }

    @Override
    public int size() {
        return this.top + 1;
    }

    @Override
    public int capacity() {
        return this.data.length;
    }

    @Override
    public boolean isEmpty() {
        if (this.top == -1) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean isFull() {
        return this.size() == this.capacity();
    }

    @Override
    public void makeEmpty() {

       while(size() > 0){
           
           
           
           
       }
        
    }

}
