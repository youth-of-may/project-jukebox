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
 * This class was used to create the basic shape Ellipse. This is similar to a circle but its width and height are not equal.
 **/
import java.awt.*;
import java.awt.geom.*;
public class Ellipse implements DrawingObject{
    private double x, y, width, height;
    private Color color;
    private String className;
    public Ellipse(double x, double y, double width, double height, Color color) {
         /**
		 * The constructor of this class has several parameters: x, y, width, height, and its color. It also instantiated the variable className here. 
		 **/
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
        className = "Ellipse";
    }
    public String returnClassName () {
        /**
         * This method returns the name of the class. This method was used in the SceneCanvas class.
         **/
        return className;
    }
    public void draw(Graphics2D g2d) {
        /**
         * This method is part of the DrawingObject interface. It was used to create and draw the graphics of this class.
         **/
        Ellipse2D.Double ellipse = new Ellipse2D.Double(x, y, width, height);
        g2d.setColor(color);
        g2d.fill(ellipse);
    }
    public void adjustX(double distance) {
        /**
         * This method can be used to adjust x. It has an parameter distance that will be added to x whenever this method is called.
         **/
        x += distance;
    }
    public double getX() {
        /**
         * This method returns a double. It returns the instance x of the class.
         **/
        return x;
    }
}
