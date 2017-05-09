/*


 +* Name: Zohaib Ahmad
 +
 + * Date : Monday , May 8rd
 +
 + * Version : v0.04
 +
 +  * Description : Tests Stack and all its functions

 */
package edu.hdsb.gwss.zohaib.ics4u.u5;

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

        assert (stack.top() == -1);
        assert (stack.pop() == -1);
        assert (stack.size() == 0);
        assert (stack.capacity() == Stack.DEFAULT_SIZE);
        assert (stack.isEmpty());

        Stack stacks = new Stack(3);

        stacks.push(3);
        stacks.push(4);
        stacks.push(5);

        System.out.println(stacks.pop());

        System.out.println();

        stacks.print();

        stacks.makeEmpty();

        stacks.print();

        // stacks.print();
//    public int top();
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
