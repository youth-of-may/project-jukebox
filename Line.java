
import java.awt.*;
import java.awt.geom.*;

public class Line implements DrawingObject{
    private double x1, y1, x2, y2;
    private float thickness;
    private Color color;

    public Line(double x1, double y1, double x2, double y2, float thickness, Color color) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.thickness  = thickness;
        this.color = color;
    }

    public void draw(Graphics2D g2d){
        g2d.setStroke(new BasicStroke(thickness));
        Line2D.Double l1 = new Line2D.Double(x1,y1,x2,y2);
        g2d.setColor(color);
        g2d.draw(l1);
        
    }
    public void adjustX(double distance) {

    }
    public double getX(){
        return x2;
    }
    
}
