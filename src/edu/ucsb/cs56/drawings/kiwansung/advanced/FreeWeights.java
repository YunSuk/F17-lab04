package edu.ucsb.cs56.drawings.kiwansung.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Line2D; 
import java.awt.geom.Rectangle2D;
import java.awt.Graphics2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

public class FreeWeights extends GeneralPathWrapper implements Shape{
    public FreeWeights(double x, double y, double width, double length)
    {
	
	double BarLength = .75 * length;
	double BarWidth = .1 * width;
	double xL = x + BarLength;
	double yL = y+BarWidth;
	double yR = y-BarWidth;
       
	
	Line2D.Double BarTop = new Line2D.Double(xL, yL, x, yL);
	Line2D.Double BarBottom = new Line2D.Double(xL, yR, x, yR);

       
	double PlateWidth = 3.0 * BarWidth;
	double PlateHeight = 0.5 * BarLength;

	Line2D.Double LPlateLine1 = new Line2D.Double(xL + PlateWidth, yL + PlateHeight, xL + PlateWidth, yR-PlateHeight);
	Line2D.Double LPlateLine2 = new Line2D.Double(xL, yL + PlateHeight, xL, yR-PlateHeight);
	Line2D.Double LPlateLine3 = new Line2D.Double(xL + PlateWidth, yL + PlateHeight, xL, yL+PlateHeight);
	Line2D.Double LPlateLine4 = new Line2D.Double(xL + PlateWidth, yR - PlateHeight, xL, yR-PlateHeight);

	Line2D.Double RPlateLine1 = new Line2D.Double(x - PlateWidth, yL + PlateHeight, x - PlateWidth, yR-PlateHeight);
	Line2D.Double RPlateLine2 = new Line2D.Double(x, yL + PlateHeight, x, yR-PlateHeight);
	Line2D.Double RPlateLine3 = new Line2D.Double(x - PlateWidth, yL + PlateHeight, x, yL+PlateHeight);
	Line2D.Double RPlateLine4 = new Line2D.Double(x - PlateWidth, yR - PlateHeight, x, yR-PlateHeight);

	GeneralPath wholeFreeWeights = this.get();
	wholeFreeWeights.append(BarTop, false);
	wholeFreeWeights.append(BarBottom, false);
	wholeFreeWeights.append(LPlateLine1, false);
	wholeFreeWeights.append(LPlateLine2, false);
	wholeFreeWeights.append(LPlateLine3, false);
	wholeFreeWeights.append(LPlateLine4, false);
	wholeFreeWeights.append(RPlateLine1, false);
	wholeFreeWeights.append(RPlateLine2, false);
	wholeFreeWeights.append(RPlateLine3, false);
	wholeFreeWeights.append(RPlateLine4, false);
     
    }
}
