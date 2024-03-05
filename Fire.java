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
 * Insert comment here
 **/
import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class Fire implements DrawingObject{
	private double x,y;
	private String className;
	
	public Fire(double x, double y){
		this.x = x;
		this.y = y;
		className = "Fire";
	}
	public String returnClassName () {
        return className;
    }
	public void draw(Graphics2D g2d){
		
		//Used to create fire to be placed on the candle
		Square red1 = new Square(x+5,y,5,new Color(255,15,15));
		red1.draw(g2d);
		
		Square red2 = new Square(x+10,y+5,5,new Color(255,15,15));
		red2.draw(g2d);
		
		Square orange1 = new Square(x,y+20,5,new Color(255,100,8));
		orange1.draw(g2d);
		
		Square orange2 = new Square(x+5,y+5,5,new Color(255,100,8));
		orange2.draw(g2d);
		
		Rectangle orange3 = new Rectangle(x+10,y+10,5,10,new Color(255,100,8));
		orange3.draw(g2d);
		
		Square orange4 = new Square(x,y+35,5,new Color(255,100,8));
		orange4.draw(g2d);
		
		Square orange5 = new Square(x+15,y+25,5,new Color(255,100,8));
		orange5.draw(g2d);
		
		Square orange6 = new Square(x+15,y+35,5,new Color(255,100,8));
		orange6.draw(g2d);
		
		Square yellow1 = new Square(x+15,y+30,5,new Color(255,217,8));
		yellow1.draw(g2d);
		
		Rectangle yellow2 = new Rectangle(x,y+25,5,10,new Color(255,217,8));
		yellow2.draw(g2d);
		
		Rectangle yellow3 = new Rectangle(x+5,y+10,5,15,new Color(255,217,8));
		yellow3.draw(g2d);
		
		Rectangle yellow4 = new Rectangle(x+5,y+35,10,5,new Color(255,217,8));
		yellow4.draw(g2d);
		
		Rectangle yellow5 = new Rectangle(x+10,y+20,5,10,new Color(255,217,8));
		yellow5.draw(g2d);
		
		Rectangle lightYellow1 = new Rectangle(x+5,y+25,5,10,new Color(255,245,199));
		lightYellow1.draw(g2d);
		
		Square lightYellow2 = new Square(x+10,y+30,5,new Color(255,245,199));
		lightYellow2.draw(g2d);
	}
	
	public void adjustX(double distance){
	
	}
	
	public double getX(){
		return x;
	}
}
