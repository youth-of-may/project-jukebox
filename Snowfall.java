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
 * insert comments here
 **/
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class Snowfall implements DrawingObject{
	private double x,y;
	private String className;
	
	public Snowfall(double x, double y){
		this.x = x;
		this.y = y;
		className = "Snowfall";
	}
	public String returnClassName () {
        return className;
    }
	
	public void draw(Graphics2D g2d){
		
		//Collection of 4 snows to create an effect of multiple snowflakes
		Snow sw = new Snow(x,y);
		sw.draw(g2d);
		
		Snow sw2 = new Snow(x+20, y+30);
		sw2.draw(g2d);
		
		Snow sw3 = new Snow(x+40, y+20);
		sw3.draw(g2d);
		
		Snow sw4 = new Snow(x-10, y+30);
		sw4.draw(g2d);
	}
	
	public void adjustX(double distance){
		
	}
	
	public double getX(){
		return x;
	}
}
