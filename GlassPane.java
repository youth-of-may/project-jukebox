import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class GlassPane extends JComponent {
	
	public GlassPane(){
		
	}
	
	@Override
	protected void paintComponent(Graphics g){
		Graphics2D g2d = (Graphics2D) g;
		
		Rectangle2D.Double p = new Rectangle2D.Double(0,0,750,50);
		g2d.setColor(new Color(165,187,184));
		g2d.fill(p);	

		Rectangle2D.Double p2 = new Rectangle2D.Double(0,50,50,550);
		g2d.setColor(new Color(165,187,184));
		g2d.fill(p2);	
		
		Rectangle2D.Double p3 = new Rectangle2D.Double(0,550,50,50);
		g2d.setColor(new Color(131,166,172));
		g2d.fill(p3);	
		
		Rectangle2D.Double p4 = new Rectangle2D.Double(0,600,50,50);
		g2d.setColor(new Color(165,187,184));
		g2d.fill(p4);	
		
		Rectangle2D.Double p5 = new Rectangle2D.Double(0,650,50,100);
		g2d.setColor(new Color(131,166,172));
		g2d.fill(p5);	
		
		Rectangle2D.Double p6 = new Rectangle2D.Double(100,200,50,50);
		g2d.setColor(new Color(132,167,171));
		g2d.fill(p6);	
		
		Rectangle2D.Double p7 = new Rectangle2D.Double(150,150,50,50);
		g2d.setColor(new Color(166,186,184));
		g2d.fill(p7);
		
		Rectangle2D.Double p8 = new Rectangle2D.Double(200,100,50,50);
		g2d.setColor(new Color(166,186,184));
		g2d.fill(p8);
		
		Rectangle2D.Double p9 = new Rectangle2D.Double(50,700,50,50);
		g2d.setColor(new Color(131,166,172));
		g2d.fill(p9);
		
		Rectangle2D.Double p10 = new Rectangle2D.Double(100,700,50,50);
		g2d.setColor(new Color(112,153,159));
		g2d.fill(p10);
		
		Rectangle2D.Double p11 = new Rectangle2D.Double(150,700,50,50);
		g2d.setColor(new Color(131,166,172));
		g2d.fill(p11);
		
		Rectangle2D.Double p12 = new Rectangle2D.Double(200,700,500,50);
		g2d.setColor(new Color(112,153,159));
		g2d.fill(p12);
		
		Rectangle2D.Double p13 = new Rectangle2D.Double(700,700,100,50);
		g2d.setColor(new Color(132,166,175));
		g2d.fill(p13);
		
		Rectangle2D.Double p14 = new Rectangle2D.Double(750,650,50,50);
		g2d.setColor(new Color(131,166,172));
		g2d.fill(p14);
		
		Rectangle2D.Double p15 = new Rectangle2D.Double(750,0,50,100);
		g2d.setColor(new Color(134,165,170));
		g2d.fill(p15);
		
		Rectangle2D.Double p16 = new Rectangle2D.Double(750,100,50,150);
		g2d.setColor(new Color(100,140,148));
		g2d.fill(p16);
		
		Rectangle2D.Double p17 = new Rectangle2D.Double(750,250,50,50);
		g2d.setColor(new Color(108,157,164));
		g2d.fill(p17);
		
		Rectangle2D.Double p18 = new Rectangle2D.Double(750,300,50,50);
		g2d.setColor(new Color(100,140,148));
		g2d.fill(p18);		
		
		Rectangle2D.Double p19 = new Rectangle2D.Double(750,350,50,300);
		g2d.setColor(new Color(108,157,164));
		g2d.fill(p19);
		
		Rectangle2D.Double p20 = new Rectangle2D.Double(650,550,50,50);
		g2d.setColor(new Color(164,180,177));
		g2d.fill(p20);
		
		Rectangle2D.Double p21 = new Rectangle2D.Double(600,600,50,50);
		g2d.setColor(new Color(164,180,177));
		g2d.fill(p21);
	}
}