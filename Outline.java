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

        Path2D.Double upperSlab4 = new Path2D.Double();
        upperSlab4.moveTo(150,75);
        upperSlab4.lineTo(675, 75);
        upperSlab4.closePath();
        g2d.draw(upperSlab4);

        Path2D.Double upperSlab5 = new Path2D.Double();
        upperSlab5.moveTo(673, 75);
        upperSlab5.lineTo(670, 325);
        upperSlab5.closePath();
        g2d.setColor(Color.RED);
        g2d.draw(upperSlab5);

        Path2D.Double upperSlab6 = new Path2D.Double();
        upperSlab6.moveTo(75, 0);
        upperSlab6.lineTo(150, 75);
        upperSlab6.closePath();
        g2d.setColor(Color.BLUE);
        g2d.draw(upperSlab6);

        Path2D.Double upperSlab7 = new Path2D.Double();
        upperSlab7.moveTo(673, 75);
        upperSlab7.lineTo(735, 0);
        upperSlab7.closePath();
        g2d.setColor(Color.BLUE);
        g2d.draw(upperSlab7);

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

        //hati sa gitna ng box
        Path2D.Double hati = new Path2D.Double();
        hati.moveTo(150, 210);
        hati.lineTo(675, 210);
        hati.closePath();
        g2d.draw(hati);

        Line l1 = new Line(0, 125, 150,210, 4, Color.RED);
        l1.draw(g2d);
        
        Line l2 = new Line(675, 210, 800,115, 4, Color.RED);
        l2.draw(g2d);

        //outline for mid plank 
        Path2D.Double midPlank = new Path2D.Double();
        midPlank.moveTo(350,75);
        midPlank.lineTo(350,210);
        midPlank.lineTo(475, 210);
        midPlank.lineTo(475,75);
        midPlank.closePath();
        g2d.draw(midPlank);

    }
    public void adjustX(double distance) {

    }
    public double getX() {
        return x2;
    }
}
