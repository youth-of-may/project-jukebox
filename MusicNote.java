/**
 * This is a template for a Java file.
	
	@author Princess May Giron (232869), Jienzel Christenzen H. Chua (231567)
	@version 06 March 2024
	
	I have not discussed the Java language code in my program 
	with anyone other than my instructor or the teaching assistants 
	assigned to this course.

	I have not used Java language code obtained from another student, 
	or any other unauthorized source, either modified or unmodified.

	If any Java language code or documentation used in my program 
	was obtained from another source, such as a textbook or website, 
	that has been clearly noted with a proper citation in the comments 
	of my program.
 */
/**
 * This class was used to create the music note, it makes use of squares and rectangles
 **/
import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;
/**
*	musicnote implements the drawingobject interface and instantiates the variables
**/
	public class MusicNote implements DrawingObject{
	private double x,y;
	private String className;
	/**
	*	gives the value to the variables
	**/
		public MusicNote(double x, double y){
		this.x = x;
		this.y = y;
		className = "MusicNote";
	}
	/**
	*	gives the name of the class
	**/
		public String returnClassName () {
        	return className;
    	}
	/**
	*	draws out the music note
	**/
		public void draw(Graphics2D g2d){
		
		//Used to create the music note that pops out of the jukebox
		Square s1 = new Square(x,y+30,5,new Color(134,243,222));//134,243,222
		s1.draw(g2d);
		
		Square s2 = new Square(x,y+35,5,new Color(58,105,95));
		s2.draw(g2d);
		
		Square s3 = new Square(x+5,y+30,5,new Color(98,179,164));
		s3.draw(g2d);
		
		Square s4 = new Square(x+10,y+30,5,new Color(58,105,95));
		s4.draw(g2d);
		
		Square s5 = new Square(x+15,y,5,new Color(80,146,134));
		s5.draw(g2d);
		
		Square s6 = new Square(x+15,y+5,5,new Color(58,105,95));
		s6.draw(g2d);
		
		Square s7 = new Square(x+20,y+5,5,new Color(80,146,134));
		s7.draw(g2d);
		
		Square s8 = new Square(x+20,y+10,5,new Color(40,81,74));
		s8.draw(g2d);
		
		Rectangle r1 = new Rectangle(x+5,y+35,10,5,new Color(40,81,74));
		r1.draw(g2d);
		
		Rectangle r2 = new Rectangle(x+10,y,5,15,new Color(98,179,164));
		r2.draw(g2d);
		
		Rectangle r3 = new Rectangle(x+10,y+15,5,15,new Color(80,146,134));
		r3.draw(g2d);
	}
	/**
	*	changes the x value
	**/
		public void adjustX(double distance){
		x += distance;
	}
	/**
	*	gives the x value
	**/
		public double getX(){
		return x;
	}
}
