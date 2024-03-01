//this class is for the basic shape eme
import java.awt.*;
import java.awt.geom.*;
public class Ellipse implements DrawingObject{
    private double x, y, width, height;
    private Color color;

    public Ellipse(double x, double y, double width, double height, Color color) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
    }
    public void draw(Graphics2D g2d) {
        Ellipse2D.Double ellipse = new Ellipse2D.Double(x, y, width, height);
        g2d.setColor(color);
        g2d.fill(ellipse);
    }
    public void adjustX(double distance) {

    }
    public double getX() {
        return x;
    }
}
