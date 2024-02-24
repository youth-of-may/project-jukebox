import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class MusicNote extends JComponent {
	
	public MusicNote(){
		
	}
	
	@Override
	protected void paintComponent(Graphics g){
		Graphics2D g2d = (Graphics2D) g;
	
		Rectangle2D.Double m = new Rectangle2D.Double(0,300,50,50);
		g2d.setColor(new Color(134,243,222));
		g2d.fill(m);
		
		Rectangle2D.Double m2 = new Rectangle2D.Double(0,350,50,50);
		g2d.setColor(new Color(58,105,95));
		g2d.fill(m2);
		
		Rectangle2D.Double m3 = new Rectangle2D.Double(50,300,50,50);
		g2d.setColor(new Color(98,179,164));
		g2d.fill(m3);
		
		Rectangle2D.Double m4 = new Rectangle2D.Double(50,350,100,50);
		g2d.setColor(new Color(44,81,74));
		g2d.fill(m4);
		
		Rectangle2D.Double m5 = new Rectangle2D.Double(100,300,50,50);
		g2d.setColor(new Color(58,105,95));
		g2d.fill(m5);
		
		Rectangle2D.Double m6 = new Rectangle2D.Double(100,0,50,150);
		g2d.setColor(new Color(98,179,164));
		g2d.fill(m6);
		
		Rectangle2D.Double m7 = new Rectangle2D.Double(100,150,50,150);
		g2d.setColor(new Color(80,146,134));
		g2d.fill(m7);
		
		Rectangle2D.Double m8 = new Rectangle2D.Double(150,0,50,50);
		g2d.setColor(new Color(82,145,136));
		g2d.fill(m8);
		
		Rectangle2D.Double m9 = new Rectangle2D.Double(150,50,50,50);
		g2d.setColor(new Color(56,106,95));
		g2d.fill(m9);
		
		Rectangle2D.Double m10 = new Rectangle2D.Double(200,50,50,50);
		g2d.setColor(new Color(80,146,134));
		g2d.fill(m10);
		
		Rectangle2D.Double m11 = new Rectangle2D.Double(200,100,50,50);
		g2d.setColor(new Color(44,81,74));
		g2d.fill(m11);
	}	
}