package creational.Prototype.ShapeExample;

public class Rectangle extends Shape implements IShape {
	
	private int width, height;
	
	public Rectangle() {
		super();
	}

	public Rectangle(Rectangle rectangle) {
		super(rectangle);

		width = rectangle.width;
		height = rectangle.height;
	}

	@Override
	public IShape clone() {
		return new Rectangle(this);
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + ", getX()=" + getX() + ", getY()=" + getY()
				+ ", getColor()=" + getColor() + "]";
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return getHeight() * getWidth();
	}

	@Override
	public double getPerimeter() {
		return 2 * (getHeight() + getWidth());
	}

	@Override
	public String getData() {
		return toString();
	}
}
