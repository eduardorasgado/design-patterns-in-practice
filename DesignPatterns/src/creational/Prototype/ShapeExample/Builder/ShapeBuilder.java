package creational.Prototype.ShapeExample.Builder;

import creational.Prototype.ShapeExample.Shape;

public class ShapeBuilder {

	protected void setCoordinates(int x, int y, Shape shape) {
		shape.setX(x);
		shape.setY(y);
	}
	
	protected void setColor(String color, Shape shape) {
		shape.setColor(color);
	}
}
