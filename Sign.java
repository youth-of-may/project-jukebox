import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class Sign implements DrawingObject {
    private double x, y, x2, y2;
	private String className;
	
	
    public Sign(double x, double y, double x2, double y2) {
		this.x = x;
		this.y = y;
		this.x2 = x2;
		this.y2 = y2;
		className = "Sign";
    }
	public String returnClassName () {
        return className;
    }
    public void draw(Graphics2D g2d){
        Rectangle r1 = new Rectangle(x,y,x2,y2,new Color(109,95,60));
		r1.draw(g2d);
		
		Line l1 = new Line(x+5,y+30,310,y+30,10,new Color(87,77,50));
		l1.draw(g2d);
		
		Line l2 = new Line(x+5,y+60,310,y+60,10,new Color(87,77,50));
		l2.draw(g2d);
		
		Square s1 = new Square(x+5+30,y,10,new Color(97,83,54));
		s1.draw(g2d);
		
		Square s2 = new Square(x+5+100,y,10,new Color(97,83,54));
		s2.draw(g2d);
		
		Square s3 = new Square(x+5+110,y,10,new Color(97,83,54));
		s3.draw(g2d);
		
		Rectangle r2 = new Rectangle(x+5+50,y+35,10,20,new Color(97,83,54));
		r2.draw(g2d);
		
		Rectangle r3 = new Rectangle(x+5+20,y+65,10,20,new Color(97,83,54));
		r3.draw(g2d);
		
		Rectangle r4 = new Rectangle(x+5+130,y+65,10,20,new Color(97,83,54));
		r4.draw(g2d);
    }
    public void adjustX(double distance){
        
    }
    public double getX() {
        return x;
    }
}
