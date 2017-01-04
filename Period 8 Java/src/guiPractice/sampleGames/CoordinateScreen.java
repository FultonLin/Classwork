package guiPractice.sampleGames;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import guiPractice.Screen;
import guiPractice.components.Action;
import guiPractice.components.Button;
import guiPractice.components.Graphic;
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
		
		MovingComponent mc = new MovingComponent(30,60,80,80);
		mc.setVy(3);
		mc.play();
		viewObjects.add(mc);
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
