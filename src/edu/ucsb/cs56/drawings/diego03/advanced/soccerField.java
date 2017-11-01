package edu.ucsb.cs56.drawings.diego03.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;
import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;


public class soccerField extends field implements Shape
{
    /**
     * Constructor for objects of soccerField 
     */
    public soccerField(double x, double y, double width,double height)
    {
	super( x,y,width,height);
	width = width * 1.7;
   	GeneralPath gp = this.get();
	double centerX = x + (width/2);
	double centerY = y + (height/2);
	//code from the field class
	Rectangle2D.Double fieldBox = 
		new Rectangle2D.Double(x,y,width,height);
	Line2D.Double middleLine = 
		new Line2D.Double(x + (width/2) , y ,x + (width/2) , y + height);
        Rectangle2D.Double leftPenaltyBox =
	       new Rectangle2D.Double(x , y + height * .25 , 25 , 40);  	
	Rectangle2D.Double rightPenaltyBox = 
		new Rectangle2D.Double(x + width - 25  , y + height * .25, 25, 40); 

	

	double radius = 9.144 * 1.7;

	Ellipse2D.Double middleCircle  
		= new Ellipse2D.Double (centerX - radius/2 ,centerY - radius/2, radius, radius);

	GeneralPath wholeField = this.get();
	wholeField.append(middleCircle,false);
	wholeField.append(fieldBox,false);
	wholeField.append(middleLine,false);
	wholeField.append(leftPenaltyBox,false);
	wholeField.append(rightPenaltyBox,false);
    }
}

