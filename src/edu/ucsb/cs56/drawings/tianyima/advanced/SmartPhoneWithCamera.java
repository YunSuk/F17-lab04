package edu.ucsb.cs56.drawings.tianyima.advanced;
import java.awt.geom.GeneralPath;  
import java.awt.Shape; 
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;

/**
   A House
      
   @author Phill Conrad 
   @version for CS56, W16, UCSB
   
*/
public class SmartPhoneWithCamera extends SmartPhone implements Shape
{
    /**
     * Constructor for objects of class CoffeeCup
     */
    public SmartPhoneWithCamera(double x, double y, double width, double height)
    {
	// construct the basic house shell
	super(x,y,width,height);
	
	// get the GeneralPath that we are going to append stuff to
	GeneralPath gp = this.get();
	
	// Make three windows, spaced like this, where w=width/10.0;
	// | +--+ +--+ +--+ |
	// | |  | |  | |  | |
	// | +--+ +--+ +--+ |
	// |w 2w w 2w w w2 w|
	//
	// The top of window will be at y + 0.5*height and the
	// height of the window is 0.25height;
	
	Ellipse2D.Double dot1 =
	    new Ellipse2D.Double(x + 0.3*width, y-0.91*height, 0.05*width,0.05*width );
	Ellipse2D.Double dot2 =
	    new Ellipse2D.Double(x + width/2 - 0.08*width/2, y-0.95*height, 0.08*width, 0.08*width);
	Ellipse2D.Double dot3 =
	    new Ellipse2D.Double(x + width/2 - 0.05*width,y-0.97*height ,0.1*width, 0.1*width);
	
	// add the windows to the house
	// Look up the meaning of the second parameter of append
	// (Hint--is a method of "GeneralPath")
	
        GeneralPath wholeHouse = this.get();
        wholeHouse.append(dot1, false);
        wholeHouse.append(dot2, false);
        wholeHouse.append(dot3, false); 
    }    
}
