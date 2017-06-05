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

        //Creates custom stacks of which will be used to test certain properties of stacks(method(s))
        Stack stacks = new Stack(3);
        Stack stackz = new Stack(0);
        Stack stackr = new Stack(4);
        Stack defaults = new Stack();

        //Tests Top
        System.out.println("-----------Tester for Top-------------");
        //1) stack with size of 0
        System.out.println("Empty (top) : " + stackz.top());

        //2)(Semi-Full) - top
        stackr.push(5);
        stackr.push(2);
        System.out.println("Semi - Full (top) : " + stackr.top());

        //3)Default Size Constructor - top
        System.out.println("Default Constructor (top) : " + defaults.top());

        //4)Full
        stacks.push(1);
        stacks.push(2);
        stacks.push(3);

        System.out.println("Full (Top) : " + stackz.top());
        
        //Tester for pop
        System.out.println("----------Tester for pop------------");
        
        //1)stack with size of 0
        stackz.pop();
        System.out.println("Empty (pop) - The new top is : " + stackz.top() + "\n" );
        
        //2)(Semi-Full) - pop
        stackr.pop();
        System.out.println("Semi - Full (Pop) - The new top is : " + stackr.top() + "\n" );
        
        //3) Default size Constructor - pop
        defaults.pop();
        System.out.println("Default Constructor (Pop) - The new top is :  " + defaults.top() + "\n" );
        
        //4) Full -  pop
        stacks.pop();
        System.out.println( "Full Size (pop) - The new top is: " + stacks.top() );
        
        //Tester for Push
         System.out.println("----------Tester for push------------");
        
        //1)Pushing to a stack with size of 0
        System.out.println("Pushing to an empty stack : ");
        stackz.push(10);
        
        //2)Pushing to a semi-full stack
         System.out.println("Pushing to an semi full stack - Adds onto the top of stack : ");
         stackr.push(10);
         stackr.print();
         
         //3) Default size Constructor - push
          System.out.println("Pushing to an default constructor stack : ");
          defaults.push(100);
          defaults.print();
          
        //4 Full - Push
            
          //To make stack full beforehand
          stacks.push(100);  
          System.out.println("Pushing to a full stack : ");
          stacks.push(100);
          
        
          
       
        
      
    
        
        
        

    }

}
