package creational.Prototype.ShapeExample;

import creational.Prototype.ShapeExample.Builder.CircleBuilder;
import creational.Prototype.ShapeExample.Builder.RectangleBuilder;

public class ShapeDemo {
	public static void main(String[] args) {
		IShape shape = new CircleBuilder()
				.setCoordinates(5, 6)
				.setColor("red")
				.setRadious(4.5F)
				.build();
		
		System.out.println(shape.getData());
		System.out.println(shape.getArea());
		
		IShape anotherShape = shape.clone();
		System.out.println(anotherShape.getData());
		System.out.println(anotherShape.getArea());
		
		System.out.println(anotherShape == shape);
	
		
		shape = new RectangleBuilder()
				.setCoordinates(10, 4)
				.setColor("blue")
				.setWidth(2)
				.setHeight(6)
				.build();
		
		System.out.println(shape.getData());
		System.out.println(shape.getArea());
		
		anotherShape = shape.clone();
		System.out.println(anotherShape.getData());
		System.out.println(anotherShape.getArea());
		
		System.out.println(anotherShape == shape);
	}
}
