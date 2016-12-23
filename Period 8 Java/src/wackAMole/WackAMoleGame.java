package wackAMole;

import guiPractice.GUIApplication;

public class WackAMoleGame extends GUIApplication {

	public static void main(String[] args) {
		WackAMoleGame game = new WackAMoleGame();
		Thread app = new Thread(game);
		app.start();
	}
	
	protected void initScreen() {
		WackAMoleScreen wams = new WackAMoleScreen(getWidth(), getHeight());
		setScreen(wams);
	}
}
