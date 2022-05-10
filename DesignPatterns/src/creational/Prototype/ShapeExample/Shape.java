package creational.Prototype.ShapeExample;

public abstract class Shape {
	private int x, y;
	private String color;
	
	public Shape() { }
	
	public Shape(Shape shape) {		
		x = shape.x;
		y = shape.y;
		color = shape.color;
	}

	protected int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	protected int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	protected String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
