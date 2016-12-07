package guiPractice;

import javax.swing.JFrame;

public class GUIApplication extends JFrame{

	// main method for practice only
	public static void main(String[] args) {
		new GUIApplication();
	}

	public GUIApplication() {
		//terminate program when window is closed
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		int x = 40;
		int y = 40;
		int width = 600;
		int height = 400;
		setBounds(x,y,width,height);
		setVisible(true);
	}
}
