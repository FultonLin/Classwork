package simon;

import java.util.ArrayList;

import guiPractice.components.ClickableScreen;
import guiPractice.components.TextLabel;
import guiPractice.components.Visible;
import wackAMole.MoleInterface;

public class SimonScreenFulton extends ClickableScreen implements Runnable {
	
	private TextLabel label;
	private ButtonInterfaceFulton[] button;
	private ArrayList<MoveInterfaceFulton> move; 
	private ProgressInterfaceFulton progress;
	private int roundNumber;
	private boolean acceptingInput;
	private int sequenceIndex;
	private int lastSelectedButton;

	public SimonScreenFulton(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		
	}

	@Override
	public void initAllObjects(ArrayList<Visible> viewObjects) {
		// TODO Auto-generated method stub

	}

}
