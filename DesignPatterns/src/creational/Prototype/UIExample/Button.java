package creational.Prototype.UIExample;

public class Button implements Interactable {
	int x, y;
	private Style style;
	
	public Button(int x, int y) {
		this.x = x;
		this.y = y;
		style = new Style();
	}
	public Button(Button button) {
		setCoordinates(button.x, button.y);
		style = new Style(button.getStyle());
	}
	
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void setCoordinates(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public Style getStyle() {
		return style;
	}

	public void setStyle(Style style) {
		this.style = style;
	}
	
	@Override
	public Interactable clone() {
		return new Button(this);
	}
	@Override
	public void startInteraction() {
		System.out.println(style.getColor() + " button clicked");
	}
	@Override
	public void finishInteraction() {
		System.out.println(style.getColor() + " button unclicked");
	}
}
