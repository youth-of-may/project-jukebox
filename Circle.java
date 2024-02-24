import java.awt.*;
import java.awt.geom.Ellipse2D;
public class Circle implements DrawingObject {
    private double x, y, size;
    private Color color;

    public Circle(double x, double y, double size, Color color) {
        this.x = x;
        this.y = y;
        this.size = size;
        this.color = color;
    }

    public void draw(Graphics2D g2d){
        Ellipse2D.Double e1 = new Ellipse2D.Double(x,y,size,size);
        g2d.setColor(color);
        g2d.fill(e1);
    }
    public void adjustX(double distance) {

    }
    public double getX(){
        return x;
    }
}
