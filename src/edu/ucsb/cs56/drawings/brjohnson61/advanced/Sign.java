package edu.ucsb.cs56.drawings.brjohnson61.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A drawing of a sign that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.

   @author Blake Johnson
   @version for CS56, F17, Lab04, UCSB

*/
public class Sign extends GeneralPathWrapper implements Shape
{
    /**
       Constructor

       @param x x coord of lower left corner of sign
       @param y y coord of lower left corner of sign
       @param width width of the sign
       @param height of sign (including octagon and base)
    */
    public Sign(double x, double y, double width, double height)
    {

        // Rather than having to scale at the end, we can just
        // draw things the right way to begin with, using the
        // x, y, width and height.   If you haven't already
        // hard coded a particular drawing, this may be an easier
        // way.

        double postHeight = .75 * height;
        double octHeight = .25 * height;
	double octLowerY = y - postHeight;
	double octUpperY = y - height;
        // Make the post.

        Line2D.Double post =
            new Line2D.Double(x + width/2.0, y,
                                   x + width/2.0, octLowerY);

        // Remember that y goes DOWN the page,
        // so we ADD to y to get a "lower" value on the screen

        Line2D.Double top =
            new Line2D.Double (x + width * .25, octUpperY, x + width * .75, octUpperY);

        Line2D.Double bottom =
            new Line2D.Double (x + width * .25, octLowerY, x + width * .75, octLowerY);

        Line2D.Double ul =
            new Line2D.Double (x + width *.25, octUpperY, x, octUpperY + octHeight * .25);

        Line2D.Double ll = new Line2D.Double (x, octLowerY - octHeight * .25, x + width * .25, octLowerY);

	Line2D.Double lr = new Line2D.Double (x + width, octLowerY - octHeight * .25, x + width * .75, octLowerY);

        Line2D.Double ur = new Line2D.Double (x + width * .75, octUpperY, x + width, octUpperY + octHeight * .25);

        Line2D.Double right = new Line2D.Double (x + width, octUpperY + octHeight * .25, x + width, octLowerY - octHeight * .25);

        Line2D.Double left = new Line2D.Double (x, octUpperY + octHeight * .25, x, octLowerY - octHeight * .25);


        // put the whole sign together
        GeneralPath wholeSign = this.get();
        wholeSign.append(post, false);
        wholeSign.append(ll, false);
        wholeSign.append(ul, false);
	wholeSign.append(top, false);
	wholeSign.append(bottom, false);
	wholeSign.append(lr, false);
	wholeSign.append(ur, false);
	wholeSign.append(right, false);
	wholeSign.append(left, false);
    }
}
