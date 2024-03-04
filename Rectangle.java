import java.awt.*;
import java.awt.geom.*;

public class Rectangle implements DrawingObject{
    private double x, y, width, height;
    private Color color;
    private String className;

    public Rectangle(double x, double y, double width, double height, Color color) {
        this.x = x;
        this.y = y;
		this.width = width;
		this.height = height;
        this.color = color;
        className = "Rectangle";
    }
    public String returnClassName () {
        return className;
    }

    public void draw(Graphics2D g2d){
        Rectangle2D.Double r1 = new Rectangle2D.Double(x,y,width,height);
        g2d.setColor(color);
        g2d.fill(r1);
    }
    public void adjustX(double distance) {

    }
    public double getX(){
        return x;
    }
}