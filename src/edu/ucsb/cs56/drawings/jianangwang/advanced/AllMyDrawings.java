package edu.ucsb.cs56.drawings.jianangwang.advanced;

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
 * @author Phill Conrad, James Wang
 * @version for UCSB CS56, W16 
 */

public class AllMyDrawings
{
    /** Draw a picture with a few houses 
     */
    
    public static void drawPicture1(Graphics2D g2) {
	
	axe h1 = new axe(100,250,50,75);
	g2.setColor(Color.CYAN); g2.draw(h1);
	
	
	Shape h2 = ShapeTransforms.scaledCopyOfLL(h1,0.5,0.5);
	h2 = ShapeTransforms.translatedCopyOf(h2,150,0);
	g2.setColor(Color.BLACK); g2.draw(h2);
	
	h2 = ShapeTransforms.scaledCopyOfLL(h2,4,4);
	h2 = ShapeTransforms.translatedCopyOf(h2,150,0);
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(h2); 
	
	// Draw two axes
	
	axewithpattern hw1 = new axewithpattern(25,87,60,40);
	axewithpattern hw2 = new axewithpattern(100,350,300,200);
	
	g2.draw(hw1);
	g2.setColor(new Color(0x8F00FF)); g2.draw(hw2);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A few Axes by James Wang", 20,20);
    }
    
    
    /** Draw a picture with a few Axes and Axes with patterns on it
     */
    public static void drawPicture2(Graphics2D g2) {
	
	// Draw some different size Axes and Axes with patterns
	
	axewithpattern large = new axewithpattern(100,200,225,150);
	axewithpattern smallCC = new axewithpattern(300,300,45,30);
	axe shortFat = new axe(150,250,200,400);
	
	g2.setColor(Color.RED);     g2.draw(large);
	g2.setColor(Color.GREEN);   g2.draw(smallCC);
	g2.setColor(Color.MAGENTA); g2.draw(shortFat);
	
	axe h1 = new axe(100,250,50,75);
	g2.setColor(Color.CYAN); g2.draw(h1);
	
	// Make a Axe that's half the size,
	// and moved over 150 pixels in x direction
	Shape h2 = ShapeTransforms.scaledCopyOfLL(h1,0.5,0.5);
	h2 = ShapeTransforms.translatedCopyOf(h2,150,0);
	g2.setColor(Color.BLACK); g2.draw(h2);
	
	// Here's a axe that's 4x as big (2x the original)
	// and moved over 150 more pixels to right.
	h2 = ShapeTransforms.scaledCopyOfLL(h2,4,4);
	h2 = ShapeTransforms.translatedCopyOf(h2,150,0);
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	

	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(h2); 
	
	// Draw two Axes with patterns
	
	axewithpattern hw1 = new axewithpattern(50,350,112.5,75);
	axewithpattern hw2 = new axewithpattern(200,350,225,150);
	
	g2.draw(hw1);
	g2.setColor(new Color(0x8F00FF)); 
	
	// Rotate the second house 45 degrees around its center.
	Shape hw3 = ShapeTransforms.rotatedCopyOf(hw2, Math.PI/8.0);
	
	g2.draw(hw3);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A bunch of Axes and a few Axe with patterns by James Wang", 20,400);
    }
    
    /** Draw a different picture with a few axes and axes with patterns
     */
    
    public static void drawPicture3(Graphics2D g2) {
	
	// label the drawing
	
	g2.drawString("A bunch of Axes by James Wang", 20,20);
	
	
	// Draw some Axes
	
	axe large = new axe(100,50,225,150);
	axewithpattern smallCC = new axewithpattern(20,50,40,30);
	
	g2.setColor(Color.RED);     g2.draw(large);
	g2.setColor(Color.GREEN);   g2.draw(smallCC);
	
    }       
}
