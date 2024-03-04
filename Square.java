
import java.awt.*;
import java.awt.geom.*;
public class Square implements DrawingObject{
    private double x, y, size;
    private Color color;
    private String className;

    public Square(double x, double y, double size, Color color) {
        this.x = x;
        this.y = y;
        this.size = size;
        this.color = color;
        className = "Square";
    }
    public String returnClassName () {
        return className;
    }

    public void draw(Graphics2D g2d){
        Rectangle2D.Double r1 = new Rectangle2D.Double(x,y,size, size);
        g2d.setColor(color);
        g2d.fill(r1);
    }
    public void adjustX(double distance) {

    }
    public double getX(){
        return x;
    }
}
