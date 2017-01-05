package simon;

import java.awt.Color;
import java.util.ArrayList;

import guiPractice.components.Button;
import guiPractice.components.ClickableScreen;
import guiPractice.components.TextLabel;
import guiPractice.components.Visible;
import wackAMole.MoleInterface;

public class SimonScreenFulton extends ClickableScreen implements Runnable {
	
	private TextLabel label;
	private ButtonInterfaceFulton[] button;
	private ArrayList<MoveInterfaceFulton> sequence; 
	private ProgressInterfaceFulton progress;
	private int roundNumber;
	private boolean acceptingInput;
	private int sequenceIndex;
	private int lastSelectedButton;

	public SimonScreenFulton(int width, int height) {
		super(width, height);
		Thread app = new Thread(this);
		app.start();
	}

	@Override
	public void run() {
		
	}

	@Override
	public void initAllObjects(ArrayList<Visible> viewObjects) {
		addButtons();
		progress = getProgress();
		label = new TextLabel(130,230,300,40,"Let's play Simon!");
		sequence = new ArrayList<MoveInterfaceFulton>();
		//add 2 moves to start
		lastSelectedButton = -1;
		sequence.add(randomMove());
		sequence.add(randomMove());
		roundNumber = 0;
		viewObjects.add(progress);
		viewObjects.add(label);
	}

	private MoveInterfaceFulton randomMove() {
		ButtonInterfaceFulton b;
		int move;
		while(true){
			move = (int)(button.length*Math.random()-1);
			if(move != lastSelectedButton){
				break;
			}
			//code that randomly selects a ButtonInterfaceX
		}
		lastSelectedButton = move;
		b = button[move];
		return getMove(b);
	}

	/**
	Placeholder until partner finishes implementation of ProgressInterface
	*/
	private ProgressInterfaceFulton getProgress() {
		return null;
	}

	private void addButtons() {
		 int numberOfButtons = 5;
		 Color[] bColors = {Color.red,Color.blue,Color.green,Color.black,Color.yellow};
		 for(int i = 0; i < numberOfButtons; i++){
			 ButtonInterfaceFulton b;
			 getAButton(b);
			 b.setColor(bColors[i]);
			 b.setX(160 + (int)(100*Math.cos(i*2*Math.PI/(numberOfButtons))));
			 b.setY(160 + (int)(100*Math.cos(i*2*Math.PI/(numberOfButtons))));
		 }
	}

}
