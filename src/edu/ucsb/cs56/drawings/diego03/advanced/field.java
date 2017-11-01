package edu.ucsb.cs56.drawings.diego03.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Line2D; 
import java.awt.geom.Rectangle2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A drawing of a field that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.
      
   @author Diego Perez
   @version for CS56, F17 , UCSB
   
*/
public class field extends GeneralPathWrapper implements Shape
{
    /**
       Constructor
       
       @param x coord of lower left corner of Field
       @param y coord of lower left corner of Field
       @param length is the length of the Field
       @param width is the width of the Field
    */
    public field(double x, double y, double width , double height)
    {
	
        // Rather than having to scale at the end, we can just
        // draw things the right way to begin with, using the
        // x, y, width and height.   If you haven't already
        // hard coded a particular drawing, this may be an easier
        // way. width is multiplied  by 1.7 to get more of a field appearance. 
        
        
        // Make the first story
	width = width * 1.70;         

        Rectangle2D.Double fieldBox = 
            new Rectangle2D.Double(x,y,width,height );
	
	Line2D.Double middleLine = 
	    new Line2D.Double ( x + (width / 2) , y, x+ (width /2) , y +  height );
	
        // put the whole Field together
	
        GeneralPath wholeField = this.get();
        wholeField.append(fieldBox, false);
	wholeField.append(middleLine,false);
    
    }
}
