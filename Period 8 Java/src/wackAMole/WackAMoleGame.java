package wackAMole;

import guiPractice.GUIApplication;

public class WackAMoleGame extends GUIApplication {
	
	public static WackAMoleScreen gameScreen;
	public static WackAMoleGame game;

	protected void initScreen() {
		gameScreen = new WackAMoleScreen(getWidth(), getHeight());
		setScreen(gameScreen);
	}

	public static void main(String[] args) {
		game = new WackAMoleGame();
		Thread app = new Thread(game);
		app.start();
	}

}
