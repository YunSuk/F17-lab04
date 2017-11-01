package edu.ucsb.cs56.drawings.tianyima.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Line2D; 
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A vector drawing of a house that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.
      
   @author Phill Conrad 
   @version for CS56, W16, UCSB
   
*/
public class SmartPhone extends GeneralPathWrapper implements Shape
{
    /**
       Constructor
       
       @param x x coord of lower left corner of house
       @param y y coord of lower left corner of house
       @param width width of the house
       @param height of house (including first story and second story)
    */
    public SmartPhone(double x, double y, double width, double height)
    {
	
        // Rather than having to scale at the end, we can just
        // draw things the right way to begin with, using the
        // x, y, width and height.   If you haven't already
        // hard coded a particular drawing, this may be an easier
        // way.
        
        double ScreenHeight = 0.6 * height;
        double ScreenUpperLeftX = x + 0.05 * width;
        double ScreenUpperLeftY = y - 0.8 * height;
        double PhoneUpperLeftY = y - height;
        // Make the first story
        
        Rectangle2D.Double Phone = 
            new Rectangle2D.Double(x, PhoneUpperLeftY ,
				   width, height);
	
        // make the roof.   Remember that y goes DOWN the page,
        // so we ADD to y to get a "lower" value on the screen
        
        Rectangle2D.Double Screen = 
            new Rectangle2D.Double (ScreenUpperLeftX, ScreenUpperLeftY,
				    0.9 * width , ScreenHeight);
	
        Ellipse2D.Double Button =
	    new Ellipse2D.Double (x+width/2-0.05*height, y-0.15*height, 0.1*height, 0.1 * height);
	
        // put the whole house together
	
        GeneralPath wholePhone = this.get();
        wholePhone.append(Phone, false);
        wholePhone.append(Screen, false);
        wholePhone.append(Button, false);    
    }
}
