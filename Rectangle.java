import java.awt.*;
import java.awt.geom.*;

public class Rectangle implements DrawingObject{
    private double x, y, size;
    private Color color;

    public Rectangle(double x, double y, double x2, double y2, Color color) {
        this.x = x;
        this.y = y;
		this.x2 = x2;
		this.y2 = y2;
        this.color = color;
    }

    public void draw(Graphics2D g2d){
        Rectangle2D.Double r1 = new Rectangle2D.Double(x,y,x2,y2);
        g2d.setColor(color);
        g2d.fill(r1);
    }
    public void adjustX(double distance) {

    }
    public double getX(){
        return x;
    }
}