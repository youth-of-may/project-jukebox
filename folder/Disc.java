import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class Disc implements DrawingObject {
	private double x,y;
	private Color color;
	
	public Disc(double x, double y, Color color){
		this.x = x;
		this.y = y;
		this.color = color;
	}
	
	public void draw(Graphics2D g2d){
		Rectangle d1 = new Rectangle(x,y+15,75,20,new Color(33,33,33));
		d1.draw(g2d);
		
		Rectangle d2 = new Rectangle(x+5,y+10,65,30,new Color(33,33,33));
		d2.draw(g2d);
		
		Rectangle d3 = new Rectangle(x+10,y+5,55,40,new Color(33,33,33));
		d3.draw(g2d);
		
		Rectangle d4 = new Rectangle(x+25,y,25,50,new Color(33,33,33));
		d4.draw(g2d);
		
		Square d5 = new Square(x+30,y+15,15,color);
		d5.draw(g2d);
	}
	
	public void adjustX(double distance){
		
	}
	
	public double getX(){
		return x;
	}
}