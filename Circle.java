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
 * This class was used to create a Circle (basic shape) using the data entered or passed to its constructor.
 **/
import java.awt.*;
import java.awt.geom.Ellipse2D;
public class Circle implements DrawingObject {
    private double x, y, size;
    private Color color;
    private String className;

    public Circle(double x, double y, double size, Color color) {
        this.x = x;
        this.y = y;
        this.size = size;
        this.color = color;
        className = "Circle";
    }
    public String returnClassName () {
        return className;
    }
    public void draw(Graphics2D g2d){
        Ellipse2D.Double e1 = new Ellipse2D.Double(x,y,size,size);
        g2d.setColor(color);
        g2d.fill(e1);
    }
    public void adjustX(double distance) {

    }
    public double getX(){
        return x;
    }
}
