package structural.Flyweight.GameParticleExample;

public class MovingParticle extends Localizable {
	private Particle particle;
	private String vector;
	private int speed;
	
	public MovingParticle(Coordinate coordinate, Particle particle, int speed) {
		super(coordinate);
		this.particle = particle;
		this.speed = speed;
	}

	public Particle getParticle() {
		return particle;
	}

	public String getVector() {
		return vector;
	}

	public int getSpeed() {
		return speed;
	}

	public void moveTo(Coordinate targetCoordinate) {
		System.out.println("particle is moving...");
		vector = getCoordinate().toString() + targetCoordinate.toString();
	}
}
