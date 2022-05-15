package doubleDispatch.TableDrivenMethod.SpaceExample.Model;

public class Asteroid extends SpaceObject {
	private int diameter;
	private double gravity;

	public Asteroid(int diameter, String material, int speed, int mass, double gravity) {
		// TODO: params can be reduced with builder
		super(material, mass, speed, 0);
		this.diameter = diameter;
		this.gravity = gravity;
		initCollitionMap();
		initCoordinates();
		initIntegrity();
	}

	@Override
	public void initCollitionMap() {
		getCollitionMap().put(Spaceship.class, (object) -> collideSpaceship(object));
		getCollitionMap().put(Planet.class, (object) -> collidePlanet(object));
	}
	
	private void collideSpaceship(SpaceObject object) {
		// we can access other object data that can interact with this object
		System.out.println("The asteroid has collide with an spaceship");
		int massDiff = getMass() - object.getMass();
		int speedDiff = getSpeed() - object.getSpeed();
		
		System.out.println("massdiff = " + massDiff);
		System.out.println("speeddiff = " + speedDiff);
		
		int damage = (massDiff < 0) ? 20 : (speedDiff < 0) ? 15 : 5;
		
		setIntegrity(getIntegrity() - damage);
	}
	
	private void collidePlanet(SpaceObject object ) {
		System.out.println("The asteroid has collid with a planet");
	}

	@Override
	protected void initCoordinates() {
		getCoordinates().put(CoordinateType.X, 50);
		getCoordinates().put(CoordinateType.Y, 50);
		getCoordinates().put(CoordinateType.Z, 50);
	}

	@Override
	protected void initIntegrity() {
		setIntegrity(80);
	}	
}
