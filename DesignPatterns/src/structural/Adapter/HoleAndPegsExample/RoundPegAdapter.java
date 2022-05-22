package structural.Adapter.HoleAndPegsExample;

public class RoundPegAdapter extends RoundPeg {
	private SquarePeg squarePeg;

	public RoundPegAdapter(SquarePeg squarePeg) {
		super();
		this.squarePeg = squarePeg;
	}

	@Override
	public float getRadius() {
		return (float) ((squarePeg.getWidth() * Math.sqrt(2)) / 2);
	}
}
