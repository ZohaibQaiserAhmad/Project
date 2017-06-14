/*
 +* Name: Zohaib Ahmad
 
 + * Date : Wednesday , June 14 , 2017
 
 + * Version : v0.02

 + * Description : Final performance task  : Gui for the final performance task

 */


        


package edu.hdsb.gwss.zohaib.ics4u.pt;


import becker.xtras.imageTransformation.ITransformations;
import becker.xtras.imageTransformation.ImageTransformerGUI;
import edu.hdsb.gwss.zohaib.ics4u.pt.Transformer;



public class PhotoEditor extends Object
{
   public static void main(String args[])
   {  
      /*This main method will run a sample solution using a
      SampleTransformations object.  To run the code that YOU write,
      replace "SampleTransformations", below, with "Transformer".*/
      ITransformations trans = new Transformer();

      ImageTransformerGUI theGUI = new ImageTransformerGUI(trans);
   }

}