import java.awt.*;
import java.awt.geom.*;

/*
 * Simple lang muna for now. I'll add stuff na lang once we have all the elements
 */
public class DiscFrame implements DrawingObject {
    private double x,  y, size;
    private Color color;
    private Square outerFrame, midFrame;
    public DiscFrame(double x, double y, double size) {
        this.x = x;
        this.y = y;
        this.size = size;
        this.color = color;
        
        outerFrame = new Square(x, y, size, new Color(190,171,113));
        midFrame = new Square(x+9, y+10, size*0.80, new Color(108,54,41));
    }
    public void draw(Graphics2D g2d) {
        outerFrame.draw(g2d);
        midFrame.draw(g2d);

        //for texture
        /* 
        Line l1 = new Line(x,y + 5, x, y+10, 10, new Color(87,77,50));
        l1.draw(g2d);
        */
    }
    public void adjustX(double distance) {

    }
    public double getX() {
        return x;
    }
}
