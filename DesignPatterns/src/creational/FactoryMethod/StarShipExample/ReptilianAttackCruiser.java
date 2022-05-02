package creational.FactoryMethod.StarShipExample;

public class ReptilianAttackCruiser implements Cruiser {

	@Override
	public void launch() {
		System.out.println("Launching reptilian attack cruiser");
	}

	@Override
	public void land() {
		System.out.println("Landing reptilian attack cruiser");
	}

	@Override
	public void lightSpeedFlight() {
		System.out.println("light speed traveling the reptilian attack cruiser");
	}

	@Override
	public void attack() {
		System.out.println("reptilian Attack cruiser is attacking...");
	}

}
