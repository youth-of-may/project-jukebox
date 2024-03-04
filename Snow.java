import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class Snow implements DrawingObject{
	private double x,y;
	private String className;
	
	public Snow(double x, double y){
		this.x = x;
		this.y = y;
		className = "Snow";
	}
	public String returnClassName () {
        return className;
    }
	public void draw(Graphics2D g2d){
		Square s1 = new Square(x,y+5,5,Color.WHITE);
		s1.draw(g2d);
		
		Square s2 = new Square(x+5,y,5,Color.WHITE);
		s2.draw(g2d);
		
		Square s3 = new Square(x+10,y+5,5,Color.WHITE);
		s3.draw(g2d);
		
		Square s4 = new Square(x+5,y+10,5,Color.WHITE);
		s4.draw(g2d);
	}
	
	public void adjustX(double distance){
		
	}
	
	public double getX(){
		return x;
	}
}