package guiPractice;

import java.awt.Graphics;
import java.awt.RenderingHints;

import javax.swing.JFrame;

public abstract class GUIApplication extends JFrame{

	private Screen currentScreen;

	//you can not instantiate an abstract class
	
	public GUIApplication() {
		//terminate program when window is closed
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//make the border disappear
		setUndecorated(false);
		int x = 40;
		int y = 40;
		int width = 600;
		int height = 400;
		setBounds(x,y,width,height);
		initScreen();
		setVisible(true);
	}
	
	/**
	 * method for creating and setting the starting screen
	 */
	protected abstract void initScreen();
	
	public void paint(Graphics g){
		g.drawImage(currentScreen.getImage(), 0, 0, null);
	}
	
	public void setScreen(Screen screen){
		currentScreen = screen;
	}
}
