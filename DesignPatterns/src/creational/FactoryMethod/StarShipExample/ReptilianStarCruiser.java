package creational.FactoryMethod.StarShipExample;

public class ReptilianStarCruiser implements Cruiser {

	@Override
	public void launch() {
		System.out.println("Launching reptilian star cruiser");
	}

	@Override
	public void land() {
		System.out.println("Landing reptilian star cruiser");
	}

	@Override
	public void lightSpeedFlight() {
		System.out.println("light speed traveling the reptilian star cruiser");
	}

	@Override
	public void attack() {
		System.out.println("reptilian Star cruiser is attacking...");
	}

}
