/*


 +* Name: Zohaib Ahmad
 +
 + * Date : Monday , May 8rd
 +
 + * Version : v0.04
 +
 +  * Description : Stack data structure

 */
package edu.hdsb.gwss.zohaib.ics4u.u5;

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
    @Override
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

            System.out.println("Stack is empty!");
            return -1;

        } else {

            top--;
            
            System.out.println("The new top is : ");
            return data[top];

        }

    }

    @Override
    public void push(int value) {

        if (top != this.capacity() - 1) {

            top = top + 1;
            data[top] = value;

        } else {

            System.out.println("Stack is full!");

        }

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

        while (top != -1) {

            top--;

        }

    }

    public void print() {

        int x = this.size();

        for (int i = 0; i < x; i++) {

            System.out.println(data[i]);

        }

    }

}
