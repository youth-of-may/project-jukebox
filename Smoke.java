import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class Smoke implements DrawingObject{
	private double x,y;
	private String className;
	
	public Smoke(double x, double y){
		this.x = x;
		this.y = y;
		className = "Smoke";
	}
	public String returnClassName () {
        return className;
    }
	public void draw(Graphics2D g2d){
		
		//Used to create a smoke effect
		Square s1 = new Square(x,y+10,5,new Color(159,134,111));
		s1.draw(g2d);
		
		Square s2 = new Square(x,y+20,5,new Color(159,134,111));
		s2.draw(g2d);
		
		Rectangle r1 = new Rectangle(x+5,y,5,10,new Color(159,134,111));
		r1.draw(g2d);
		
		Rectangle r2 = new Rectangle(x+10,y+5,5,20,new Color(159,134,111));
		r2.draw(g2d);
		
		Rectangle r3 = new Rectangle(x+5,y+15,20,5,new Color(159,134,111));
		r3.draw(g2d);
		
		Square s3 = new Square(x+15,y,5,new Color(159,134,111));
		s3.draw(g2d);
		
		Square s4 = new Square(x+20,y+5,5,new Color(159,134,111));
		s4.draw(g2d);
		
		Square s5 = new Square(x+15,y+10,5,new Color(159,134,111));
		s5.draw(g2d);
	}
	
	public void adjustX(double distance){
	
	}
	
	public double getX(){
		return x;
	}
}
