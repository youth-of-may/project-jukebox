import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class Disc implements DrawingObject {
	private double x,y, percentage;
	private Color color;
	
	public Disc(double x, double y, double percentage, Color color){
		this.x = x;
		this.y = y;
		this.percentage = percentage;
		this.color = color;
		

	}
	
	public void draw(Graphics2D g2d){
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
		
	}
	
	public double getX(){
		return x;
	}
}