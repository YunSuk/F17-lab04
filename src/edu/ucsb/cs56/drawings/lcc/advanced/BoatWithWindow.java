package edu.ucsb.cs56.drawings.lcc.advanced;
import java.awt.geom.GeneralPath;  
import java.awt.Shape; 
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;  // ellipses and circles

/**
   Boat with Windows
      
   @author Chucheng Lin    
*/

public class BoatWithWindow extends Boat implements Shape
{
    public BoatWithWindow(double x, double y, double width, double height)
    {
	super(x,y,width,height);
	
	// get the GeneralPath that we are going to append stuff to
	GeneralPath gp = this.get();
	
	double w = 0.10 * width;
	double winTop = y+0.1*height;
	double winHt =  0.25 * height;

	Rectangle2D.Double win1 =
	    new Rectangle2D.Double(x+7*w, winTop, 2.0 * w, winHt);

	Rectangle2D.Double win2 =
	    new Rectangle2D.Double(x+10*w, winTop, 2.0 * w, winHt);


	
        GeneralPath newboat= this.get();
        newboat.append(win1, false);
        newboat.append(win2, false);

    }    
}
