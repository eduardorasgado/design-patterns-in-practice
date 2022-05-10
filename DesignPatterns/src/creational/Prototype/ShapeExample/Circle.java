package creational.Prototype.ShapeExample;

public class Circle extends Shape implements IShape {
	private float radious;
	
	public Circle() {
		super();
	}
	
	public Circle(Circle circle) {
		super(circle);

		radious = circle.radious;
	}
	
	@Override
	public IShape clone() {	
		return new Circle(this);
	}

	public float getRadious() {
		return radious;
	}

	public void setRadious(float radious) {
		this.radious = radious;
	}

	@Override
	public String toString() {
		return "Circle [radious=" + radious + ", getX()=" + getX() + ", getY()=" + getY() + ", getColor()=" + getColor()
				+ "]";
	}

	@Override
	public double getArea() {
		return Math.pow(2, Math.PI * getRadious()); 
	}

	@Override
	public double getPerimeter() {
		return 2 * Math.PI * getRadious();
	}

	@Override
	public String getData() {
		return toString();
	}
}
