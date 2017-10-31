package edu.ucsb.cs56.drawings.lcc.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Line2D; 
import java.awt.geom.Rectangle2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A vector drawing of a Boat that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.
      
   @author Chucheng Lin    
*/
public class Boat extends GeneralPathWrapper implements Shape
{
    public Boat(double x, double y, double width, double height)
    {
        
        GeneralPath boat = new GeneralPath();
	
	boat.moveTo(x,y);
	boat.lineTo(x+width+width*0.8, y);
	boat.lineTo(x+width+width*0.2, y+0.5*height);
	boat.lineTo(x+width-width*0.2, y+height*0.5);
	boat.lineTo(x,y);

	
        this.set(new GeneralPath(boat));   
    }
}
