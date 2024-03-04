/*
 * Instantiate the elements here. Event listeners should also be found here.
 */

 //this is where we will draw the elements of the animated scene
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.util.*;
import java.awt.event.*;
import java.io.IOException;
import java.io.*;
import javax.sound.sampled.*;

public class SceneCanvas extends JComponent{
    private ArrayList<DrawingObject> elements;
    private boolean[] amISelected;
	private Action zero, one, two,three, four,five, six,seven,eight,nine;
    private File aria, blocks, cat, chirp, door, hauntMuskie,kyoto, mall, mutation, strad;
    private AudioInputStream zeroStream, oneStream, twoStream, threeStream, fourStream, fiveStream, sixStream, sevenStream, eightStream, nineStream;
    private Clip clip;
    private ToolBox toolbox;
	private double y = 200, max_y = 100, max_y2 = 290, y2 = 170, y3 = 180, y4 = 320, x = 800, sx = 230, sx2 = 400, sx3 = 620, sy = 100, sy2 = 200, sy3 = 100;
	private int xsong = 340;
	private String songname = " ";
	
    public SceneCanvas() {

        //for the boolean array
        amISelected = new boolean[10];
        


        //selected = new ArrayList<>();
        
        


        //instantiate the music files
       
            aria = new File("Aria Math.wav");
            blocks = new File("Blocks.wav");
            cat = new File("Cat.wav");
            chirp = new File("Chirp.wav");
            door = new File("Door.wav");
            hauntMuskie = new File("HauntMuskie.wav");
            kyoto = new File("Kyoto.wav");
            mall = new File("Mall.wav");
            mutation = new File("Mutation.wav");
            strad = new File("Strad.wav");
        
        //instantiating audiostream
        try {
            zeroStream = AudioSystem.getAudioInputStream(aria);
            oneStream = AudioSystem.getAudioInputStream(blocks);
            twoStream = AudioSystem.getAudioInputStream(cat);
            threeStream = AudioSystem.getAudioInputStream(chirp);
            fourStream = AudioSystem.getAudioInputStream(door);
            fiveStream = AudioSystem.getAudioInputStream(hauntMuskie);
            sixStream = AudioSystem.getAudioInputStream(kyoto);
            sevenStream = AudioSystem.getAudioInputStream(mall);
            eightStream = AudioSystem.getAudioInputStream(mutation);
            nineStream = AudioSystem.getAudioInputStream(strad);

            clip = AudioSystem.getClip();
        }
        catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {

        }
        

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
    
        
        //instantiating toolbox
        toolbox = new ToolBox(150, 500, 500);
        
        elements = new ArrayList<DrawingObject>();

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
        elements.add(new ThreeDDisc(600, 300, 200, 100, Color.RED));


        elements.add(toolbox);
        
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

	    Background bg = new Background();
		bg.draw(g2d);
        
		Snowfall sf = new Snowfall(sx,sy);
		sf.draw(g2d);
		
		Snowfall sf2 = new Snowfall(sx2,sy2);
		sf2.draw(g2d);
		
		Snowfall sf3 = new Snowfall(sx3,sy3);
		sf3.draw(g2d);
        
        for (DrawingObject drawingObj : elements) {
            drawingObj.draw(g2d);
        }

	    g2d.setPaint(Color.black);
		g2d.setFont(new Font("minecraft",Font.BOLD,13));
		g2d.drawString("Minecraft & Chill",165,250);
	    
        Smoke smoke = new Smoke(555,y);
		smoke.draw(g2d);
		
		Smoke smoke2 = new Smoke(570,y2);
		smoke2.draw(g2d);
		
		Smoke smoke3 = new Smoke(600,y3);
		smoke3.draw(g2d);
		
		MusicNote mn = new MusicNote(x,y4);
		mn.draw(g2d);
		
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

		if (sy<160){
			sy++;
			sx--;
			if(sy == 160){
				sx = 230;
				sy = 100;
			}
		}
		
		if (sy2<230){
			sy2++;
			sx2--;
			if (sy2 == 230){
				sx2 = 400;
				sy2 = 200;
			}
		}
		
		if (sy3<200){
			sy3++;
			sx3--;
			if (sy3 == 200){
				sx3 = 620;
				sy3 = 100;
			}
		}
	    
		try{
		Thread.sleep(20);
		}catch(Exception ex){}
		g2d.setPaint(Color.magenta);
		g2d.setFont(new Font("minecraft",Font.BOLD,20));
	    	g2d.drawString(songname,xsong,480);
		revalidate();
		repaint();
    }
    
    private void resetSelected() {
        for (int i = 0; i<10; i++) {
            toolbox.returnMenuBox(i).resetSelect();
        }
    }
	
    private class ZeroAction extends AbstractAction {
        @Override 
        public void actionPerformed(ActionEvent ae) {
            System.out.println("You pressed 0");
            //MenuBox m = toolbox.returnMenuBox(0);
            //m.highlightBox();

            try {
            resetSelected();
            MenuBox m = toolbox.returnMenuBox(0);
            m.selectBox();

            zeroStream = AudioSystem.getAudioInputStream(aria);
            clip = AudioSystem.getClip();
            clip.open(zeroStream);
			songname = "Aria Math";
		    	xsong = 340;
			repaint();

            }
            catch(UnsupportedAudioFileException | LineUnavailableException | IOException e) {

            }
            
        }
    }

    private class OneAction extends AbstractAction {
        @Override 
        public void actionPerformed(ActionEvent ae) {
            System.out.println("You pressed 1");
            try {
                resetSelected();
                MenuBox m = toolbox.returnMenuBox(1);
                m.selectBox();

                oneStream = AudioSystem.getAudioInputStream(blocks);
                clip = AudioSystem.getClip();
                clip.open(oneStream);
				songname = "Blocks";
				xsong = 365;
				repaint();
				
                }
                catch(UnsupportedAudioFileException | LineUnavailableException | IOException e) {

                }
        }
    }

    private class TwoAction extends AbstractAction {
        @Override 
        public void actionPerformed(ActionEvent ae) {
            System.out.println("You pressed 2");
            try {
                resetSelected();
                MenuBox m = toolbox.returnMenuBox(2);
                m.selectBox();

                twoStream = AudioSystem.getAudioInputStream(cat);
                clip = AudioSystem.getClip();
                clip.open(twoStream);
				songname = "Cat";
				xsong = 380;
				repaint();
    
                }
                catch(UnsupportedAudioFileException | LineUnavailableException | IOException e) {

                }
            
            
        }
    }


    private class ThreeAction extends AbstractAction {
        @Override 
        public void actionPerformed(ActionEvent ae) {
            System.out.println("You pressed 3");
            try {
                resetSelected();
                MenuBox m = toolbox.returnMenuBox(3);
                m.selectBox();


                threeStream = AudioSystem.getAudioInputStream(chirp);
                clip = AudioSystem.getClip();
                clip.open(threeStream);
				songname = "Chirp";
				xsong = 365;
				repaint();
    
                }
                catch(UnsupportedAudioFileException | LineUnavailableException | IOException e) {

                }
            
            
        }
    }

    private class FourAction extends AbstractAction {
        @Override 
        public void actionPerformed(ActionEvent ae) {
            System.out.println("You pressed 4");
            
            try {
                resetSelected();
                MenuBox m = toolbox.returnMenuBox(4);
                m.selectBox();

                fourStream = AudioSystem.getAudioInputStream(door);
                clip = AudioSystem.getClip();
                clip.open(fourStream);
				songname = "Door";
				xsong = 370;
				repaint();
    
                }
                catch(UnsupportedAudioFileException | LineUnavailableException | IOException e) {

                }
            
        }
    }

    private class FiveAction extends AbstractAction {
        @Override 
        public void actionPerformed(ActionEvent ae) {
            System.out.println("You pressed 5");
            try {
                resetSelected();
                MenuBox m = toolbox.returnMenuBox(5);
                m.selectBox();


                fiveStream = AudioSystem.getAudioInputStream(hauntMuskie);
                clip = AudioSystem.getClip();
                clip.open(fiveStream);
				songname = "Haunt Muskie";
				xsong = 320;
				repaint();
    
                }
                catch(UnsupportedAudioFileException | LineUnavailableException | IOException e) {

                }
            
        }
    }

    private class SixAction extends AbstractAction {
        @Override 
        public void actionPerformed(ActionEvent ae) {
            System.out.println("You pressed 6");
            try {
                resetSelected();
                MenuBox m = toolbox.returnMenuBox(6);
                m.selectBox();

                sixStream = AudioSystem.getAudioInputStream(kyoto);
                clip = AudioSystem.getClip();
                clip.open(sixStream);
				songname = "Kyoto";
				xsong = 365;
				repaint();
    
                }
                catch(UnsupportedAudioFileException | LineUnavailableException | IOException e) {

                }
            
        }
    }

    private class SevenAction extends AbstractAction {
        @Override 
        public void actionPerformed(ActionEvent ae) {
            System.out.println("You pressed 7");
            try {
                resetSelected();
                MenuBox m = toolbox.returnMenuBox(7);
                m.selectBox();

                sevenStream = AudioSystem.getAudioInputStream(mall);
                clip = AudioSystem.getClip();
                clip.open(sevenStream);
				songname = "Mall";
				xsong = 375;
				repaint();
    
                }
                catch(UnsupportedAudioFileException | LineUnavailableException | IOException e) {

                }
            
        }
    }

    private class EightAction extends AbstractAction {
        @Override 
        public void actionPerformed(ActionEvent ae) {
            System.out.println("You pressed 8");
            try {
                resetSelected();
                MenuBox m = toolbox.returnMenuBox(8);
                m.selectBox();

                eightStream = AudioSystem.getAudioInputStream(mutation);
                clip = AudioSystem.getClip();
                clip.open(eightStream);
				songname = "Mutation";
				xsong = 350;
				repaint();
    
                }
                catch(UnsupportedAudioFileException | LineUnavailableException | IOException e) {

                }
            
        }
    }
	
    private class NineAction extends AbstractAction {
        @Override 
        public void actionPerformed(ActionEvent ae) {
            System.out.println("You pressed 9");
            try {
                resetSelected();
                MenuBox m = toolbox.returnMenuBox(9);
                m.selectBox();

                nineStream = AudioSystem.getAudioInputStream(strad);
                clip = AudioSystem.getClip();
                clip.open(nineStream);
				songname = "Strad";
				xsong = 355;
				repaint();
    
                }
                catch(UnsupportedAudioFileException | LineUnavailableException | IOException e) {

                }
        }
    }
    public void setUpKeyBindings(JButton button, SceneCanvas canvas) {
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

        //repaint the canvas after 
        canvas.repaint();
    }
    public void setUpPlayListener(JButton playButton) {
        playButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                clip.start();
				x = 390;
            }
        });
    }
    public void setUpStopListener (JButton stopButton) {
        stopButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                clip.stop();
                clip.close();
		    songname = " ";
				x = 800;
            }
        });
    }

}
