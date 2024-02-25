import java.awt.*;
import java.awt.geom.*;
public class Outline implements DrawingObject{
    private double x1, x2, y1, y2;

    public Outline() {

    }

    public Outline(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }
    public void draw(Graphics2D g2d) {

        //outline of upper part of jukebox
        Path2D.Double upperSlab = new Path2D.Double();
        upperSlab.moveTo(150, 425);
        upperSlab.lineTo(150, 75);
        upperSlab.closePath();
        g2d.setColor(Color.RED);
        g2d.draw(upperSlab);

        //for the slab
        Path2D.Double path1 = new Path2D.Double();
        path1.moveTo(50,550);
        path1.lineTo(150, 430);
        path1.lineTo(300,430);
        path1.lineTo(300,550);
        path1.closePath();
        g2d.setColor(Color.RED);
        g2d.draw(path1);

        //from wood to the other wood
        Path2D.Double upperSlab2 = new Path2D.Double();
        upperSlab2.moveTo(150,325);
        upperSlab2.lineTo(670,325);
        upperSlab2.closePath();
        g2d.setColor(Color.RED);
        g2d.draw(upperSlab2);

        //from wood diretso
        Path2D.Double upperSlab3 = new Path2D.Double();
        upperSlab3.moveTo(665, 325);
        upperSlab3.lineTo(710, 425);
        upperSlab3.lineTo(710, 600);
        g2d.draw(upperSlab3);
    }
    public void adjustX(double distance) {

    }
    public double getX() {
        return x2;
    }
}
