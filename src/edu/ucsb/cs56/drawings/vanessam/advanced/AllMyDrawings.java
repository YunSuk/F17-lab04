package edu.ucsb.cs56.drawings.vanessam.advanced;

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
   
    public static void drawPicture1(Graphics2D g2) {
	
	//Red circle with cross
	circle c1 = new circle(100,250,10,10);
	g2.setColor(Color.RED); 
        g2.draw(c1);
	
 	
	//Green circle with cross
	circle c2 = new circle(200,200,100,100);
	Shape c2Transform = ShapeTransforms.scaledCopyOfLL(c2, 2, 2);
	g2.setColor(Color.GREEN);
	g2.draw(c2Transform);
	
	//circle with cross, cyan
        
	circlewithcross tar1 = new circlewithcross(300,350,50,50);
	g2.setColor(Color.CYAN); g2.draw(tar1);

	//Circle with cross and outer target, thicker and blue 
	circlewithcross tar2 = new circlewithcross(100,100,50,50);
	g2.setColor(Color.RED); g2.draw(tar2);

	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT,    BasicStroke.JOIN_BEVEL);   
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(tar2); 

	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A few circles with crosses by Vanessa Mejia", 20,20);

	
}
	public static void drawPicture2(Graphics2D g2) {
	//really small circle 
	circle c1 = new circle(400,250,6,6);
	g2.setColor(Color.BLACK); 
        g2.draw(c1);

	//really big circle with cross
	circlewithcross tar1 = new circlewithcross(100,100,200,200);
	g2.setColor(Color.CYAN); g2.draw(tar1);

	//thick purple circle with cross
	circlewithcross tar2 = new circlewithcross(450,50,50,50);
	g2.setColor(Color.GREEN); g2.draw(tar2);

	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT,    BasicStroke.JOIN_BEVEL);   
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x8F00FF)); 
	g2.draw(tar2); 
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A few circles with crosses by Vanessa Mejia", 20,20);

	
}
	
	public static void drawPicture3(Graphics2D g2) {
	//circle with cross big
	circlewithcross tar1 = new circlewithcross(370,50,250,250);
	g2.setColor(Color.GREEN); g2.draw(tar1);

	//circle with cross 
	circlewithcross tar2 = new circlewithcross(100,10,90,90);
	g2.setColor(Color.GREEN); g2.draw(tar2);

	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT,    BasicStroke.JOIN_BEVEL);   
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x8F00FF)); 
	g2.draw(tar2);
	
	//rotate the circle
        circlewithcross tar3 = new circlewithcross(100,300,100,100);
	g2.setColor(Color.CYAN); 

	Shape tar4 = ShapeTransforms.rotatedCopyOf(tar3, Math.PI/3.0);
        g2.draw(tar4);

	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A few circles with crosses and rotated by Vanessa Mejia", 250,400);

	

}


}























