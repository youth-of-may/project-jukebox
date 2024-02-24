import javax.swing.*;

public class DrawingTester {
	
	public static void main(String[] args) {
		int w = 800;
		int h = 600;
		JFrame f = new JFrame();
		DrawingCanvas dc = new DrawingCanvas();
		MusicNote mn = new MusicNote();
		GlassPane gp = new GlassPane();
		f.setSize(w,h);
		f.setTitle("Disc");
		f.add(gp);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
}