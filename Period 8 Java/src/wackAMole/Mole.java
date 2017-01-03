package wackAMole;

import guiPractice.components.ClickableGraphic;

public class Mole extends ClickableGraphic implements MoleInterface {
	
	private double appearanceTime;

	public Mole(int x, int y) {
		super(x, y, .5, "resources/SampleImages/mole.jpg");
	}
	
	@Override
	public double getAppearanceTime() {
		return appearanceTime;
	}

	@Override
	public void setAppearanceTime(double d) {
		this.appearanceTime = d;
	}

}
