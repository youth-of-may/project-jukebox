import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class Jukebox implements DrawingObject{
	private double x, y, size;
	
	public Jukebox(double x, double y, double size){
		this.x = x;
        this.y = y;
		this.size = size;
	}
	
	public void draw(Graphics2D g2d){
		Square s = new Square(x, y+25, size, new Color(24,23,18));
		s.draw(g2d);
		
		Square s2 = new Square(x+10, y+10+25, size-20, new Color(85,52,37));
		s2.draw(g2d);
		
		Path2D.Double line2 = new Path2D.Double();
		line2.moveTo(300,380+25);
		line2.lineTo(325,300+25);
		line2.lineTo(475,300+25);
		line2.lineTo(500,380+25);
		line2.closePath();
		g2d.setColor(new Color(24,23,18));
		g2d.draw(line2);
		g2d.fill(line2);
		
		Path2D.Double line3 = new Path2D.Double();
		line3.moveTo(315,370+25);
		line3.lineTo(335,310+25);
		line3.lineTo(465,310+25);
		line3.lineTo(485,370+25);
		line3.closePath();
		g2d.setColor(new Color(84,53,33));
		g2d.draw(line3);
		g2d.fill(line3);
		
		Path2D.Double line4 = new Path2D.Double();
		line4.moveTo(315+10,370+20);
		line4.lineTo(335+5,310+30);
		line4.lineTo(465-5,310+30);
		line4.lineTo(485-10,370+20);
		line4.closePath();
		g2d.setColor(new Color(134,79,49));
		g2d.draw(line4);
		g2d.fill(line4);
		
		Path2D.Double line5 = new Path2D.Double();
		line5.moveTo(315+25,370+10);
		line5.lineTo(335+15,310+35);
		line5.lineTo(465-15,310+35);
		line5.lineTo(485-25,370+10);
		line5.closePath();
		g2d.setColor(new Color(114,74,49));
		g2d.draw(line5);
		g2d.fill(line5);
		
		
		Path2D.Double line6 = new Path2D.Double();
		line6.moveTo(315+27,370);
		line6.lineTo(335+13,310+45);
		line6.lineTo(465-13,310+45);
		line6.lineTo(485-27,370);
		line6.closePath();
		g2d.setColor(new Color(21,20,18));
		g2d.draw(line6);
		g2d.fill(line6);
		
		Square s3 = new Square(x+10,y+35,7,new Color(51,33,21));
		s3.draw(g2d);
		
		Square s4 = new Square(x+10,y+42,7,new Color(69,43,30));
		s4.draw(g2d);
		
		Square s5 = new Square(x+17,y+35,7,new Color(69,43,30));
		s5.draw(g2d);
		
		Square s6 = new Square(x+183,y+35,7,new Color(51,33,21));
		s6.draw(g2d);
		
		Square s7 = new Square(x+183,y+42,7,new Color(69,43,30));
		s7.draw(g2d);
		
		Square s8 = new Square(x+176,y+35,7,new Color(69,43,30));
		s8.draw(g2d);
		
		Rectangle r1 = new Rectangle(x+50,y+35,35,7,new Color(68,45,31));
		r1.draw(g2d);
		
		Rectangle r2 = new Rectangle(x+125,y+35,21,7,new Color(68,45,31));
		r2.draw(g2d);
		
		BoxDetails row1 = new BoxDetails(325,420);
		row1.draw(g2d);
		
		BoxDetails2 row2 = new BoxDetails2(325,465);
		row2.draw(g2d);
		
		BoxDetails row3 = new BoxDetails(325,510);
		row3.draw(g2d);
	}

	public void adjustX(double distance){

	}

	public double getX(){
		return x;
	}
}
