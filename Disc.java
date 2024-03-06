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
 * This class was used to create the disc found in the toolbox and the frame found at the center of the JFrame. It implements the DrawingObject interface.
 **/
import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class Disc implements DrawingObject {
	private double x,y, percentage;
	private Color color;
	private String className;
	
	public Disc(double x, double y, double percentage, Color color){
		/**
		 * The constructor of this class has several parameters: x, y, percentage, and color. It also asked for the percentage to enhance it's scalability. 
		 **/
		this.x = x;
		this.y = y;
		this.percentage = percentage;
		this.color = color;
		className = "Disc";

	}
	public String returnClassName () {
		/**
         * This method returns the name of the class. This method was used in the SceneCanvas class.
         **/


        return className;
    }
	public void draw(Graphics2D g2d){
		/**
         * This method is part of the DrawingObject interface. It was used to create and draw the graphics of this class.
         **/


		//for bottom part
		Rectangle d1 = new Rectangle(x,y+(15*percentage),75*percentage,20*percentage,new Color(43,43,43));
		d1.draw(g2d);

		//overlaps the first rectangle
		Rectangle d2 = new Rectangle(x+(5*percentage),y+(10*percentage),65*percentage,30*percentage,new Color(43,43,43));
		d2.draw(g2d);

		//overlaps the second
		Rectangle d3 = new Rectangle(x+(10*percentage),y+(5*percentage),55*percentage,40*percentage,new Color(33,33,33));
		d3.draw(g2d);
		
		//vertical overlaps the third
		Rectangle d4 = new Rectangle(x+(25*percentage),y,(25*percentage),50*percentage,new Color(33,33,33));
		d4.draw(g2d);

		Square d5 = new Square(x+(30*percentage),y+(15*percentage),15*percentage,color);
		d5.draw(g2d);

		//adding details to the disc 
		Line detail1 = new Line(x+13,y+(10*percentage),x+10+(5*percentage),y+(percentage*10), Math.round(6*percentage), new Color(82,81,82));
		detail1.draw(g2d);
		
	}
	
	public void adjustX(double distance){
		/**
         * This method can be used to adjust x. It has an parameter distance that will be added to x whenever this method is called.
         **/
		x+= distance;
	}
	
	public double getX(){
		/**
         * This method returns a double. It returns the instance x of the class.
         **/
		return x;
	}
}