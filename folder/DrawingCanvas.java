import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class DrawingCanvas extends JComponent {
	 
	private int width;
	private int height;
	private NetherrackSlab ns;
	private Jukebox J;
	private Wood W;
	
	public DrawingCanvas(int w, int h){
		width = w;
		height = h;
		ns = new NetherrackSlab(50,500,250,100);
		J = new Jukebox(300,375,200);
		W = new Wood(500,375,200);
	}
	
	protected void paintComponent(Graphics g){
		Graphics2D g2d = (Graphics2D) g;
		
		ns.draw(g2d);
		W.draw(g2d);
		J.draw(g2d);
	}
}
