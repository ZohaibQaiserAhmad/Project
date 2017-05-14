package edu.hdsb.gwss.zohaib.ics4u.u5;

/**
 * Lesson: 6.02 - Queue
 */
public interface QueueInterface {
    
    //done
    public int front();
    
    //done
    public int back();
    
    public void enqueue( int value );
    
    //done
    public int dequeue();

    public int size();
    
    public int capacity();

    public boolean isEmpty();
    
    public boolean isFull();

    public void makeEmpty();

}
