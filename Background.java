
/**
 * This is a template for a Java file.
	
	@author Princess May Giron (232869), Jienzel Christenzen H. Chua (231567)
	@version 06 March 2024
	
	I have not discussed the Java language code in my program 
	with anyone other than my instructor or the teaching assistants 
	assigned to this course.

	I have not used Java language code obtained from another student, 
	or any other unauthorized source, either modified or unmodified.

	If any Java language code or documentation used in my program 
	was obtained from another source, such as a textbook or website, 
	that has been clearly noted with a proper citation in the comments 
	of my program.
 */
/**
 * This class was used to create the background of the whole program. This includes the ceilings, and the wall on the sides, which were to the creation of this program/animation.
 **/
import java.awt.*;
import java.awt.geom.*;
public class Background implements DrawingObject{
    private double x, y;
    private String className;
    private Square[] impurities;
    public Background(double x, double y){
        /**
         * This constructor instantiates the variables x, y, and clsasName. It also creates an array called impurities that contains instances of the Square class.
         **/
        this.x = x;
        this.y = y;
        className = "Background";
        impurities = new Square[100];
    }
    public String returnClassName() {
        return className;

    }
    public void draw(Graphics2D g2d) {

        Stroke resetStroke = g2d.getStroke();
        g2d.setStroke(new BasicStroke(6));

        Point2D.Double p = new Point2D.Double(800,200);
		Point2D.Double p2 = new Point2D.Double(800,400);
		
		GradientPaint gPaint = new GradientPaint(p,new Color(74,44,102), p2, new Color(16,16,25));
		g2d.setPaint(gPaint);
		g2d.fillRect(0,0,800,600);

        //making a moon

        Ellipse moonBg = new Ellipse(180, 80, 110, 120, new Color(180,217,222,10));
        moonBg.draw(g2d);

        Ellipse moonBg2 = new Ellipse(130, 130, 110, 120, new Color(177,194,216,20));
        moonBg2.draw(g2d);

        Square s1 = new Square(215, 110, 40, new Color(103,113,137));
        s1.draw(g2d);

        Square s2 = new Square(225, 110, 30, new Color(224,237,255));
        s2.draw(g2d);
		
        Path2D.Double moonDetails = new Path2D.Double();
        moonDetails.moveTo(228,125);
        moonDetails.lineTo(235,125);
        moonDetails.lineTo(235,115);
        moonDetails.moveTo(240,138);
        moonDetails.lineTo(252,138);
        moonDetails.moveTo(250,112);
        moonDetails.lineTo(250,125);
        g2d.setColor(new Color(87,96,116,80));
        g2d.draw(moonDetails);

        Rectangle mooonDetails2 = new Rectangle(215,110,5, 20, new Color(152,160,178));
        mooonDetails2.draw(g2d);

        Rectangle mooonDetails3 = new Rectangle(215,140,5, 10, new Color(224,237,255, 90));
        mooonDetails3.draw(g2d);

        Rectangle mooonDetails4 = new Rectangle(240,120,7, 15, new Color (152,160,180));
        mooonDetails4.draw(g2d);

        g2d.setStroke(resetStroke);

        //making the impurities
        for (int i = 0; i<impurities.length; i++) {
            impurities[i] = new Square(Math.random()*800, Math.random()*600, 5, new Color (150,150,150, 30));
            impurities[i].draw(g2d);
        }

        


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
 
 

        Line l6 = new Line(685, 0, 625, 75, 4, new Color(29,18,8));
        l6.draw(g2d);

        Line l7 = new Line(635, 0, 575, 75, 4, new Color(29,18,8));
        l7.draw(g2d);

        Line l8 = new Line(585, 0, 525, 75, 4, new Color(29,18,8));
        l8.draw(g2d);

        Line l9 = new Line(535, 0, 475, 75, 4, new Color(29,18,8));
        l9.draw(g2d);



        

        Color planksColor = new Color(36,26,16);
        Path2D.Double sidePlankLeft = new Path2D.Double();
        sidePlankLeft.moveTo(0, 125);
        sidePlankLeft.lineTo(150, 210);
        sidePlankLeft.lineTo(150, 75);
        sidePlankLeft.lineTo(75, 0);
        sidePlankLeft.lineTo(0, 0);
        sidePlankLeft.closePath();
        g2d.setColor(new Color(86,61,31));
        g2d.fill(sidePlankLeft);
        g2d.setColor(planksColor);
        g2d.draw(sidePlankLeft);


     
        
        Line l1Left = new Line(45,0, 150, 90, 6, planksColor);
        l1Left.draw(g2d);

        Line l1midLine = new Line(115, 40, 115, 55, 6, planksColor);
        l1midLine.draw(g2d);

        Line l2Left = new Line(0,15, 160, 140, 6, planksColor);
        l2Left.draw(g2d);

        Line l2midLine = new Line(50,7, 50, 50, 6, planksColor);
        l2midLine.draw(g2d);


        Line l3Left = new Line(0,70, 170, 185, 6, planksColor);
        l3Left.draw(g2d);

        Line l3midLine = new Line(100, 95, 100, 135, 6, planksColor);
        l3midLine.draw(g2d);

        Line l4midLine = new Line(75, 125, 75, 163, 6, planksColor);
        l4midLine.draw(g2d);
        
        
        Path2D.Double sidePlankRight = new Path2D.Double();
        sidePlankRight.moveTo(735,0);
        sidePlankRight.lineTo(673,75);
        sidePlankRight.lineTo(673,210);
        sidePlankRight.lineTo(800,120);
        sidePlankRight.lineTo(800,0);
        sidePlankRight.closePath();
        g2d.setColor(new Color(87,60,31));
        g2d.fill(sidePlankRight);
        g2d.setColor(Color.BLACK);
        g2d.draw(sidePlankRight);

        //lines for the right part 

        Line l1Right = new Line(673,90, 755, 0, 6, planksColor);
        l1Right.draw(g2d);

        Line l1RightmidLine = new Line(700, 45, 700, 60, 6, planksColor);
        l1RightmidLine.draw(g2d);
        

        Line l2Right = new Line(800,15, 673, 135, 6, planksColor);
        l2Right.draw(g2d);

        Line l2RightmidLine = new Line(765, 0, 765,45, 6, planksColor);
        l2RightmidLine.draw(g2d);

        Line l3Right = new Line(673,180, 800, 70, 6, planksColor);
        l3Right.draw(g2d);

        Line l3RightmidLine = new Line(735, 80, 735, 125, 6, planksColor);
        l3RightmidLine.draw(g2d);

        Line l4RightmidLine = new Line(690, 170, 690, 200, 6, planksColor);
        l4RightmidLine.draw(g2d);

        

        //line for left and right side

        Line left = new Line(150,210, 150, 450, 5, Color.BLACK);
        left.draw(g2d);

        Line right = new Line(673,210, 673, 400, 5, Color.BLACK);
        right.draw(g2d);

        //Filling the left and right side with colors muna

        Path2D.Double bottomLeftFill = new Path2D.Double();
        bottomLeftFill.moveTo(150,210);
        bottomLeftFill.lineTo(150,600);
        bottomLeftFill.lineTo(0,600);
        bottomLeftFill.lineTo(0,125);
        bottomLeftFill.closePath();
        g2d.setColor(new Color(56,40,24));
        g2d.fill(bottomLeftFill);

        Path2D.Double bottomRightFill = new Path2D.Double();
        bottomRightFill.moveTo(673,210);
        bottomRightFill.lineTo(673,600);
        bottomRightFill.lineTo(800, 600);
        bottomRightFill.lineTo(800, 120);
        g2d.setColor(new Color(56,40,24));
        g2d.fill(bottomRightFill);

        
        //for the space between slab and sign
        Rectangle bottomCenterFill = new Rectangle(150, 320, 180, 110, new Color(56,40,24));
        bottomCenterFill.draw(g2d);

        Line bottomCenterFillShadow = new Line(153,320, 153,450, 6, new Color(48,36,20, 80));
        bottomCenterFillShadow.draw(g2d);


        

        Rectangle filler4 = new Rectangle(325,310, 150,100,new Color(48,35,19));
        filler4.draw(g2d);

        Path2D.Double filler1 = new Path2D.Double();
        filler1.moveTo(476, 175);
        filler1.lineTo(463, 190);
        filler1.lineTo(463, 313);
        filler1.lineTo(476, 375);
        filler1.closePath();
        g2d.setColor(new Color(51,36,20));
        g2d.fill(filler1);

        //filler window and wall
        Path2D.Double filler2 = new Path2D.Double();
        filler2.moveTo(478,175);
        filler2.lineTo(465,190);
        filler2.lineTo(325,190);
        filler2.lineTo(330,175);
        filler2.closePath();
        g2d.setColor(new Color(37,25,14));
        g2d.fill(filler2);

        Path2D.Double filler3 = new Path2D.Double();
        filler3.moveTo(324, 175);
        filler3.lineTo(324,375);
        filler3.lineTo(338, 310);
        filler3.lineTo(338,190);
        filler3.closePath();
        g2d.setColor(new Color(60,45,22));
        g2d.fill(filler3);

        
        //line that connects wood and window
        Rectangle discFrameWall = new Rectangle(325, 0, 150, 180, new Color(32,24,13));
        discFrameWall.draw(g2d);

	WallDetailsMain wdm = new WallDetailsMain(0,0);
	wdm.draw(g2d);
		
	WallDetailsMain wdm2 = new WallDetailsMain(720,20);
	wdm2.draw(g2d);

    }
    public void adjustX(double distance) {
            x += distance;
    }
    public double getX() {
        return x;
    }
}
