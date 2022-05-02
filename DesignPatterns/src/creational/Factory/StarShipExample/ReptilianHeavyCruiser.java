package creational.Factory.StarShipExample;

public class ReptilianHeavyCruiser implements Cruiser {

	@Override
	public void launch() {
		System.out.println("Launching reptilian heavy cruiser");
	}

	@Override
	public void land() {
		System.out.println("Landing reptilian heavy cruiser");
	}

	@Override
	public void lightSpeedFlight() {
		System.out.println("light speed traveling the reptilian heavy cruiser");
	}

	@Override
	public void attack() {
		System.out.println("reptilian Heavy cruiser is attacking...");
	}

}
