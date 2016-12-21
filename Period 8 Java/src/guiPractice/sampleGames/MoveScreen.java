package guiPractice.sampleGames;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import guiPractice.Screen;
import guiPractice.components.Action;
import guiPractice.components.ClickableGraphic;
import guiPractice.components.Visible;

public class MoveScreen extends Screen implements MouseListener{
	
	private ClickableGraphic idk;
	
	public MoveScreen(int x, int y) {
		super(x, y);
	}
	
	public void initObjects(ArrayList<Visible> viewObjects) {
		idk = new ClickableGraphic(200,200,.25,"resources/SampleImages/IDK.png");
		idk.setAction(new Action(){

			public void act() {
				idk.setX(idk.getX() + 10);
			}
			
		});
		viewObjects.add(idk);
	}
	
	public MouseListener getMouseListener(){
		return this;
	}

	public void mouseClicked(MouseEvent e) {
		if(idk.isHovered(e.getX(), e.getY())){
			idk.act();
		}
	}

	public void mouseEntered(MouseEvent arg0) {
		
	}

	public void mouseExited(MouseEvent arg0) {
		
	}

	public void mousePressed(MouseEvent arg0) {
		
	}

	public void mouseReleased(MouseEvent arg0) {
		
	}

}
