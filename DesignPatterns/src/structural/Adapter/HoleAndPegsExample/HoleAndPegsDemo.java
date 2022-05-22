package structural.Adapter.HoleAndPegsExample;

public class HoleAndPegsDemo {
	
	public static void main(String[] args) {
		RoundHole roundHole = new RoundHole(5.6F);
		
		RoundPeg roundPeg = new RoundPeg(5.5F);
		
		SquarePeg squarePeg = new SquarePeg(8.0F);
		RoundPegAdapter roundPegAdapter = new RoundPegAdapter(squarePeg);
		
		System.out.println(roundHole.fits(roundPeg));
		System.out.println(roundHole.fits(roundPegAdapter));
	}
}
