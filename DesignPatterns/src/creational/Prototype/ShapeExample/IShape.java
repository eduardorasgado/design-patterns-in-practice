package creational.Prototype.ShapeExample;

public interface IShape extends Cloneable {
	double getArea();
	double getPerimeter();
	String getData();
	IShape clone();
}
