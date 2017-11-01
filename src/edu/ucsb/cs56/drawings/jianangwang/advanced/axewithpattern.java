package edu.ucsb.cs56.drawings.jianangwang.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;



public class axewithpattern extends axe implements Shape
{

public axewithpattern(double x, double y, double width, double height)
    {
        super(x,y,width,height);
        
          GeneralPath gp = this.get();
        
         Rectangle2D.Double pattern_1 =
        new Rectangle2D.Double(height*0.7 + 0.1 *width, height*0.7+0.1 *width ,
                               height*0.1,width*0.1);
        
        Rectangle2D.Double pattern_2 =
        new Rectangle2D.Double(height*0.7 + 0.2 *width, height*0.7+0.2 *width ,
                               width*0.1,height*0.05);
        
        
        Rectangle2D.Double pattern_3 =
        new Rectangle2D.Double(height*0.7 + 0.4 *width, height*0.7+0.2 *width ,
                               height*0.1,width*0.1);
        
        Rectangle2D.Double pattern_4 =
        new Rectangle2D.Double(height*0.7 + 0.3 *width, height*0.7+0.3 *width ,
                               width*0.1,height*0.05);
        
        Rectangle2D.Double pattern_5 =
        new Rectangle2D.Double(height*0.7 + 0.4 *width, height*0.7+0.4 *width ,
                               height*0.1,width*0.1);
        
        Rectangle2D.Double pattern_6 =
        new Rectangle2D.Double(height*0.7 + 0.2 *width, height*0.7+0.3 *width ,
                               width*0.1,height*0.05);
        
        Ellipse2D.Double pattern_7 =
        new Ellipse2D.Double(height*0.5 + 0.2 *width, height*0.7+0.3 *width,
                               width/3,width/3);
        
        
        GeneralPath wholeH = this.get();
        wholeH.append(pattern_1, false);
        wholeH.append(pattern_2, false);
        wholeH.append(pattern_3, false);
        wholeH.append(pattern_4, false);
        wholeH.append(pattern_5, false);
        wholeH.append(pattern_6, false);
        wholeH.append(pattern_7, false);
    }
}
