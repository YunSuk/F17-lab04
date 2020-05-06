package edu.ucsb.cs56.drawings.ferb120.advanced;

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
 * @author Fernando Mendoza 
 * @version for UCSB CS56, W16 
 */

public class AllMyDrawings
{
    /** Draw a picture with a few windows 
     */
    
    public static void drawPicture1(Graphics2D g2) {
	
	Window w1 = new Window(100,250,50,75);
	g2.setColor(Color.CYAN); g2.draw(w1);
	
	// Make a black window that's half the size, 
	// and moved over 150 pixels in x direction
	
	Shape w2 = ShapeTransforms.scaledCopyOfLL(w1,0.5,0.5);
	w2 = ShapeTransforms.translatedCopyOf(w2,150,0);
	g2.setColor(Color.BLACK); g2.draw(w2);
	
	// Here's a window that's 4x as big (2x the original)
	// and moved over 150 more pixels to right.
	w2 = ShapeTransforms.scaledCopyOfLL(w2,4,4);
	w2 = ShapeTransforms.translatedCopyOf(w2,150,0);
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// #002FA7 is "International Klein Blue" according to Wikipedia
	// In HTML we use #, but in Java (and C/C++) its 0x
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(w2); 
	
	// Draw two Gridded Windows
	GriddedWindow gw1 = new GriddedWindow(50,350,40,75);
	GriddedWindow gw2 = new GriddedWindow(200,350,200,100);
	
	g2.draw(gw1);
	g2.setColor(new Color(0x8F00FF)); g2.draw(gw2);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A few windows by Fernando Mendoza", 20,20);
    }
    
    
    /** Draw a picture of windows and gridded windows, some are rotated. 
     */
    public static void drawPicture2(Graphics2D g2) {
	
	// Draw some windows and gridded windows.
	
	Window large = new Window(100,50,225,150);
	GriddedWindow small = new GriddedWindow(20,50,40,30);
	Window tallSkinny = new Window(20,150,20,40);
	GriddedWindow shortFat = new GriddedWindow(20,250,40,20);
	
	g2.setColor(Color.RED);     g2.draw(large);
	g2.setColor(Color.GREEN);   g2.draw(small);
	g2.setColor(Color.BLUE);    g2.draw(tallSkinny);
	g2.setColor(Color.MAGENTA); g2.draw(shortFat);
	
	Window w1 = new Window(100,250,50,75);
	g2.setColor(Color.CYAN); g2.draw(w1);
	
	// Make a black window that's half the size, 
	// and moved over 150 pixels in x direction
	Shape w2 = ShapeTransforms.scaledCopyOfLL(w1,0.5,0.5);
	w2 = ShapeTransforms.translatedCopyOf(w2,150,0);
	g2.setColor(Color.BLACK); g2.draw(w2);
	
	// Here's a  window that's 4x as big (2x the original)
	// and moved over 150 more pixels to right.
	w2 = ShapeTransforms.scaledCopyOfLL(w2,4,4);
	w2 = ShapeTransforms.translatedCopyOf(w2,150,0);
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// #002FA7 is "International Klein Blue" according to Wikipedia
	// In HTML we use #, but in Java (and C/C++) its 0x
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(w2); 
	
	// Draw two gridded windows
	
	GriddedWindow gw1 = new GriddedWindow(50,350,40,75);
	GriddedWindow gw2 = new GriddedWindow(200,350,200,100);
	
	g2.draw(gw1);
	g2.setColor(new Color(0x8F00FF)); 
	
	// Rotate the second house 45 degrees around its center.
	Shape gw3 = ShapeTransforms.rotatedCopyOf(gw2, Math.PI/4.0);
	
	g2.draw(gw3);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A bunch of windows and gridded windows by Fernando Mendoza", 20,20);
    }
    
    /** Draw a bunch of gridded windows stcked together to make a huge gridded window
     */
    
    public static void drawPicture3(Graphics2D g2) {
	
	// label the drawing
	
	g2.drawString("A bunch of gridded windows stacked  by Fernando  Mendoza", 20,20);
	
	
	// Draw a stck of gridded windows
	GriddedWindow top = new GriddedWindow(150, 50, 200,100);	
	GriddedWindow topLeft = new GriddedWindow(50,150,200,100);
	GriddedWindow bottomLeft = new GriddedWindow(50,250,200,100);
	GriddedWindow topRight = new GriddedWindow(250,150,200,100);
	GriddedWindow bottomRight = new GriddedWindow(250,250,200,100); 
	
	g2.setColor(Color.BLACK);	g2.draw(top);
	g2.setColor(Color.RED);     g2.draw(topLeft);
	g2.setColor(Color.BLUE);   g2.draw(bottomLeft);
	g2.setColor(Color.BLUE);  g2.draw(topRight);
	g2.setColor(Color.RED);    g2.draw(bottomRight);
	
    }       
}
