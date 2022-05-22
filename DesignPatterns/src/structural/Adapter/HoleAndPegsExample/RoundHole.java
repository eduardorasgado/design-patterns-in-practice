package structural.Adapter.HoleAndPegsExample;

public class RoundHole {
	private float radius;

	public RoundHole(float radius) {
		this.radius = radius;
	}
	
	public boolean fits(RoundPeg peg) {
		return this.getRadius() > peg.getRadius();
	}

	public float getRadius() {
		return radius;
	}
}
