/**
 * This is a template for a Java file.
	
	@author Princess May Giron (232869), Jienzel Christenzen H. Chua
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
 * Insert comment here
 **/
import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class Candles implements DrawingObject{
	private double x, y;
	private String className;
	
	public Candles(double x, double y){
		this.x = x;
		this.y = y;
		className = "Candles";
	}
	public String returnClassName () {
        return className;
    }
	public void draw(Graphics2D g2d){	

		//Main body of the second candle
		Path2D.Double c2 = new Path2D.Double();
		c2.moveTo(x+25,y-50);
		c2.lineTo(x+25+25,y-50);
		c2.lineTo(x+30+25,y+15-50);
		c2.lineTo(x+30+25,y+50-5);
		c2.lineTo(x+5+25,y+50-5);
		c2.lineTo(x+25,y+40);
		c2.closePath();
		g2d.setColor(new Color(190,179,161));
		g2d.fill(c2);
		g2d.draw(c2);
		
		//Details of the second candle
		Path2D.Double c2d = new Path2D.Double();
		c2d.moveTo(x+25,y-50);
		c2d.lineTo(x+25+25,y-50);
		c2d.lineTo(x+30+25,y-50+15);
		c2d.lineTo(x+30+25,y-50+15+5);
		c2d.lineTo(x+5+25,y-50+15+5);
		c2d.lineTo(x+25,y-50+15);
		c2d.closePath();
		g2d.setColor(new Color(204,184,151));
		g2d.fill(c2d);
		g2d.draw(c2d);
		
		//More details for the second candle
		Line m1 = new Line(x+15+25,y-50+75,x+15+25,y-50+30,7,new Color(204,193,175));
		m1.draw(g2d);
		
		Line m2 = new Line(x+15+8+25,y-50+60,x+15+8+25,y-50+25,7,new Color(204,193,175));
		m2.draw(g2d);
		
		Line m3 = new Line(x+15-8+25,y-50+45,x+15-8+25,y-50+60,7,new Color(204,193,175));
		m3.draw(g2d);
		
		//Main body of the first candle
		Path2D.Double c1 = new Path2D.Double();
		c1.moveTo(x,y);
		c1.lineTo(x+25,y);
		c1.lineTo(x+30,y+15);
		c1.lineTo(x+30,y+50);
		c1.lineTo(x+5,y+50);
		c1.lineTo(x,y+45);
		c1.closePath();
		g2d.setColor(new Color(204,193,173));
		g2d.fill(c1);
		g2d.draw(c1);
		
		
		//Details of the first candle
		Path2D.Double c1d = new Path2D.Double();
		c1d.moveTo(x,y);
		c1d.lineTo(x+25,y);
		c1d.lineTo(x+30,y+5);
		c1d.lineTo(x+30,y+20);
		c1d.lineTo(x+5,y+20);
		c1d.lineTo(x,y+15);
		c1d.closePath();
		g2d.setColor(new Color(206,183,151));
		g2d.fill(c1d);
		g2d.draw(c1d);
		
		//Main body of the third candle
		Path2D.Double c3 = new Path2D.Double();
		c3.moveTo(x+25+25,y-55);
		c3.lineTo(x+25+25+25,y-55);
		c3.lineTo(x+30+25+25,y+15-50-5);
		c3.lineTo(x+30+25+25,y+60);
		c3.lineTo(x+5+25+25,y+60);
		c3.lineTo(x+25+25,y+50);
		c3.closePath();
		g2d.setColor(new Color(164,166,153));
		g2d.fill(c3);
		g2d.draw(c3);
		
		//Details of the third candle
		Path2D.Double c3d = new Path2D.Double();
		c3d.moveTo(x+25+25,y-55);
		c3d.lineTo(x+25+25+25,y-55);
		c3d.lineTo(x+30+25+25,y+15-55);
		c3d.lineTo(x+30+25+25,y+15-55+5);
		c3d.lineTo(x+5+25+25,y+15-55+5);
		c3d.lineTo(x+25+25,y+15-55);
		c3d.closePath();
		g2d.setColor(new Color(216,200,166));
		g2d.fill(c3d);
		g2d.draw(c3d);
		
		//More details for the third candle
		Line k1 = new Line(x+15+25+25,y-55+105,x+15+25+25,y-55+30,7,new Color(184,181,166));
		k1.draw(g2d);
		
		Line k2 = new Line(x+15+8+25+25,y-55+75,x+15+8+25+25,y-55+40,7,new Color(184,181,166));
		k2.draw(g2d);
		
		Line k3 = new Line(x+15-8+25+25,y-55+80,x+15-8+25+25,y-55+45,7,new Color(184,181,166));
		k3.draw(g2d);
		
		//The black part of the candles
		Rectangle r1 = new Rectangle(x+5,y-5,17,10,new Color(27,25,39));
		r1.draw(g2d);
		
		Rectangle r2 = new Rectangle(x+25+3,y-50-7,17,10,new Color(27,25,39));
		r2.draw(g2d);
		
		Rectangle r3 = new Rectangle(x+50+5,y-55-5,17,10,new Color(27,25,39));
		r3.draw(g2d);
		
		//More details forr the first candle
		Line l1 = new Line(x+15,y+45,x+15,y+27,7,new Color(191,180,162));
		l1.draw(g2d);
		
		Line l2 = new Line(x+15+8,y+35,x+15+8,y+30,7,new Color(191,180,162));
		l2.draw(g2d);
		
		Line l3 = new Line(x+15-8,y+30,x+15-8,y+25,7,new Color(191,180,162));
		l3.draw(g2d);
	}
	
	public void adjustX(double distance){
		x+=distance;
	}
	
	public double getX(){
		return x;
	}
}
