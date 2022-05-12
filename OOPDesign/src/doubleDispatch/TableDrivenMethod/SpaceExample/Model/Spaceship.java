package doubleDispatch.TableDrivenMethod.SpaceExample.Model;

public class Spaceship extends SpaceObject {
	private String team;
	
	public Spaceship(String material, int speed, int mass, String team) {
		// TODO: Reduce params using builder
		super(material, speed, mass, 0);
		this.team = team;
		initCollitionMap();
		initCoordinates();
		initIntegrity();
	}
	
	@Override
	public void initCollitionMap() {
		getCollitionMap().put(Asteroid.class, (object) -> collideAsteroid(object));
	}
	
	private void collideAsteroid(SpaceObject object) {
		System.out.println("The spaceship has collide with an asteroid");
		
		int massDiff = getMass() - object.getMass();
		int speedDiff = getSpeed() - object.getSpeed();
		
		System.out.println("massdiff = " + massDiff);
		System.out.println("speeddiff = " + speedDiff);
		
		int damage = (massDiff < 0) ? 100 : (speedDiff < 0) ? 80 : 50;
		setIntegrity(getIntegrity() - damage);
	}

	@Override
	protected void initCoordinates() {
		getCoordinates().put(CoordinateType.X, 0);
		getCoordinates().put(CoordinateType.Y, 0);
		getCoordinates().put(CoordinateType.Z, 0);
	}

	@Override
	protected void initIntegrity() {
		setIntegrity(100);
	}
}
