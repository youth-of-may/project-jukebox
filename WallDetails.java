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
 * This class is used to make one part of the details of the wall, it makes use of rectangles
 **/
import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;
//walldetails implements the drawingobject interface and instantiates the variables
public class WallDetails implements DrawingObject{
	private double x,y;
	private String className;
	//gives the values to the variables
	public WallDetails(double x, double y){
		this.x = x;
		this.y = y;
		className = "WallDetails";
	}
	//gives the name of the class
	public String returnClassName () {
        return className;
    }
	//draws out the object
	public void draw(Graphics2D g2d){
		
		//Details of the wall
		Rectangle r1 = new Rectangle(x,y+50,10,20,new Color(43,33,21));
		r1.draw(g2d);
		
		Rectangle r2 = new Rectangle(x+50,y+30,10,30,new Color(43,33,21));
		r2.draw(g2d);
		
		Rectangle r3 = new Rectangle(x+100,y+30,10,50,new Color(43,33,21));
		r3.draw(g2d);
		
		Rectangle r4 = new Rectangle(x+75,y+60,10,25,new Color(43,33,21));
		r4.draw(g2d);
		
		Rectangle r5 = new Rectangle(x-30,y+45,10,30,new Color(43,33,21));
		r5.draw(g2d);
	}
	//changes the x value
	public void adjustX(double distance){
		x += distance;
	}
	//gives the x value
	public double getX(){
		return x;
	}
}
