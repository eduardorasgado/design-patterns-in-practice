package creational.Prototype.UIExample;

public class Style {
	private String color;
	
	public Style() { }
	
	public Style(Style style) {
		this.color = style.color;
	}
	
	public Style(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
