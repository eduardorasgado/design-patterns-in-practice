package structural.Flyweight.GameParticleExample;

public class Particle {
	private String color;
	private String sprite;
	
	public Particle(String color, String sprite) {
		super();
		this.color = color;
		this.sprite = sprite;
	}

	public String getColor() {
		return color;
	}

	public String getSprite() {
		return sprite;
	}
}
