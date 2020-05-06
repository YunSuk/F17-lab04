package edu.ucsb.cs56.drawings.ferb120.advanced;
import java.awt.geom.GeneralPath;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Line2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

public class GriddedWindow extends Window implements Shape{

	public GriddedWindow(double x, double y, double width, double height){
		super(x,y,width,height);
		
		GeneralPath gp = this.get();

		double w = 2* width/30;
		double h =  2* height/10;

		Line2D.Double lLeftBar = new Line2D.Double(x + w, y, x+w,y+height);
		Line2D.Double lRightBar = new Line2D.Double(x + width/3 - w, y, x + width/3 - w, y + height);
		Line2D.Double lTopBar = new Line2D.Double(x, y + h, x + width/3, y + h);
		Line2D.Double lBottomBar = new Line2D.Double(x,y + height - h, x + width/3, y + height - h );

		Line2D.Double lMiddleBar = new Line2D.Double(x + width/3 + w, y, x + width/3 +w, y + height);
		Line2D.Double rMiddleBar = new Line2D.Double(x + 2*width/3 - w, y, x + 2*width/3  - w, y + height);

		GeneralPath leftBars  = new GeneralPath();
		leftBars.append(lLeftBar, false);
		leftBars.append(lRightBar, false);
		leftBars.append(lBottomBar, false);
		leftBars.append(lTopBar, false);

		Shape rightBars = ShapeTransforms.horizontallyFlippedCopyOf(leftBars);
		rightBars = ShapeTransforms.translatedCopyOf(rightBars,width, 0.0);

		gp.append(leftBars,false);
		gp.append(rightBars,false);
		//gp.append(lMiddleBar,false);
		//gp.append(rMiddleBar,false);


	}



}
