package structural.Bridge.ShapesExample.After;

import java.util.ArrayList;
import java.util.List;

import structural.Bridge.ShapesExample.After.Model.Blue;
import structural.Bridge.ShapesExample.After.Model.Circle;
import structural.Bridge.ShapesExample.After.Model.Color;
import structural.Bridge.ShapesExample.After.Model.Red;
import structural.Bridge.ShapesExample.After.Model.Shape;
import structural.Bridge.ShapesExample.After.Model.Square;

public class ShapesDemo {
	public static void main(String[] args) {
		Color red = new Red("Red", "2ih2o3");
		Shape circle = new Circle("Circle", red, 5.67);
		circle.render();
		
		List<Integer> rgba = new ArrayList<>();
		rgba.add(120);
		rgba.add(50);
		rgba.add(200);
		rgba.add(1);
		Color blue = new Blue("Blue", rgba);
		Shape square = new Square("Square", blue, 10.4);
		square.render();
	}
}
