import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class DrawingTester {
	
	public static void main(String[] args) {
		int w = 800;
		int h = 600;
		JFrame f = new JFrame();
		DrawingCanvas dc = new DrawingCanvas(w,h);
		MusicNote mn = new MusicNote();
		GlassPane gp = new GlassPane();
		NetherrackSlab ns = new NetherrackSlab(50,450,250,150);
		f.setSize(w,h);
		f.setTitle("Minecraft");
		f.add(dc);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
}