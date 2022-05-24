package structural.Bridge.ShapesExample.After.Model;

public class Square extends Shape {
	private double width;

	public Square(String name, Color color, double width) {
		super(name, color);
		this.width = width;
	}

	public double getWidth() {
		return width;
	}

	@Override
	public void render() {
		System.out.println("("+ getName() +")" + "color hex: " + getColor().getHexRepresentation());
	}
}
