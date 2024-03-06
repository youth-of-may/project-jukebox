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
 * This class can be used to create the basic shape, Square. It only asks for size instead of width and height because the width and height of the square is equal.
 **/
import java.awt.*;
import java.awt.geom.*;
/**
 * square implements the drawingobject interface and instantiates the variables
 **/
public class Square implements DrawingObject{
    private double x, y, size;
    private Color color;
    private String className;
   /**
    * gives the values to the variables
    **/
    public Square(double x, double y, double size, Color color) {
        this.x = x;
        this.y = y;
        this.size = size;
        this.color = color;
        className = "Square";
    }
/**
         * This method returns the name of the class. This method was used in the SceneCanvas class.
         **/
    public String returnClassName () {
        return className;
    }
/**
         * This method is part of the DrawingObject interface. It was used to create and draw the graphics of this class.
         **/
    public void draw(Graphics2D g2d){
        Rectangle2D.Double r1 = new Rectangle2D.Double(x,y,size, size);
        g2d.setColor(color);
        g2d.fill(r1);
    }
/**
         * This method can be used to adjust x. It has an parameter distance that will be added to x whenever this method is called.
         **/
    public void adjustX(double distance) {
        x += distance;
    }
/**
         * This method returns a double. It returns the instance x of the class.
         **/
    public double getX(){
        return x;
    }
}
