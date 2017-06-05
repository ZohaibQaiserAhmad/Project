/*


 +* Name: Zohaib Ahmad
 +
 + * Date : Monday , May 16
 +
 + * Version : v0.03
 +
 +  * Description : Queue data structure

 */
package edu.hdsb.gwss.zohaib.ics4u.u5;

/**
 *
 * @author 1ahmadzoh
 */
public class Queue implements QueueInterface {

    //Creates a int to store default size for default constructor
    public static final int DEFAULT_SIZE = 5;

    //Array
    private int[] queArray;

    //Variables    
    private int front;
    private int back;
    private int capacitys;
    private int sizes;

    //Default constructor
    public Queue() {

        this(DEFAULT_SIZE);

    }

    public Queue(int capacity) {

        front = -1;
        back = -1;
        capacitys = capacity;

        queArray = new int[capacity];

    }

    @Override
    public int front() {

        if (front == -1) {
            return -1;
        } else {
            return this.queArray[this.front];
        }

    }

    @Override
    public int back() {

        if (back == -1) {

            return -1;

        } else {

            return this.queArray[this.back];
        }

    }

    @Override
    public void enqueue(int value) {

        if ((back + 1) % capacitys == front) {

            System.out.println("Full!");

        } else if (this.isEmpty()) {

            back = 0;
            front = 0;
            queArray[back] = value;

        } else {

            back = (back + 1) % capacitys;
            queArray[back] = value;

        }

    }

    @Override
    public int dequeue() {

        if (this.isEmpty()) {

            return -1;

        } else if (front == back) {

            front = -1;
            back = -1;

            return -1;

        } else {

            front = (front + 1) % capacitys;
            return queArray[front];

        }

    }

    @Override
    public int size() {

        //If it is full return the capacity
        if (this.isFull()) {

            sizes = this.queArray.length;
            return sizes;

        }

        //Else use formula that will determine size for everything else
        sizes = (back + capacitys - front) % capacitys + 1;
        return sizes;

    }

    @Override
    public int capacity() {

        return this.queArray.length;

    }

    @Override
    public boolean isEmpty() {

        return front == -1 && back == -1;

    }

    @Override
    public boolean isFull() {

        return capacitys == sizes;

    }

    @Override
    public void makeEmpty() {

        while (!this.isEmpty()) {

            this.dequeue();

        }

    }

    public void print() {

        for (int i = 0; i < this.size(); i++) {

            if (this.isEmpty()) {

                System.out.println("Empty!");

            } else {

                System.out.println(queArray[i]);

            }

        }

    }

}
