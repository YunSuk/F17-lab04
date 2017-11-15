package edu.ucsb.cs56.drawings.vanessam.advanced;
import java.awt.geom.GeneralPath;
import java.awt.Shape; 

import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A vector drawing of a house that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.
      
   @author Vanessa Mejia 
   @version for CS56, F17, UCSB
*/

public class Circle extends GeneralPathWrapper implements Shape
{
 	public Circle(double x, double y, double radiusx, double radiusy) {
	//make the circle
	Ellipse2D.Double circ = 
	new Ellipse2D.Double(x,y,radiusx,radiusy);

	GeneralPath wholecircle = this.get();
	wholecircle.append(circ, false);
        }
}


