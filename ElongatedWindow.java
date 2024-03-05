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
 * This class was used to create the elongated windows found in the program. We used Squares and Rectangles to make it.
 **/
import java.awt.geom.*;
import java.awt.*;
public class ElongatedWindow implements DrawingObject{
    private double x, y, width, height;
    private String className;
    public ElongatedWindow(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        className = "ElongatedWindow";
    }
    public String returnClassName () {
        return className;
    }
    public void draw(Graphics2D g2d) {
        Stroke oldStroke = g2d.getStroke();
        g2d.setStroke(new BasicStroke(16));

        Rectangle2D.Double outsideRec = new Rectangle2D.Double(x+8, y+13, width-20, height-20);
        g2d.setColor(new Color(171,187,184));
        g2d.draw(outsideRec);

       
        Square details1 = new Square(x+70, y * 1.45, 10, new Color(171,187,184));
        details1.draw(g2d);

        Square details2 = new Square(x+60, y * 1.55, 10, new Color(134,166,168));
        details2.draw(g2d);

        Square details3 = new Square(x+50, y * 1.65, 10, new Color(168,187,185));
        details3.draw(g2d);

        Square details4 = new Square(x+ 120,y * 1.75, 10, new Color(171,187,184));
        details4.draw(g2d);

        Square details5 = new Square(x + 110, y*1.85,10, new Color(134,166,168));        
        details5.draw(g2d);
        
    }
    public void adjustX(double distance) {

    }
    public double getX() {
        return x;
    }
}