/*
 * Instantiate the elements here. Event listeners should also be found here.
 */

 //this is where we will draw the elements of the animated scene
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.util.*;
import java.awt.event.*;
import java.io.*;
import javax.sound.sampled.*;

public class SceneCanvas extends JComponent{
    private ArrayList<DrawingObject> elements;
	private Action zero, one, two,three, four,five, six,seven,eight,nine;
	private double y = 200, max_y = 100, max_y2 = 290, y2 = 170, y3 = 180, y4 = 320;
	
    public SceneCanvas() {

        //instantiating the Action instances
        zero = new ZeroAction();
        one = new OneAction();
        two = new TwoAction();
        three = new ThreeAction();
        four = new FourAction();
        five = new FiveAction();
        six = new SixAction();
        seven = new SevenAction();
        eight = new EightAction();
        nine = new NineAction();
    
        
        
        elements = new ArrayList<DrawingObject>();
        elements.add(new Background());
        //testing out toolbox
        //elements.add(new GradientBackground());
        elements.add(new ThreeDWood("shadow", 100, 100, 100, 100));
        elements.add(new NetherrackSlab(50,500,250,100));
		elements.add(new Sign(160,200,155,90));
        elements.add(new GlassPane(339,190,107));
        elements.add(new ElongatedWindow(475,75,200,100));
        elements.add(new ElongatedWindow(150,75,178,100));     
        elements.add(new DiscFrame(335, 45, 130));
        elements.add(new Disc(362, 85, 1, Color.RED));
        elements.add(new Wood(500,425,200));
        elements.add(new Jukebox(300,375,200));
        
        elements.add(new ToolBox(150, 500, 500));
	    elements.add(new Candles(550,300));
	    elements.add(new Fire(555,260));
	    elements.add(new Fire(575,210));
	    elements.add(new Fire(600,200));
            /*
     * Add the elements inside the constructor as well
     */
    
    }

    /*
     * In your code, you must have at least one (1) loop that iterates
through this ArrayList to repeatedly execute instructions affecting the shapes. For example, you
can have a for loop inside the paintComponent method that calls your custom draw method on all
of the shapes in the list.
     */
@Override
    protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
        
        for (DrawingObject drawingObj : elements) {
            drawingObj.draw(g2d);
        }
        Smoke smoke = new Smoke(555,y);
		smoke.draw(g2d);
		
		Smoke smoke2 = new Smoke(570,y2);
		smoke2.draw(g2d);
		
		Smoke smoke3 = new Smoke(600,y3);
		smoke3.draw(g2d);
		
		if(y>max_y || y<0){
			y--;
			if (y==max_y){
				y = 200;
			}
		}
		
		if(y2>max_y || y2<0){
			y2--;
			if (y2==max_y){
				y2 = 170;
			}
		}
		
		if(y3>max_y || y3<0){
			y3--;
			if (y3==max_y){
				y3 = 180;
			}
		}

	    	if(y4>max_y2 || y<0){
			y4--;
			if (y4==max_y2){
				y4 = 320;
			}
		}
		
		try{
		Thread.sleep(20);
		}catch(Exception ex){}
		revalidate();
		repaint();
    }
	
    private class ZeroAction extends AbstractAction {
        @Override 
        public void actionPerformed(ActionEvent ae) {
            System.out.println("You pressed 0");
        }
    }

    private class OneAction extends AbstractAction {
        @Override 
        public void actionPerformed(ActionEvent ae) {
            System.out.println("You pressed 1");
        }
    }

    private class TwoAction extends AbstractAction {
        @Override 
        public void actionPerformed(ActionEvent ae) {
            System.out.println("You pressed 2");
        }
    }


    private class ThreeAction extends AbstractAction {
        @Override 
        public void actionPerformed(ActionEvent ae) {
            System.out.println("You pressed 3");
        }
    }

    private class FourAction extends AbstractAction {
        @Override 
        public void actionPerformed(ActionEvent ae) {
            System.out.println("You pressed 4");
        }
    }

    private class FiveAction extends AbstractAction {
        @Override 
        public void actionPerformed(ActionEvent ae) {

        }
    }

    private class SixAction extends AbstractAction {
        @Override 
        public void actionPerformed(ActionEvent ae) {

        }
    }

    private class SevenAction extends AbstractAction {
        @Override 
        public void actionPerformed(ActionEvent ae) {

        }
    }

    private class EightAction extends AbstractAction {
        @Override 
        public void actionPerformed(ActionEvent ae) {

        }
    }
	
    private class NineAction extends AbstractAction {
        @Override 
        public void actionPerformed(ActionEvent ae) {

        }
    }
    public void setUpListener(JButton button) {
        button.getInputMap().put(KeyStroke.getKeyStroke("0"),"zeroAction");
        //first is the map name then second is the instance name
        button.getActionMap().put("zeroAction", zero);

        button.getInputMap().put(KeyStroke.getKeyStroke("1"),"oneAction");
        //first is the map name then second is the instance name
        button.getActionMap().put("oneAction", one);

        button.getInputMap().put(KeyStroke.getKeyStroke("2"),"twoAction");
        //first is the map name then second is the instance name
        button.getActionMap().put("twoAction", two);

        button.getInputMap().put(KeyStroke.getKeyStroke("3"),"threeAction");
        //first is the map name then second is the instance name
        button.getActionMap().put("threeAction", three);

        button.getInputMap().put(KeyStroke.getKeyStroke("4"),"fourAction");
        //first is the map name then second is the instance name
        button.getActionMap().put("fourAction", four);

        button.getInputMap().put(KeyStroke.getKeyStroke("5"),"fiveAction");
        //first is the map name then second is the instance name
        button.getActionMap().put("fiveAction", five);

        button.getInputMap().put(KeyStroke.getKeyStroke("6"),"sixAction");
        //first is the map name then second is the instance name
        button.getActionMap().put("sixAction", six);

        button.getInputMap().put(KeyStroke.getKeyStroke("7"),"sevenAction");
        //first is the map name then second is the instance name
        button.getActionMap().put("sevenAction", seven);

        button.getInputMap().put(KeyStroke.getKeyStroke("8"),"eightAction");
        //first is the map name then second is the instance name
        button.getActionMap().put("eightAction", eight);

        button.getInputMap().put(KeyStroke.getKeyStroke("9"),"nineAction");
        //first is the map name then second is the instance name
        button.getActionMap().put("nineAction", nine);
    }
}
