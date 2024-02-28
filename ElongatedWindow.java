import java.awt.geom.*;
import java.awt.*;
public class ElongatedWindow implements DrawingObject{
    private double x, y, width, height;
    public ElongatedWindow(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;

    }
    public void draw(Graphics2D g2d) {
        Stroke oldStroke = g2d.getStroke();
        g2d.setStroke(new BasicStroke(16));

        Rectangle2D.Double outsideRec = new Rectangle2D.Double(x+8, y+13, width-20, height-20);
        g2d.setColor(new Color(171,187,184));
        g2d.draw(outsideRec);

        
    }
    public void adjustX(double distance) {

    }
    public double getX() {
        return x;
    }
}