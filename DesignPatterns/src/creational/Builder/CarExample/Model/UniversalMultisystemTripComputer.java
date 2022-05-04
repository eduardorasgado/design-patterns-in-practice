package creational.Builder.CarExample.Model;

public class UniversalMultisystemTripComputer implements TripComputer {

	@Override
	public int calculateDistance(int from, int to) {
		return from - to;
	}

	@Override
	public void recordDistance() {
		System.out.println("Recording distance using a universal multisystem trip computer");
	}

	@Override
	public void displayTravelledDistance() {
		System.out.println("Displaying travelled distance using a universal multisystem trip computer");
	}

	@Override
	public int calculateAverageFuelConsumption(Engine engine) {
		return (engine.getHp() - 2) * 3;
	}

}
