package edu.ucsb.cs56.drawings.diego03.advanced;

import java.awt.Graphics2D;
import java.awt.Shape; // general class for shapes
import java.awt.Color; // class for Colors
import java.awt.Stroke;
import java.awt.BasicStroke;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
 * A class with static methods for drawing various pictures
 * 
 * @author Phill Conrad 
 * @version for UCSB CS56, W16 
 */

public class AllMyDrawings
{
    /** Draw a picture with a few houses 
     */
    
    public static void drawPicture1(Graphics2D g2) {
	
	field  f1 = new field(100,100,120,90);
	g2.setColor(Color.GREEN); g2.draw(f1);
	
	// Maxiumum Standard Field parameters ( 120m x 90m) 

        field  f2 = new field(100,300,120,90);
	Shape f2Transform = ShapeTransforms.scaledCopyOfLL(f2,.75,.5);
	g2.setColor(Color.GREEN); g2.draw(f2Transform);

	// Use ShapeTransforms to change Maximum standard field parameters to the minimum ( 90m to 45m)
	
	
        
	
	// We'll draw the International Standard ( 110m by 75m )  with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// In HTML we use #, but in Java (and C/C++) its 0x
	field  f3 = new field(300,150,110,75);
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x008000)); 
	g2.draw(f3); 
	


	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	//g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A few fields by Diego", 20,20);
    }
    
    
    /** Draw a picture with a few houses and coffee cups
     */
    public static void drawPicture2(Graphics2D g2) {
	
	// Draw some soccer fields
	soccerField f1 = new soccerField(100,100,120,90);
	g2.setColor(Color.GREEN); g2.draw(f1);
	
	
    }
    
    /** Draw a different picture with a few houses and coffee cups
     */
    
    public static void drawPicture3(Graphics2D g2) {
	
	// label the drawing
	
	g2.drawString("A bunch of Soccer fields by Diego Perez", 20,20);
	//Base case using Maximum Standard field lengths
	soccerField f1 = new soccerField(100,100,120,90);
	g2.setColor(Color.GREEN); g2.draw(f1);

	
	// Draw some transformed soccer fields
	soccerField f2 = new soccerField(100,250,120,90);
	//scaled to the minimum standard (90m by 45 m)
	Shape f2Transform = ShapeTransforms.scaledCopyOfLL(f2,.75,.5);
	g2.setColor(Color.BLUE); g2.draw(f2Transform);
	
	//Draw International standards ( 110m by 90m)and 5 times bigger in thick strokes
        soccerField f3 = new soccerField(250, 250,110,90);
	Shape f3Transform = ShapeTransforms.scaledCopyOfLL(f3,2,2);
    	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);	
        Stroke orig=g2.getStroke();
        g2.setStroke(thick);
        g2.setColor(new Color(0x008000));
        g2.draw(f3Transform);

    }       
}
