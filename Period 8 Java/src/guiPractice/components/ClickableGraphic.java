package guiPractice.components;

public class ClickableGraphic extends Graphic implements Clickable {

	public ClickableGraphic(int x, int y, double scale, String imageLocation, Action action) {
		super(x, y, scale, imageLocation, action);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isHovered(int x, int y) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void act() {
		// TODO Auto-generated method stub
		
	}

}
