import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class NetherrackSlab implements DrawingObject {
	
	private double x, y, x2, y2;
	
	public NetherrackSlab(double x, double y, double x2, double y2){
		this.x = x;
        this.y = y;
		this.x2 = x2;
		this.y2 = y2;
	}
	
	public void draw(Graphics2D g2d){
		Rectangle r1 = new Rectangle(x,y+50,x2,y2,new Color(29,13,14));
		r1.draw(g2d);
		
		Path2D.Double line = new Path2D.Double();
		line.moveTo(50,500+50);
		line.lineTo(150,380+50);
		line.lineTo(300,380+50);
		line.lineTo(300,500+50);
		line.closePath();
		g2d.draw(line);
		g2d.fill(line);
	}

	public void adjustX(double distance){

	}

	public double getX(){
		return x;
	}
}
