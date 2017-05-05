/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.zohaib.ics4u.u5;

import java.util.Arrays;

/**
 *
 * @author 1ahmadzoh
 */
public class StackTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Stack stack = new Stack();

        assert (stack.isEmpty());
        assert (stack.top() == -1);
        assert (stack.pop() == -1);
        assert (stack.size() == 0);
        assert (stack.capacity() == Stack.DEFAULT_SIZE);

        stack.push(5);
        stack.push(5);
        stack.push(5);
        stack.push(5);
        stack.push(5);
        
        stack.makeEmpty();
        

//        public int top();
//
//    public int pop();
//
//    public void push( int value );
//
//    
//    public int capacity();
//
//    public boolean isEmpty();
//    
//    public boolean isFull();
//
//    public void makeEmpty();
    }

}
