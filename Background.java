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
        Stroke oldStroke = g2d.getStroke();
        g2d.setStroke(new BasicStroke(6));
        Path2D.Double woodPlanksTop1 = new Path2D.Double();
        woodPlanksTop1.moveTo(125, 0);
        woodPlanksTop1.lineTo(200, 75);
        woodPlanksTop1.lineTo(150,75);
        woodPlanksTop1.lineTo(75,0);
        woodPlanksTop1.closePath();
        g2d.setColor(new Color(87,60,31));
        g2d.fill(woodPlanksTop1);
        g2d.setColor(new Color(36,26,16));
        g2d.draw(woodPlanksTop1);


        //adding details to woodPlanksTop1
        Line plank1Detail1 = new Line(75,38, 200,38, 6, new Color(36,26,16));
        plank1Detail1.draw(g2d);
        Line plank1Detail2 = new Line(75,38, 100,38, 6, new Color(63,45,25));
        plank1Detail2.draw(g2d);
        
        
        



        Path2D.Double woodPlanksTop2 = new Path2D.Double();
        woodPlanksTop2.moveTo(175, 0);
        woodPlanksTop2.lineTo(250, 75);
        woodPlanksTop2.lineTo(200,75);
        woodPlanksTop2.lineTo(125,0);
        woodPlanksTop2.closePath();
        g2d.setColor(new Color(87,60,31));
        g2d.fill(woodPlanksTop2);
        

        //adding details to woodPlanksTop2
        Line plank2Detail1 = new Line(130,0, 205,75, 6,new Color(59,40,23));
        plank2Detail1.draw(g2d);
        
        g2d.setColor(new Color(36,26,16));
        g2d.draw(woodPlanksTop2);


        Path2D.Double woodPlanksTop3 = new Path2D.Double();
        woodPlanksTop3.moveTo(225, 0);
        woodPlanksTop3.lineTo(300, 75);
        woodPlanksTop3.lineTo(250,75);
        woodPlanksTop3.lineTo(175,0);
        woodPlanksTop3.closePath();
        g2d.setColor(new Color(87,60,31));
        g2d.fill(woodPlanksTop3);
        

        //adding details to woodPlanksTop3
       
        Line plank3Detail3 = new Line(225,20, 285,73, 6, new Color(63,45,25));
        plank3Detail3.draw(g2d);
        
        Line plank3Detail1 = new Line(195,18, 300,18, 6, new Color(39,26,17));
        plank3Detail1.draw(g2d);
        Line plank3Detail2 = new Line(215,18, 220,18, 6, new Color(63,45,25));
        plank3Detail2.draw(g2d);
        g2d.setColor(new Color(36,26,16));
        g2d.draw(woodPlanksTop3);
       
        Path2D.Double woodPlanksTop4 = new Path2D.Double();
        woodPlanksTop4.moveTo(275, 0);
        woodPlanksTop4.lineTo(350, 75);
        woodPlanksTop4.lineTo(300,75);
        woodPlanksTop4.lineTo(225,0);
        woodPlanksTop4.closePath();
        g2d.setColor(new Color(87,60,31));
        g2d.fill(woodPlanksTop4);
        

        //details for woodPlanksTop4
        Line plank4Detail1 = new Line(275,48, 350,48, 6, new Color(44,31,15));
        plank4Detail1.draw(g2d);
        Line plank4Detail2 = new Line(215,18, 220,18, 6, new Color(63,45,25));
        plank4Detail2.draw(g2d);

        g2d.setColor(new Color(36,26,16));
        g2d.draw(woodPlanksTop4);
        //middleplank
        Path2D.Double woodPlanksTop5 = new Path2D.Double();
        woodPlanksTop5.moveTo(275, 0);
        woodPlanksTop5.lineTo(350, 75);
        woodPlanksTop5.lineTo(475,75);
        woodPlanksTop5.lineTo(535,0);
        woodPlanksTop5.closePath();
        g2d.setColor(new Color(87,60,31));
        g2d.fill(woodPlanksTop5);
        g2d.setColor(new Color(36,26,16));
        g2d.draw(woodPlanksTop5);
        
        

        Path2D.Double woodPlanksTop6 = new Path2D.Double();
        woodPlanksTop6.moveTo(535, 0);
        woodPlanksTop6.lineTo(475, 75);
        woodPlanksTop6.lineTo(525,75);
        woodPlanksTop6.lineTo(585,0);
        woodPlanksTop6.closePath();
        g2d.setColor(new Color(87,60,31));
        g2d.fill(woodPlanksTop6);
        g2d.setColor(new Color(36,26,16));
        g2d.draw(woodPlanksTop6);

        //adding details to woodPlanksTop6
        Line plank6Detail1 = new Line(525,18, 585,18, 6, new Color(39,26,17));
        plank6Detail1.draw(g2d);
        Line plank6Detail2 = new Line(545,18, 565,18, 6, new Color(63,45,25));
        plank6Detail2.draw(g2d);

        Path2D.Double woodPlanksTop7 = new Path2D.Double();
        woodPlanksTop7.moveTo(585, 0);
        woodPlanksTop7.lineTo(525, 75);
        woodPlanksTop7.lineTo(575,75);
        woodPlanksTop7.lineTo(635,0);
        woodPlanksTop7.closePath();
        g2d.setColor(new Color(87,60,31));
        g2d.fill(woodPlanksTop7);
        g2d.setColor(new Color(36,26,16));
        g2d.draw(woodPlanksTop7);

        Path2D.Double woodPlanksTop8 = new Path2D.Double();
        woodPlanksTop8.moveTo(635, 0);
        woodPlanksTop8.lineTo(575, 75);
        woodPlanksTop8.lineTo(625,75);
        woodPlanksTop8.lineTo(685,0);
        woodPlanksTop8.closePath();
        g2d.setColor(new Color(87,60,31));
        g2d.fill(woodPlanksTop8);
        g2d.setColor(new Color(36,26,16));
        g2d.draw(woodPlanksTop8);

        //adding details to woodPlanksTop8
        Line plank8Detail1 = new Line(605,38, 685,38, 6, new Color(39,26,17));
        plank8Detail1.draw(g2d);
        Line plank8Detail2 = new Line(615,38, 625,38, 6, new Color(63,45,25));
        plank8Detail2.draw(g2d);
        Line plank8Detail4 = new Line(650,38, 655,38, 6, Color.BLACK);
        plank8Detail4.draw(g2d);

        Path2D.Double woodPlanksTop9 = new Path2D.Double();
        woodPlanksTop9.moveTo(685, 0);
        woodPlanksTop9.lineTo(625, 75);
        woodPlanksTop9.lineTo(673,75);
        woodPlanksTop9.lineTo(735,0);
        woodPlanksTop9.closePath();
        g2d.setColor(new Color(87,60,31));
        g2d.fill(woodPlanksTop9);
        g2d.setColor(new Color(36,26,16));
        g2d.draw(woodPlanksTop9);
 
    /* 
        Line l1 = new Line(125,0, 200, 75, 4, new Color(29,18,8));
        //l1.draw(g2d);

        Line l2 = new Line(175,0, 250, 75, 4,new Color(29,18,8));
        l2.draw(g2d);

        Line l3 = new Line(225,0, 300, 75, 4, new Color(29,18,8));
        l3.draw(g2d);

        Line l4 = new Line(275,0, 350, 75, 4, new Color(29,18,8));
        l4.draw(g2d);

        */
/*
        Line l5 = new Line(325,0, 400, 75, 4, Color.BLACK);
        l5.draw(g2d);
 */
        //add lines to the top part (right)

        Line l6 = new Line(685, 0, 625, 75, 4, new Color(29,18,8));
        l6.draw(g2d);

        Line l7 = new Line(635, 0, 575, 75, 4, new Color(29,18,8));
        l7.draw(g2d);

        Line l8 = new Line(585, 0, 525, 75, 4, new Color(29,18,8));
        l8.draw(g2d);

        Line l9 = new Line(535, 0, 475, 75, 4, new Color(29,18,8));
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
        g2d.setColor(new Color(86,61,31));
        g2d.fill(sidePlankLeft);
        g2d.setColor(Color.BLACK);
        g2d.draw(sidePlankLeft);

        Path2D.Double sidePlankLeft1 = new Path2D.Double();
        
        sidePlankLeft1.moveTo(35,0);
        sidePlankLeft1.lineTo(75, 120);
        sidePlankLeft1.lineTo(0,0);
        sidePlankLeft1.closePath();
        g2d.setColor(Color.RED);
        g2d.fill(sidePlankLeft1);

        Path2D.Double sidePlankLeft2 = new Path2D.Double();
        
        sidePlankLeft2.moveTo(150,105);
        sidePlankLeft2.lineTo(150, 150);
        sidePlankLeft2.lineTo(0,15);
        sidePlankLeft2.lineTo(0,0);
        sidePlankLeft2.lineTo(45,0);
        sidePlankLeft2.closePath();
        g2d.setColor(Color.RED);
        //g2d.draw(sidePlankLeft2);


        //sidePlankLeft1.lineTo();
        
        Path2D.Double sidePlankRight = new Path2D.Double();
        sidePlankRight.moveTo(735,0);
        sidePlankRight.lineTo(673,75);
        sidePlankRight.lineTo(673,210);
        sidePlankRight.lineTo(800,125);
        sidePlankRight.lineTo(800,0);
        sidePlankRight.closePath();
        g2d.setColor(new Color(87,60,31));
        g2d.fill(sidePlankRight);
        g2d.setColor(Color.BLACK);
        g2d.draw(sidePlankRight);

        //line for left and right side

        Line left = new Line(150,210, 150, 450, 5, Color.BLACK);
        left.draw(g2d);

        Line right = new Line(673,210, 673, 400, 5, Color.BLACK);
        right.draw(g2d);


        //coordinates of the last lines
        //woodPlanksTop9.lineTo(673,75);
        //woodPlanksTop9.lineTo(735,0);
        

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

        Rectangle filler4 = new Rectangle(340,310, 150,100,new Color(48,35,19));
        filler4.draw(g2d);

        Path2D.Double filler1 = new Path2D.Double();
        filler1.moveTo(490, 175);
        filler1.lineTo(477, 190);
        filler1.lineTo(477, 313);
        filler1.lineTo(490, 375);
        filler1.closePath();
        g2d.setColor(new Color(51,36,20));
        g2d.fill(filler1);

        //filler window and wall
        Path2D.Double filler2 = new Path2D.Double();
        filler2.moveTo(490,175);
        filler2.lineTo(477,190);
        filler2.lineTo(352,190);
        filler2.lineTo(338,175);
        filler2.closePath();
        g2d.setColor(new Color(37,25,14));
        g2d.fill(filler2);

        Path2D.Double filler3 = new Path2D.Double();
        filler3.moveTo(338, 175);
        filler3.lineTo(338,375);
        filler3.lineTo(352, 310);
        filler3.lineTo(352,190);
        filler3.closePath();
        g2d.setColor(new Color(60,45,22));
        g2d.fill(filler3);

        
        //line that connects wood and window
        Rectangle discFrameWall = new Rectangle(340, 0, 150, 180, new Color(32,24,13));
        discFrameWall.draw(g2d);

    }
    public void adjustX(double distance) {

    }
    public double getX() {
        return x;
    }
}
