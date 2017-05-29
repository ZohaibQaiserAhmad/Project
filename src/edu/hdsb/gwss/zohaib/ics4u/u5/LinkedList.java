/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.zohaib.ics4u.u5;

/**
 *
 * @author Zohaib-PC
 */
public class LinkedList implements LinkListInterface {

    //Variables : node - head and tail , int for size , string data (private for security reasons)
    private static Node head;
    private static int size;
    private static Node tail;
    String data;

    //Constructor that is called when class is used
    public LinkedList(String data) {

        //Sets head and tail to null and size to 0 and data to the argument of the constructor
        LinkedList.head = null;
        LinkedList.tail = null;

        //Set the size to 0 and data to the argument
        LinkedList.size = 0;
        this.data = data;

    }

    @Override
    //Method to determine size
    public int size() {

        //Returns the value of size
        return LinkedList.size;

    }

    @Override
    //Method to make the list empty
    public void makeEmpty() {

        //Make empty by setting head(front) and tail(back) to  null
        LinkedList.head = null;
        LinkedList.tail = null;

    }

    @Override
    //Method to check if the list is empty
    public boolean isEmpty() {

        //If the size is 0 then it is empty
        return LinkedList.size == 0;

    }

    @Override
    public void addAtFront(String str) {

        //Creates a node and sets it to head
        Node front = head;

        //Sets the head to the new created node with data inputed in argument
        head = new Node(str, head);

        //Sets head of next to front that was created before
        head.setNext(front);

        //Increase the size with one everytime you add to the front
        size++;

        //If new node is the only node in the list (when tail is null) then set tail to head
        if (tail == null) {

            tail = head;

        }

    }

    @Override
    public void addAtEnd(String str) {

        //Creates new node to implement the data at the end (tail)
        Node end = tail;

        //Sets str to data
        end.data = str;

        //if head is equal to null do the following
        if (head == null) {

            //Set head to newly created node
            head = end;

            //Point the head to tail
            head.next = tail;

            //Tail points to head
            tail = end;

            //If  head is not set to null then set tail.next to node  
        } else {

            //Links the new with the last node
            tail.next = end;

            //Tail now points to last node
            tail = tail.next;

        }

        //Increase the size of list everytime you add to the end
        size++;

    }

    @Override
    //Used to remove a specific data
    public void remove(String str) {

        //If it is empty theres nothing to remove
        if (this.isEmpty()) {

            System.out.println("Empty!");

        }

        //Nodes
        //Create  a node for "previous" and set it to null
        Node previous = null;

        //Create a node  for "current" and set it to the head
        Node current = head;

        //While loop , while current is not null and found is not false
        while (current != null) {

            //If current is equal to value in parameters to the following
            if (current.equals(str)) {

                //If found then remove it by decreasing size at that point
                size--;

            }

            //If previous is equal to null then set head to current .next
            if (previous == null) {
                head = current.next;

                //Else set previous next to currents next
            } else {

                previous.next = current.next;

            }

            //if statement : previous is node before current if currents next is not head
            if (current.next != head) {

                previous = current;

            }

            //Set current to next
            current = current.next;

        }
    }

    @Override
    //Method to remove the head
    public String removeHead() {

        //If head is null then its empty
        if (head == null) {

            //return null for empty
            return null;

            //If head is not null then do this
        } else {

            //Create a nod "front" and set it to head
            Node front = head;

            //Head will equal to tmp nod next
            head = front.getNext();

            //Decrease the size when removing
            size--;

            //If head is equal to null set the  tail to null
            if (head == null) {

                LinkedList.tail = null;

            }

            //Return the value of the front  
            return front.getValue();

        }

    }

    @Override
    //Method to remove the tail
    public String removeTail() {

        //Case switch / with size 
        switch (size) {

            //If the size is 0 then theirs nothing to remove so return null
            case 0:
                return null;

            //If the size is 1 however then do the following
            case 1:
                //Create a node and make it equal to head
                Node front = head;

                //Make the head equal to the tail and set tail and head to null
                head = tail;
                tail = null;
                head = null;

                //Set the size to 0
                size = 0;

                //Return the value of front
                return front.data;

            //If not of the other statements conditions are met to the following
            default:
                //Create a node and set it to head
                Node current = head;

                //For loop and iterate through the list
                //for int i is equal to 0 , i is less then size - 2 and increase i each time by one
                for (int i = 0; i < size - 2; i++) {

                    //Set the current to the next
                    current = current.next;

                }

                //Do the following regardless of the sizes
                //Create a node and set it to tail
                Node end = tail;

                //set tail to the current
                tail = current;

                //Set tails next to null
                tail.next = null;

                //Decrease the size everytime you remove the tail
                size--;

                //Return the tail value
                return end.data;
        }

    }

    @Override
    //Method to determine head
    public String head() {

        //If head is null then there is nothing to return
        if (head == null) {

            System.out.println("No Value!");

        }

        //If its not null return the value of head
        return head.data;

    }

    @Override
    //Method to determine tail
    public String tail() {

        //If head is equal to null then theirs no tail
        if (head == null) {

            System.out.println("No Value!");

        }

        //Create a node and set it to head
        Node front = head;

        //While loop to iterate through the list
        while (front.next != null) {

            //Set front to fronts next
            front = front.next;

        }

        //Return the value of front data
        return front.data;

    }

    @Override
    //Method used to convert to string
    public String toString() {

        //Create a string builder to format the output
        StringBuilder result = new StringBuilder("[");

        //Creates a node "current" and sets it to head
        Node current = head;

        //For  loop to iterate through the list , i = 0 , i is less then size and current cant be null, increase i each time  
        for (int i = 0; i < size && current != null; i++) {

            //append to the  result - add data and format 
            result.append(current.data);

            //Set current to next in the list
            current = current.next;

            //Used to seperate two "items" with a comma
            result.append(",");

        }

        //Once Finished used closed bracket for format
        //Used to close the string
        result.append("]");

        //Return the result into string format
        return result.toString();

    }

}
