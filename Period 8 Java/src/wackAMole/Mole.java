package wackAMole;

import guiPractice.components.ClickableGraphic;

public class Mole extends ClickableGraphic implements MoleInterface {
	
	private int appearanceTime;

	public Mole(int x, int y) {
		super(x, y, 1, "resources/SampleImages/mole.jpg");
	}
	
	@Override
	public int getAppearanceTime() {
		return appearanceTime;
	}

	@Override
	public void setAppearanceTime(int d) {
		this.appearanceTime = d;
	}

}
