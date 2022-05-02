package creational.FactoryMethod.StarShipExample;

public class HumanStarCruiser implements Cruiser {

	@Override
	public void launch() {
		System.out.println("Launching human star cruiser");
	}

	@Override
	public void land() {
		System.out.println("Landing human star cruiser");
	}

	@Override
	public void lightSpeedFlight() {
		System.out.println("light speed traveling the human star cruiser");
	}

	@Override
	public void attack() {
		System.out.println("human Star cruiser is attacking...");
	}

}
