package creational.FactoryMethod.StarShipExample;

public class HumanHeavyCruiser implements Cruiser {

	@Override
	public void launch() {
		System.out.println("Launching human heavy cruiser");
	}

	@Override
	public void land() {
		System.out.println("Landing human heavy cruiser");
	}

	@Override
	public void lightSpeedFlight() {
		System.out.println("light speed traveling the human heavy cruiser");
	}

	@Override
	public void attack() {
		System.out.println("human Heavy cruiser is attacking...");
	}

}
