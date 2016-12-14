package guiPractice.components;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class Button extends TextLabel implements Clickable{
	
	private Color color;
	private Action action;

	public Button(int x, int y, int w, int h, String text, Color color, Action action) {
		super(x, y, w, h, text);
		this.color = color;
		this.action = action;
	}
	
	@Override
	public void update(Graphics2D g) {
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g.setFont(new Font(getFont(), Font.PLAIN, getSize()));
		g.setColor(color.black);
		if(getText() != null){
			g.drawRoundRect(0, 0, getWidth(), getHeight(), 25, 25);
			g.setColor(Color.white);
			g.fillRoundRect(0, 0, getWidth(), getHeight(), 25, 25);
			g.setColor(color.black);
			g.setFont(new Font(getFont(), Font.PLAIN, getSize()));
			g.drawString(getText(), 4, getHeight()-5);
		}
	}

	@Override
	public boolean isHovered(int x, int y) {
		if(getX() <= x && x <= getX()+getWidth() && getY() <= y && y <= getY()+getHeight()){
			System.out.println("true");
			return true;
		}else
		return false;
	}

	@Override
	public void act() {
		act();
	}

}
