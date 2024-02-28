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

        Square details1 = new Square(x+70, y * 1.45, 10, Color.GRAY);
        details1.draw(g2d);

        Square details2 = new Square(x+60, y * 1.55, 10, Color.GRAY);
        details2.draw(g2d);

        Square details3 = new Square(x+50, y * 1.65, 10, Color.GRAY);
        details3.draw(g2d);

        Square details4 = new Square(x+ 120,y * 1.75, 10, Color.GRAY);
        details4.draw(g2d);

        Square details5 = new Square(x + 110, y*1.85,10, Color.GRAY);        
        details5.draw(g2d);
        
    }
    public void adjustX(double distance) {

    }
    public double getX() {
        return x;
    }
}