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
 * The class implements DrawingObject. It draws a frame that contains a disc found at the center of the JFrame.
 **/
import java.awt.*;
import java.awt.geom.*;


public class DiscFrame implements DrawingObject {
    private double x,  y, size;
    private Color color;
    private Square outerFrame, midFrame;
    private String className;
    /**
		 * The constructor of this class has several parameters: x, y, and its size. It also instantiated the variables outerFrame, midFrame, and className in the constructor. 
		 **/
    public DiscFrame(double x, double y, double size) {
        

        this.x = x;
        this.y = y;
        this.size = size;
        this.color = color;
        className = "DiscFrame";
        
        outerFrame = new Square(x, y, size, new Color(190,171,113));
        midFrame = new Square(x+12, y+13, size*0.80, new Color(115,64,40));
    } 
    /**
         * This method returns the name of the class. This method was used in the SceneCanvas class.
         **/
    public String returnClassName () {
       

        return className;
    }
    /**
         * This method is part of the DrawingObject interface. It was used to create and draw the graphics of this class.
         **/
    public void draw(Graphics2D g2d) {
        
        outerFrame.draw(g2d);
        midFrame.draw(g2d);

        //details of outer frame
        Line outerDetails1 = new Line(340,50,350,50,10, new Color(158,139,97));
        outerDetails1.draw(g2d);

        Line outerDetails2 = new Line(440,168,450,168,10, new Color(158,139,97));
        outerDetails2.draw(g2d);

        
        //for the details of the discframe

        Line layer1 = new Line(387, 75, 412, 75, 6, new Color(151,79,46));
        layer1.draw(g2d);
        
        Line layer2 = new Line(377,80,422, 80, 6, new Color(165,86,50));
        layer2.draw(g2d);

        Line layer3 = new Line(367,85,432, 85, 6, new Color(161,84,48));
        layer3.draw(g2d);

        Line layer4One = new Line(357,90,442,90,6, new Color(175,92,54));
        layer4One.draw(g2d);
        Line layer4Two = new Line(357,95,442,95,6, new Color(175,92,54));
        layer4Two.draw(g2d);
        Line layer4Three = new Line(357,100,442,100,6, new Color(175,92,54));
        layer4Three.draw(g2d);
        Line layer4Four = new Line(357,105,442,105,6, new Color(161,84,48));
        layer4Four.draw(g2d);
        Line layer4Five = new Line(357,110,442,110,6, new Color(175,92,54));
        layer4Five.draw(g2d);
        Line layer4Six = new Line(357,115,442,115,6, new Color(175,92,54));
        layer4Six.draw(g2d);
        Line layer4Seven = new Line(357,120,442,120,6, new Color(161,84,48));
        layer4Seven.draw(g2d);
        Line layer4Eight = new Line(357,125,442,125,6, new Color(175,92,54));
        layer4Eight.draw(g2d);
        Line layer4Nine = new Line(357,129,442,129,6, new Color(175,92,54));
        layer4Nine.draw(g2d);

        Line layer6 = new Line(367,135,432, 135, 6, new Color(161,84,48));
        layer6.draw(g2d);

        Line layer7 = new Line(377,140,422, 140, 6, new Color(165,86,50));
        layer7.draw(g2d);

		Line layer8 = new Line(387, 145, 412, 145, 6, new Color(151,79,46));
        layer8.draw(g2d);

        Line layer9 = new Line(420,158,445,158, 6, new Color(0,0,0,20));
        layer9.draw(g2d);

        //Line sa gilid
        Line side1= new Line (352, 100, 352, 115, 6, new Color(161,84,48));
        side1.draw(g2d);

        Line side2= new Line (440, 100, 440, 115, 6, new Color(161,84,48));
        side2.draw(g2d);
        

        
    }
    /**
         * This method can be used to adjust x. It has an parameter distance that will be added to x whenever this method is called.
         **/
    public void adjustX(double distance) {
        
        x+=distance;
    } 
    /**
         * This method returns a double. It returns the instance x of the class.
         **/
    public double getX() {
       
        return x;
    }
}
