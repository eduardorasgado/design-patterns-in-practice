package structural.Composite.TreeAndLeavesExample.ImageEditorExample;

public class Circle extends Dot implements Graphic {
	private int radius;

	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
	}

	@Override
	public void draw() {
		System.out.println("Drawing a circle at x{ " + getX() + " } y{ " + getY() + " } radius{ " + radius + " }");
	}

}
