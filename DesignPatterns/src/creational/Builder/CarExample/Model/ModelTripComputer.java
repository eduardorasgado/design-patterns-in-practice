package creational.Builder.CarExample.Model;

public class ModelTripComputer implements TripComputer {

	@Override
	public int calculateDistance(int from, int to) {
		if(to > from) {
			return to - from;
		}
		return 0;
	}

	@Override
	public void recordDistance() {
		System.out.println("Start recording with model trip computer");
	}

	@Override
	public void displayTravelledDistance() {
		System.out.println("Displaying travelled distance using a model trip computer");
	}

	@Override
	public int calculateAverageFuelConsumption(Engine engine) {
		return engine.getHp() * 3;
	}

}
