package structural.Bridge.ShapesExample.After.Model;

public class Circle extends Shape {
	private double radius;

	public Circle(String name, Color color, double radius) {
		super(name, color);
		this.radius = radius;
	}

	public double getRadious() {
		return radius;
	}

	@Override
	public void render() {
		Color color = getColor();
		System.out.println(
				"Shape: " + getName() + "| Color: " + color.getName() + "(HEX: " + color.getHexRepresentation() + ")");
	}
}
