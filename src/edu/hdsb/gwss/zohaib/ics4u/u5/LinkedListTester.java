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
public class LinkedListTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        LinkedList li = new LinkedList("rd");

        li.addAtFront("1");
        
        li.remove("60000");
      

        System.out.println(li.toString());

    }

}
