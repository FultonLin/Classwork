package guiPractice.sampleGames;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import javax.swing.ImageIcon;

import guiPractice.Screen;
import guiPractice.components.Action;
import guiPractice.components.AnimatedComponent;
import guiPractice.components.Button;
import guiPractice.components.Graphic;
import guiPractice.components.Moving;
import guiPractice.components.MovingComponent;
import guiPractice.components.TextArea;
import guiPractice.components.TextLabel;
import guiPractice.components.Visible;

public class CoordinateScreen extends Screen implements MouseMotionListener, MouseListener{

	private TextLabel label;
	private TextArea paragraph;
	private Button myButton;
	private Graphic picture;
	private MoveScreen move;
	
	public CoordinateScreen(int width, int height) {
		super(width, height);
	}

	public void initObjects(ArrayList<Visible> viewObjects) {
		label = new TextLabel(40, 45, 760, 40, "Sample Text");
		paragraph = new TextArea(40,85,550,500,"This is a whole paragraph. "
				+ "Notice how as the paragraph gets to the edge of the page, a new line is created.");
		myButton = new Button(40,200,80,40,"Button", new Color(0,76,153), new Action(){
			public void act(){
				MouseFollower.game.setScreen(MouseFollower.myScreen);
			}
		});
		picture = new Graphic(50,50,2,"resources/SampleImages/IDK.png");
		viewObjects.add(picture);
		//custom size
		picture = new Graphic(50,50,50,50,"resources/SampleImages/IDK.png");
		viewObjects.add(myButton);
		viewObjects.add(label);
		viewObjects.add(paragraph);
		viewObjects.add(picture);
		
		Moving mc = new Moving(30,60,80,80);
		mc.setVy(3);
		mc.play();
		viewObjects.add(mc);
		
//		addAnimation(viewObjects);
	}
	
	private void addAnimation(ArrayList<Visible> viewObjects) {
		AnimatedComponent a = new AnimatedComponent(40, 50, 200, 200);
		try{
			int numberInRow = 3;
			int rows = 4;
			int w = 380;
			int h = 230;
			
			ImageIcon icon = new ImageIcon("resources/" + "SampleImages/sheet.png");
			//create a for loop that will take a "sub-image" from the sprite grid
			for(int i = 0; i < numberInRow * rows; i++){
				//declare the "cropped image"
				BufferedImage cropped = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
				int leftMargin = 0; 
				int topMargin = 0;
				int x1 = leftMargin + w * (i%numberInRow);
				int y1 = topMargin + h * (i/numberInRow);
				Graphics2D g = cropped.createGraphics();
				g.drawImage(icon.getImage(), 100, 100, w, h, x1, y1, x1 + w, y1 + h, null);
				a.addFrame(cropped, 40);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		viewObjects.add(a);
		a.play();
	}

	public void mouseDragged(MouseEvent arg0) {
		
	}

	public void mouseMoved(MouseEvent m) {
		label.setText("Mouse at" + m.getX() + ", " + m.getY());
	}
	
	public MouseMotionListener getMouseMotionListener(){
		return this;
	}

	public MouseListener getMouseListener(){
		return this;
	}
	
	public void mouseClicked(MouseEvent m) {
		if(myButton.isHovered(m.getX(), m.getY())){
			myButton.act();
		}
	}

	public void mouseEntered(MouseEvent e) {
		
	}

	public void mouseExited(MouseEvent e) {
		
	}

	public void mousePressed(MouseEvent e) {
		
	}

	public void mouseReleased(MouseEvent e) {
		
	}

}
