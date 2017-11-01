package edu.ucsb.cs56.drawings.brjohnson61.advanced;

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
 * @author Blake Johnson
 * @version for UCSB CS56, F17 
 */

public class AllMyDrawings
{
    /** Draw a picture with a few signs 
     */
    
    public static void drawPicture1(Graphics2D g2) {
	
	Sign s1 = new Sign(100,250,50,75);
	g2.setColor(Color.CYAN); g2.draw(s1);
	
	// Make a black sign that's half the size, 
	// and moved over 150 pixels in x direction
	
	Shape s2 = ShapeTransforms.scaledCopyOfLL(s1,0.5,0.5);
	s2 = ShapeTransforms.translatedCopyOf(s2,150,0);
	g2.setColor(Color.BLACK); g2.draw(s2);
	
	// Here's a sign that's 4x as big (2x the original)
	// and moved over 150 more pixels to right.
	s2 = ShapeTransforms.scaledCopyOfLL(s2,4,4);
	s2 = ShapeTransforms.translatedCopyOf(s2,150,0);
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// #002FA7 is "International Klein Blue" according to Wikipedia
	// In HTML we use #, but in Java (and C/C++) its 0x
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(s2); 
	
	// Draw two StopSigns
	
	StopSign ss1 = new StopSign(50,350,40,75);
	StopSign ss2 = new StopSign(200,350,200,100);
	
	g2.draw(ss1);
	g2.setColor(new Color(0x8F00FF)); g2.draw(ss2);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A few signs by Blake Johnson", 20,20);
    }
    
    
    /** Draw a picture with a few Signs and StopSigns
     */
    public static void drawPicture2(Graphics2D g2) {
	
	// Draw some signs.
	
	Sign large = new Sign(100,150,225,150);
	StopSign smallCC = new StopSign(20,50,40,30);
	Sign tallSkinny = new Sign(20,150,20,40);
	StopSign shortFat = new StopSign(20,250,40,20);
	
	g2.setColor(Color.RED);     g2.draw(large);
	g2.setColor(Color.GREEN);   g2.draw(smallCC);
	g2.setColor(Color.BLUE);    g2.draw(tallSkinny);
	g2.setColor(Color.MAGENTA); g2.draw(shortFat);
	
	Sign h1 = new Sign(100,250,50,75);
	g2.setColor(Color.CYAN); g2.draw(h1);
	
	// Make a black sign that's half the size, 
	// and moved over 150 pixels in x direction
	Shape h2 = ShapeTransforms.scaledCopyOfLL(h1,0.5,0.5);
	h2 = ShapeTransforms.translatedCopyOf(h2,150,0);
	g2.setColor(Color.BLACK); g2.draw(h2);
	
	// Here's a sign that's 4x as big (2x the original)
	// and moved over 150 more pixels to right.
	h2 = ShapeTransforms.scaledCopyOfLL(h2,4,4);
	h2 = ShapeTransforms.translatedCopyOf(h2,150,0);
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// #002FA7 is "International Klein Blue" according to Wikipedia
	// In HTML we use #, but in Java (and C/C++) its 0x
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(h2); 
	
	
	StopSign hw1 = new StopSign(150,350,40,75);
	StopSign hw2 = new StopSign(200,350,200,100);
	
	g2.draw(hw1);
	g2.setColor(new Color(0x8F00FF)); 
	
	// Rotate the second sign  45 degrees around its center.
	Shape hw3 = ShapeTransforms.rotatedCopyOf(hw2, Math.PI/4.0);
	
	g2.draw(hw3);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A bunch of Signs and a few StopSigns by Blake Johnson", 20,20);
    }
    
    /** Draw a different picture with a few signs and stop signs
     */
    
    public static void drawPicture3(Graphics2D g2) {
	
	// label the drawing
	
	g2.drawString("A bunch of Stop Signs by Blake Johnson", 20,20);
	
	
	// Draw some stop signs.
	
	StopSign large = new StopSign(100,350,225,150);
	StopSign smallCC = new StopSign(320,150,40,30);
	
	g2.setColor(Color.RED);     g2.draw(large);
	g2.setColor(Color.GREEN);   g2.draw(smallCC);
	
    }       
}
