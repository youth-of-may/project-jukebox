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
 * This is the Line class was can be used to create lines using 4 elements: the start and end points, and its thickness and color.
 **/
import java.awt.*;
import java.awt.geom.*;

public class Line implements DrawingObject{
    private double x1, y1, x2, y2;
    private float thickness;
    private Color color;
    private String className;
/**
		 * The constructor of this class has several parameters: x1, y1, x2, y2, color, and its thickness. It also instantiated the className variable. 
		 **/
    public Line(double x1, double y1, double x2, double y2, float thickness, Color color) {
         
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.thickness  = thickness;
        this.color = color;
        className = "Line";
    }/**
         * This method returns the name of the class. This method was used in the SceneCanvas class.
         **/
    public String returnClassName () {
        
        return className;
    }/**
         * This method is part of the DrawingObject interface. It was used to create and draw the graphics of this class.
         **/
    public void draw(Graphics2D g2d){
        
        g2d.setStroke(new BasicStroke(thickness));
        Line2D.Double l1 = new Line2D.Double(x1,y1,x2,y2);
        g2d.setColor(color);
        g2d.draw(l1);
        
    }/**
         * This method can be used to adjust x. It has an parameter distance that will be added to x whenever this method is called.
         **/
    public void adjustX(double distance) {
        
        x1 += distance;
    }/**
         * This method returns a double. It returns the instance x of the class.
         **/
    public double getX(){
        
        return x2;
    }
    
}
