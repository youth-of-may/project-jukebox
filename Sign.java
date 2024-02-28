import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class Sign implements DrawingObject {
    private double x, y, x2, y2;
	
    public Sign(double x, double y, double x2, double y2) {
		this.x = x;
		this.y = y;
		this.x2 = x2;
		this.y2 = y2;
    }
    public void draw(Graphics2D g2d){
        Rectangle r1 = new Rectangle(x,y,x2,y2,new Color(109,95,60));
		r1.draw(g2d);
    }
    public void adjustX(double distance){
        
    }
    public double getX() {
        return x;
    }
}
