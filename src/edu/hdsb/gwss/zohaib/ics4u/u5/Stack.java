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
//Public class that implements stack interferace methods
public class Stack implements StackInterface {

    //Default size for constructor : 5
    public static final int DEFAULT_SIZE = 5;

    //Array
    private int[] data;

    //Variables    
    private int top;

    //Default constructor
    public Stack() {

        this(DEFAULT_SIZE);

    }

    //Custom method for different capacitys other than default
    public Stack(int capacity) {

        //array has a size of capacity given by input of method
        this.data = new int[capacity];

        //Sets the top to -1 as default for empty array
        top = -1;

    }

    //Determines top overides the method
    @Override
    public int top() {

        //If it is empty return a error - -1 to show invalid for empty
        if (this.isEmpty()) {
            return -1;

            //Else return the arrays value at top
        } else {

            return this.data[this.top];

        }

    }

    //Used to pop values from top of stack (method - returns new stack without popped value)
    @Override
    public int pop() {

        //If it is empty invalid and can't pop anything return -1 to show that its invalid
        if (this.isEmpty()) {

            System.out.println("Stack is empty!");
            return -1;

            //Else subtract one from top which basically removes the previous top value 
        } else {

            top--;

            //Used to tell user new top value
            System.out.println("The new top is : ");

            //returns array with new top value
            return data[top];

        }

    }

    //Used to push values into stack with a given argument of value - # that will be inputted to stack
    @Override
    public void push(int value) {

        //if the the top does not equal capacity of stack - 1 then do this
        if (top != this.capacity() - 1) {

            //Top is equal to top plus one
            top = top + 1;

            //Data and new top is equal to value inputted
            data[top] = value;

            //Else print out stack is full
        } else {

            System.out.println("Stack is full!");

        }

    }

    //Method to determine size
    @Override
    public int size() {

        //Return the top value plus one which will give size
        return this.top + 1;

    }

    //Method to determine capacity
    @Override
    public int capacity() {

        //Return the length of array which is the arrays capacity
        return this.data.length;
    }

    //Method to determine if its empty
    @Override
    public boolean isEmpty() {

        //If the top is -1 which is its default value the array is empty
        return this.top == -1;

    }

    //Method to determine if its full
    @Override
    public boolean isFull() {

        //If the size is equal to capacity then its full
        return this.size() == this.capacity();
    }

    //Method to make the array empty
    @Override
    public void makeEmpty() {
        
        //While the top is not equal to -1 the bottom keep subtracting one from top
        while (top != -1) {

            top--;

        }

    }
    
    //Method to print out the array
    public void print() {
        
        //Set the integer "x" to the size
        int x = this.size();
        
        //For loop , i is set to 0 , while i is less then x increase i by one each time
        for (int i = 0; i < x; i++) {
            
            //Print out the array at position i
            System.out.println(data[i]);

        }

    }

}
