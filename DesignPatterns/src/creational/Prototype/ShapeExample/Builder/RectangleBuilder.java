package creational.Prototype.ShapeExample.Builder;

import creational.Prototype.ShapeExample.Rectangle;

public class RectangleBuilder extends ShapeBuilder {
	private Rectangle rectangle;
	
	public RectangleBuilder() {
		rectangle = new Rectangle();
	}
	
	public RectangleBuilder setWidth(int width) {
		rectangle.setWidth(width);
		return this;
	}
	
	public RectangleBuilder setHeight(int height) {
		rectangle.setHeight(height);
		return this;
	}
	
	public RectangleBuilder setCoordinates(int x, int y) {
		setCoordinates(x, y, rectangle);
		return this;
	}
	
	public RectangleBuilder setColor(String color) {
		setColor(color, rectangle);
		return this;
	}
	
	public Rectangle build() {
		return rectangle;
	}
}
