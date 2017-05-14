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
        
        //Creates new stack of which will test the stacks properties
        Stack stack = new Stack();
        
        //Checks to see what happens when top is set to default value (invalid number)
        assert (stack.top() == -1);
        
        //Checks to see what pop does when it is set to -1 (invalid number)
        assert (stack.pop() == -1);
        
        //Checks to see what happens when size is set to 0
        assert (stack.size() == 0);
        
        //Checks to see what happens when capacity is set to equal to the default size
        assert (stack.capacity() == Stack.DEFAULT_SIZE);
        
        //Checks to see what stack.isempty method returns
        assert (stack.isEmpty());
        
         //Checks to see what stack.isfull method returns
        assert (stack.isFull());
        
        //Creates custom stack of which will be used to test certain properties of stacks(method(s))
        Stack stacks = new Stack(3);
        
        //Tests push method
        stacks.push(3);
        stacks.push(4);
        stacks.push(5);
        
        //Tests pop on a custom method
        System.out.println(stacks.pop());

        System.out.println();
        
        //Prints out the whole stack - tests print method
        stacks.print();
        
        //Makes sure .makeEmpty works
        stacks.makeEmpty();
        
        //used to print after make empty used (verifies it works)
        stacks.print();


    }

}
