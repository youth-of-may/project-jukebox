import java.awt.*;
import java.awt.geom.*;

import com.oracle.graal.compiler.enterprise.l;
public class Background implements DrawingObject{
    private double x, y, width, height;
    public Background(){

    }
    public void draw(Graphics2D g2d) {

        //for the top part


        Path2D.Double upperPlanks = new Path2D.Double();
        upperPlanks.moveTo(75, 0);
        upperPlanks.lineTo(150, 75);
        upperPlanks.lineTo(673, 75);
        upperPlanks.lineTo(735, 0);

        upperPlanks.closePath();
        g2d.setColor(new Color(109,95,60));
        
        g2d.fill(upperPlanks);
        g2d.setColor(Color.BLACK);
        g2d.draw(upperPlanks);

        //add lines to the top part (left)

        Line l1 = new Line(125,0, 200, 75, 4, Color.BLACK);
        l1.draw(g2d);

        Line l2 = new Line(175,0, 250, 75, 4, Color.BLACK);
        l2.draw(g2d);

        Line l3 = new Line(225,0, 300, 75, 4, Color.BLACK);
        l3.draw(g2d);

        Line l4 = new Line(275,0, 350, 75, 4, Color.BLACK);
        l4.draw(g2d);
/*
        Line l5 = new Line(325,0, 400, 75, 4, Color.BLACK);
        l5.draw(g2d);
 */
        //add lines to the top part (right)

        Line l6 = new Line(685, 0, 625, 75, 4, Color.BLACK);
        l6.draw(g2d);

        Line l7 = new Line(635, 0, 575, 75, 4, Color.BLACK);
        l7.draw(g2d);

        Line l8 = new Line(585, 0, 525, 75, 4, Color.BLACK);
        l8.draw(g2d);

        Line l9 = new Line(535, 0, 475, 75, 4, Color.BLACK);
        l9.draw(g2d);



        //for the wooden planks sa gilid

        //Line l10 = new Line(0, 125, 150,210, 4, Color.RED);
        //l10.draw(g2d);
        Line l11 = new Line(675, 210, 800,115, 4, Color.RED);
        //l11.draw(g2d);
        Path2D.Double sidePlankLeft = new Path2D.Double();
        sidePlankLeft.moveTo(0, 125);
        sidePlankLeft.lineTo(150, 210);
        sidePlankLeft.lineTo(150, 75);
        sidePlankLeft.lineTo(75, 0);
        sidePlankLeft.lineTo(0, 0);
        sidePlankLeft.closePath();
        g2d.setColor(new Color(109,95,60));
        g2d.fill(sidePlankLeft);
        g2d.setColor(Color.BLACK);
        g2d.draw(sidePlankLeft);
        
        Path2D.Double sidePlankRight = new Path2D.Double();
        

        /* 
        Line l10 = new Line(485, 0, 425, 75, 4, Color.BLACK);
        l10.draw(g2d);
*/
        /* 
        Path2D.Double upperSlab7 = new Path2D.Double();
        upperSlab7.moveTo(673, 75);
        upperSlab7.lineTo(735, 0);
        upperSlab7.closePath();
        g2d.setColor(Color.BLUE);
        g2d.draw(upperSlab7);*/

    }
    public void adjustX(double distance) {

    }
    public double getX() {
        return x;
    }
}
