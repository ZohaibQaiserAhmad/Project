/*


 +* Name: Zohaib Ahmad
 +
 + * Date : Tuesday , May 9th
 +
 + * Version : v0.01
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
    private int rear;

    //Default constructor
    public Queue() {

        this(DEFAULT_SIZE);

    }

    public Queue(int capacity) {

        front = 0;
        rear = -1;

        queArray = new int[capacity];

    }

    @Override
    public int front() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int back() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void enqueue(int value) {
        
        
        if(this.isFull()){
            
            System.out.println("Full!");
            
        } else {
            
            rear++;
            
            
        }
       

    }

    @Override
    public int dequeue() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int size() {
        if (front > rear) {
            return front - rear + 1;
        } else if (front > rear) {
            return this.capacity() - rear + front + 1;
        } else {
            return 0;
        }

    }

    @Override
    public int capacity() {

        return this.queArray.length;

    }

    @Override
    public boolean isEmpty() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isFull() {

      return this.capacity() == this.size();

    }

    @Override
    public void makeEmpty() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
