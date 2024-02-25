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
		Square s = new Square(x, y, size, new Color(24,23,18));
		s.draw(g2d);
		
		Square s2 = new Square(x+10, y+10, size-20, new Color(85,52,37));
		s2.draw(g2d);
		
		Path2D.Double line2 = new Path2D.Double();
		line2.moveTo(300,380);
		line2.lineTo(325,300);
		line2.lineTo(475,300);
		line2.lineTo(500,380);
		line2.closePath();
		g2d.setColor(new Color(24,23,18));
		g2d.draw(line2);
		g2d.fill(line2);
		
		Path2D.Double line3 = new Path2D.Double();
		line3.moveTo(310,370);
		line3.lineTo(330,310);
		line3.lineTo(470,310);
		line3.lineTo(490,370);
		line3.closePath();
		g2d.setColor(new Color(85,52,37));
		g2d.draw(line3);
		g2d.fill(line3);
	}
	
	public void adjustX(double distance){

	}

	public double getX(){
		return x;
	}
}