/*


 +* Name: Zohaib Ahmad
 +
 + * Date : Sunday , May 14
 +
 + * Version : v0.01
 +
 +  * Description : Tests Que and all its functions

 */
package edu.hdsb.gwss.zohaib.ics4u.u5;

/**
 *
 * @author Zohaib-PC
 */
public class QueTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Creates que object in order to test all of its properties
        Queue que = new Queue();

        //Checks to see what happens when back is equal to - 1 (if runs successfully)
        assert (que.back() == -1);

        //Checks to see what happens when front is equal to -1 (if runs successfully)
        assert (que.front() == -1);

        //Checks to see what happens when deque is equal to -1 (if runs successfully)
        assert (que.dequeue() == -1);

        //Creates a stack with non default size
        Queue ques = new Queue(4);

        ques.enqueue(50);
        ques.enqueue(50);

        System.out.println(ques.size());

        ques.print();

    }

}
