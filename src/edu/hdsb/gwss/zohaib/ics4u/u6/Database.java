/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.zohaib.ics4u.u6;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 1ahmadzoh
 */
public class Database {
    
    private RandomAccessFile raf;

    public Database() {
        
        try {
            this.raf = new RandomAccessFile( "student.txt","rw" );
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public StudentRecord save( StudentRecord s ) {
        
        try {
            // ADD or UPDATE?
            if( s.getDbID() == -1 ) {

                    // ADD
                    this.raf.seek( this.raf.length() );

            }
            else {
                // UPDATE
                // CALCULATE THE LOCATION
            }

            // WRITE YOUR WHOLE FILE
            
            //Writes student id
            this.raf.writeDouble( s.getStudentID() );
            
            //writes name
            this.raf.writeChars( s.getName() );
            
            //Writes can graduate
            this.raf.writeBoolean(s.isCanGraduate());
            
            //Writes gender
            this.raf.writeChar(s.getGender());
            
            //Writes weight
            this.raf.writeDouble(s.getWeight());
            
            //Writes grade
            this.raf.writeInt(s.getGrade());
            
            //Writes average
            this.raf.writeInt(s.getAverage());
            
            //Writes coursetitle
            this.raf.writeChars(raf.length());
        
            
            System.out.println(this.raf.length() );
            
            if( s.getDbID() == -1 ) {
                // UPDATE THE DATABASE ID\
                
            }
        } catch( Exception e ) {
            e.printStackTrace();
        }
        return null;
    }
    
    public StudentRecord get( int id ) {
        return null;
    }
    
    public void close() {
        try {
            this.raf.close();
        } catch (Exception ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
