package doubleDispatch.TableDrivenMethod.SpaceExample.Model;

public class Planet extends SpaceObject{
	private String name;

	public Planet(String material, int speed, int mass, String name) {
		super(material, speed, mass, 0);
		this.name = name;
		initCollitionMap();
		initCoordinates();
		initIntegrity();
		
	}

	@Override
	protected void initCollitionMap() {
		getCollitionMap().put(Asteroid.class, (object) -> collideAsteroid(object));
		
	}
	
	private void collideAsteroid(SpaceObject object) {
		System.out.println("This planet has collide with an asteroid");
		setIntegrity(95);
	}

	@Override
	protected void initCoordinates() {
		getCoordinates().put(CoordinateType.X, 50);
		getCoordinates().put(CoordinateType.Y, 0);
		getCoordinates().put(CoordinateType.Z, 100);
		
	}

	@Override
	protected void initIntegrity() {
		setIntegrity(100);
	}

	public String getName() {
		return name;
	}	
}
