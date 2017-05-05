package guiPractice.sampleGames;

import guiPractice.GUIApplication;

public class ClickGraphicsScreen extends GUIApplication {
	 
	public static void main(String[] args){
		ClickGraphicsScreen idk = new ClickGraphicsScreen();
		Thread app = new Thread(idk);
		app.start();
	}

	protected void initScreen() {
		MoveScreen idk = new MoveScreen(getWidth(), getHeight());
		setScreen(idk);
	}

}
