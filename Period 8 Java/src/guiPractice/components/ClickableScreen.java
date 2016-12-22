package guiPractice.components;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import guiPractice.Screen;

public abstract class ClickableScreen extends Screen implements MouseListener{

	private ArrayList<Clickable> clickables;
	
	public ClickableScreen(int width, int height) {
		super(width, height);
	}

	public void initObjects(ArrayList<Visible> viewObjects) {
		initAllObjects(viewObjects);
		for(int i = 0; i < clickables.size(); i++){
			if(clickables.get(i) instanceof Clickable){
				clickables.add((Clickable)clickables.get(i));
			}
		}
	}
	
	public abstract void initAllObjects(ArrayList<Visible> viewObjects);

	
	public void mouseClicked(MouseEvent e) {
		for(int i = 0; i < clickables.size(); i++){
			if(clickables.get(i).isHovered(e.getX(), e.getY())){
				clickables.get(i).act();
				break;
			}
		}
	}

	public void addObject(Visible v){
		super.addObject(v);
		if(v instanceof Clickable){
			clickables.add((Clickable) v);
		}
	}
	
	public void remove(Visible v){
		super.remove(v);
		clickables.remove(v);
	} 
	 
	public void mouseEntered(MouseEvent e) {
		
	}

	public void mouseExited(MouseEvent e) {
		
	}

	public void mousePressed(MouseEvent e) {
		
	}

	public void mouseReleased(MouseEvent e) {
		
	}

	public MouseListener getMouseListeners(){
		return this;
	}
}
