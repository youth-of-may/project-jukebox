import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;
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
public class BoxDetails2 implements DrawingObject{
	private double x, y;
	private String className;
	public BoxDetails2(double x, double y){
		this.x = x;
		this.y = y;
		className = "BoxDetails2";
	}
	public String returnClassName () {
        return className;
    }
	public void draw(Graphics2D g2d){
		
		//Similar to box details 1 except positioned differently
		Rectangle r = new Rectangle(x-10,y+15,10,15,new Color(37,23,14));
		r.draw(g2d);
		
		Square s2 = new Square(x,y,15,new Color(37,23,14));
		s2.draw(g2d);
		
		Square s3 = new Square(x,y+30,15,new Color(37,23,14));
		s3.draw(g2d);
		
		Rectangle r1 = new Rectangle(x+15,y+15,45,15,new Color(48,28,17));
		r1.draw(g2d);
	
		Rectangle r2 = new Rectangle(x+30,y,15,45,new Color(37,23,14));
		r2.draw(g2d);
		
		Square s4 = new Square(x+60,y,15,new Color(37,23,14));
		s4.draw(g2d);
		
		Square s5 = new Square(x+60,y+30,15,new Color(37,23,14));
		s5.draw(g2d);
		
		Rectangle r3 = new Rectangle(x+75,y+15,45,15,new Color(48,28,17));
		r3.draw(g2d);
	
		Rectangle r4 = new Rectangle(x+90,y,15,45,new Color(37,23,14));
		r4.draw(g2d);
		
		Square s6 = new Square(x+120,y,15,new Color(37,23,14));
		s6.draw(g2d);
		
		Square s7 = new Square(x+120,y+30,15,new Color(37,23,14));
		s7.draw(g2d);
		
		Square s8 = new Square(x+135,y+15,15,new Color(48,28,17));
		s8.draw(g2d);
		
		Square s9 = new Square(x+135,y,15,new Color(67,44,30));
		s9.draw(g2d);
		
		Square s10 = new Square(x+135,y+30,15,new Color(67,44,30));
		s10.draw(g2d);
		
		Rectangle r0 = new Rectangle(x+150,y,10,45,new Color(37,23,14));
		r0.draw(g2d);
	}
	
	public void adjustX(double distance){
        
    }
	
    public double getX() {
        return x;
    }
}
