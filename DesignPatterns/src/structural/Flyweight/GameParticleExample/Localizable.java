package structural.Flyweight.GameParticleExample;

public class Localizable {
	private Coordinate coordinate;

	public Localizable(Coordinate coordinate) {
		super();
		this.coordinate = coordinate;
	}

	public Coordinate getCoordinate() {
		return coordinate;
	}
	
	public void setCoordinate(Coordinate coordinate) {
		this.coordinate = coordinate;
	}
	
	public void move(Coordinate coordinate, String vector, int speed) {
		setCoordinate(coordinate);
		System.out.println("Moving to next position");
	}
}
