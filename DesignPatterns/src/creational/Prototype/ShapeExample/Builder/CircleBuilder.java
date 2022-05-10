package creational.Prototype.ShapeExample.Builder;

import creational.Prototype.ShapeExample.Circle;

public class CircleBuilder extends ShapeBuilder {
	private Circle circle;
	
	public CircleBuilder() {
		circle = new Circle();
	}
	
	public CircleBuilder setRadious(float radious) {
		circle.setRadious(radious);
		return this;
	}
	
	public CircleBuilder setCoordinates(int x, int y) {
		setCoordinates(x, y, circle);
		return this;
	}
	
	public CircleBuilder setColor(String color) {
		setColor(color, circle);
		return this;
	}
	
	public Circle build() {
		return circle;
	}
}
