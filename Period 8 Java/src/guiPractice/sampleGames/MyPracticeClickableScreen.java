package guiPractice.sampleGames;

import java.util.ArrayList;

import guiPractice.components.Action;
import guiPractice.components.ClickableGraphic;
import guiPractice.components.ClickableScreen;
import guiPractice.components.Visible;

public class MyPracticeClickableScreen extends ClickableScreen {

	private ClickableGraphic idk;
	
	public MyPracticeClickableScreen(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	public void initAllObjects(ArrayList<Visible> viewObjects) {
		idk = new ClickableGraphic(200,200,.25,"resources/SampleImages/IDK.png");
		idk.setAction(new Action(){

			public void act() {
				idk.setX(idk.getX() + 10);
			}
			
		});
		viewObjects.add(idk);
	}

}
