package edu.ucsb.cs56.drawings.vanessam.advanced;
import java.awt.geom.GeneralPath;  
import java.awt.Shape; 
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

public class CircleWithCross extends Circle implements Shape 
{
	// Constructor for objects of Target
	public CircleWithCross(double x, double y, double radiusx, double radiusy) {
	super(x,y,radiusx,radiusy);
	GeneralPath gp = this.get();
      	   
	//add one line horizontal and then vertical in the center	   
	Line2D.Double line1 = 
	new Line2D.Double(x+(radiusx/2),y,x+(radiusx/2),y+radiusy);
	Line2D.Double line2 = 
	new Line2D.Double(x,y+(radiusy/2),x+radiusx,y+(radiusy/2));	
	
	GeneralPath wholecircle = this.get();
     	wholecircle.append(line1, false);
	wholecircle.append(line2, false);
	}
}

	   

