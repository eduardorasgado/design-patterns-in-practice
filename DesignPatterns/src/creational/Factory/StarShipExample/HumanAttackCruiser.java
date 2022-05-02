package creational.Factory.StarShipExample;

public class HumanAttackCruiser implements Cruiser {

	@Override
	public void launch() {
		System.out.println("Launching human attack cruiser");
	}

	@Override
	public void land() {
		System.out.println("Landing human attack cruiser");
	}

	@Override
	public void lightSpeedFlight() {
		System.out.println("light speed traveling the human attack cruiser");
	}

	@Override
	public void attack() {
		System.out.println("human Attack cruiser is attacking...");
	}

}
