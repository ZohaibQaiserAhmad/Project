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

    public static final int DEFAULT_SIZE = 5;

    //Array
    private int[] queArray;

    //Variables    
    private int front;
    private int back;

    //Default constructor
    public Queue() {

        this(DEFAULT_SIZE);

    }

    public Queue(int capacity) {

        front = 0;
        back = -1;

        queArray = new int[capacity];

    }

    @Override
    public int front() {

        if (this.isEmpty()) {
            return -1;
        } else {
            return this.queArray[this.front];
        }

    }

    @Override
    public int back() {

        if (this.isEmpty()) {
            return -1;
        } else {
            return this.queArray[this.back];
        }

    }

    @Override
    public void enqueue(int value) {

        if (this.isFull()) {

            System.out.println("Full!");

        } else {

            back++;
            queArray[back] = value;
            System.out.println(queArray[back]);

            if (back == this.capacity()) {

                back = 0;
                queArray[back] = value;
                System.out.println(queArray[back]);

            }

        }

    }

    @Override
    public int dequeue() {

        if (this.isEmpty()) {

            return - 1;

        } else {

            front++;

            if (front == this.capacity() - 1) {

                front = 0;
                return queArray[front];

            }

        }
        front--;
        return queArray[front];

    }

    @Override
    public int size() {
        if (front > back) {

            return front - back + 1;

        } else if (back > front) {

            return this.capacity() - back + front + 1;
        } else if (front == back) {

            return 0;

        } else {

            return -1;

        }

    }

    @Override
    public int capacity() {

        return this.queArray.length;

    }

    @Override
    public boolean isEmpty() {

        return front == 0 && back == -1;

    }

    @Override
    public boolean isFull() {

        return this.capacity() == this.size();

    }

    @Override
    public void makeEmpty() {

        while (back != -1) {

            back--;

        }

        while (front != 0) {

            front--;

        }

    }

    public void print() {

        for (int i = front; i <= back; i++) {
            System.out.print(queArray[i] + "   ");
        }
        System.out.println();
    }

}
