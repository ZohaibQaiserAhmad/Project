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
public class Node implements NodeInterface {

    //Private variables for node - next , String Variable  to hold data 
    public Node next;
    public String data;

    //Construtor of which be used to call this Node Class Each time
    public Node(String data, Node next) {
        
        //Sets data and next to the arguments of constructor
        this.data = data;
        this.next = next;

    }

    @Override
    public Node getNext() {

        //Returns the value of the next node
        return this.next;

    }

    @Override
    public void setNext(Node newNode) {

        //Sets the next node to the argument given in the parameter of method
        this.next = newNode;

    }

    @Override
    public String getValue() {
        
        //Returns the value of the node in string
        return data;
        
        
    }

}
