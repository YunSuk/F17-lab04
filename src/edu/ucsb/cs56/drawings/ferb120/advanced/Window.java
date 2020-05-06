package edu.ucsb.cs56.drawings.ferb120.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Line2D;
import java.awt.Shape; // general class for shapes

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/*
   A Coffee Cup (wrapper around a General Path, implements Shape)

   This provides an example of how you can start with the coordinates
   of a hard coded object, and end up with an object that can be
   drawn anywhere, with any width or height.   
      
   @author Phill Conrad 
   @version for CS56, W16, UCSB
   
*/
public class Window extends GeneralPathWrapper implements Shape
{
    /**
     * Constructor for objects of class CoffeeCup
     */
    public Window(double x, double y, double width, double height)
    {

        // Specify the upper left corner, and the 
        //  width and height of the original points used to 
        //  plot the *hard-coded* coffee cup
	
	final double ORIG_UL_X = 100.0;
	final double ORIG_UL_Y = 100.0;
	final double ORIG_HEIGHT = 100.0;
	final double ORIG_WIDTH = 300.0;
	
	
	Rectangle2D.Double outside = new Rectangle2D.Double(ORIG_UL_X, ORIG_UL_Y, ORIG_WIDTH,ORIG_HEIGHT);

	Line2D.Double leftBar = new Line2D.Double(ORIG_UL_X + ORIG_WIDTH/3, ORIG_UL_Y, ORIG_UL_X + ORIG_WIDTH/3, ORIG_UL_Y + ORIG_HEIGHT);		
	
	Line2D.Double rightBar = new Line2D.Double(ORIG_UL_X + 0.666 * ORIG_WIDTH, ORIG_UL_Y,ORIG_UL_X + 0.666 * ORIG_WIDTH ,ORIG_UL_Y + ORIG_HEIGHT);

	GeneralPath window = new GeneralPath();
	window.append(outside, false);
	window.append(leftBar, false);
	window.append(rightBar,false);

	Shape s = ShapeTransforms.translatedCopyOf(window,-ORIG_UL_X + x, -ORIG_UL_Y + y);
	s = ShapeTransforms.scaledCopyOf(s,width/ORIG_WIDTH,height/ORIG_HEIGHT);

	this.set(new GeneralPath(s));


    }

}

	
