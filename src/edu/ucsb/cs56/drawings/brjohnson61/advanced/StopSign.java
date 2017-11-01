package edu.ucsb.cs56.drawings.brjohnson61.advanced;
import java.awt.geom.GeneralPath;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Line2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.RectangularShape;

/**
   A Stop Sign

   @author Blake Johnson
   @version for CS56, F17, UCSB, github: brjohnson61 csil: brjohnson61

*/
public class StopSign extends Sign implements Shape
{
    /**
     * Constructor for objects of class StopSign
     */
    public StopSign(double x, double y, double width, double height)
    {
        // construct the basic sign shell
        super(x,y,width,height);

        // get the GeneralPath that we are going to append stuff to
        GeneralPath p = this.get();

        // Make four letters  where w=width/13.0;


	double postHeight = .75*height;
        double octHeight = .25*height;
        double octLowerY = y - postHeight;
        double octUpperY = y - height;

        double w =  width/13.0;
        double letterTopY = octUpperY + octHeight*.25;
        double letterBottomY = octLowerY - octHeight*.25;
	double letterMidY = letterTopY + (letterBottomY - letterTopY)/2.0;
	
	//Letter S
        Line2D.Double topS = new Line2D.Double(x + w, letterTopY, x + 3.0*w, letterTopY);
	Line2D.Double leftS = new Line2D.Double(x + w, letterTopY, x + w, letterMidY);
	Line2D.Double middleS = new Line2D.Double(x + w, letterMidY, x + 3.0*w, letterMidY);
	Line2D.Double rightS = new Line2D.Double(x + w*3.0, letterMidY, x + w*3.0, letterBottomY);
	Line2D.Double bottomS = new Line2D.Double(x + w, letterBottomY, x + w*3.0, letterBottomY);

	//Letter T
	Line2D.Double topT = new Line2D.Double(x + w*4.0, letterTopY, x + w*6.0, letterTopY);
	Line2D.Double baseT = new Line2D.Double(x + w*5.0, letterTopY, x + w*5.0, letterBottomY);
	
	//Letter O
	Rectangle2D.Double letterO = new Rectangle2D.Double(x + w*7.0, letterTopY, 2.0*w, letterBottomY - letterTopY);
	
	
	//Letter P
	Line2D.Double topP = new Line2D.Double(x + w*10.0, letterTopY, x + w*12.0, letterTopY);
	Line2D.Double baseP = new Line2D.Double(x + w*10.0, letterTopY, x + w*10.0, letterBottomY);
	Line2D.Double rightP = new Line2D.Double(x + w*12.0, letterTopY, x + w*12.0, letterMidY);
	Line2D.Double midP = new Line2D.Double(x + w*10.0, letterMidY, x + w*12.0, letterMidY);


        // add the letters to the sign
        // Look up the meaning of the second parameter of append
        // (Hint--is a method of "GeneralPath")

	GeneralPath gp = this.get();

        gp.append(topS, false);
        gp.append(leftS, false);
        gp.append(middleS, false);
        gp.append(rightS, false);
        gp.append(bottomS, false);
        gp.append(topT, false);
        gp.append(baseT, false);
        gp.append(letterO, false);
        gp.append(topP, false);
        gp.append(baseP, false);
	gp.append(rightP, false);
	gp.append(midP, false);

    }
}
