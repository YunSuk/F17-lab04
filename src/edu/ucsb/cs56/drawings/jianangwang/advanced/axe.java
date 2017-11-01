package edu.ucsb.cs56.drawings.jianangwang.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;


public class axe extends GeneralPathWrapper implements Shape
{



public axe (double x, double y, double width, double height)
    {
    Rectangle2D.Double stick =
    new Rectangle2D.Double(height*0.7, height*0.7 ,
                           height*0.7,width);
    
    Rectangle2D.Double stick_b =
    new Rectangle2D.Double(height*0.7, height*0.7 ,
                            width*2,height*0.2);
    
    
    
    GeneralPath whole = this.get();
    whole.append(stick, false);
    whole.append(stick_b, false);
    }
}
