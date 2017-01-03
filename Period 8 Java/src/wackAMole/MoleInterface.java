package wackAMole;

import guiPractice.components.Action;
import guiPractice.components.Clickable;

public interface MoleInterface extends Clickable {

	double getAppearanceTime();

	void setAppearanceTime(double i);

	void setAction(Action action);
}
