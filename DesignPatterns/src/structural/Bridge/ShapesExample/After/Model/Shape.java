package structural.Bridge.ShapesExample.After.Model;

public abstract class Shape {
	private String name;
	private Color color;
	
	public Shape(String name, Color color) {
		super();
		this.name = name;
		this.color = color;
	}

	public abstract void render();

	protected String getName() {
		return name;
	}

	protected Color getColor() {
		return color;
	}
}
