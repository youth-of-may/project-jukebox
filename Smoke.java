/**
 * This is a template for a Java file.
	
	@author Princess May Giron (232869)
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
 * Insert comments here
 **/
import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class Smoke implements DrawingObject{
	private double x,y;
	private String className;
	
	public Smoke(double x, double y){
		this.x = x;
		this.y = y;
		className = "Smoke";
	}
	public String returnClassName () {
        return className;
    }
	public void draw(Graphics2D g2d){
		
		//Used to create a smoke effect
		Square s1 = new Square(x,y+10,5,new Color(159,134,111));
		s1.draw(g2d);
		
		Square s2 = new Square(x,y+20,5,new Color(159,134,111));
		s2.draw(g2d);
		
		Rectangle r1 = new Rectangle(x+5,y,5,10,new Color(159,134,111));
		r1.draw(g2d);
		
		Rectangle r2 = new Rectangle(x+10,y+5,5,20,new Color(159,134,111));
		r2.draw(g2d);
		
		Rectangle r3 = new Rectangle(x+5,y+15,20,5,new Color(159,134,111));
		r3.draw(g2d);
		
		Square s3 = new Square(x+15,y,5,new Color(159,134,111));
		s3.draw(g2d);
		
		Square s4 = new Square(x+20,y+5,5,new Color(159,134,111));
		s4.draw(g2d);
		
		Square s5 = new Square(x+15,y+10,5,new Color(159,134,111));
		s5.draw(g2d);
	}
	
	public void adjustX(double distance){
	
	}
	
	public double getX(){
		return x;
	}
}
