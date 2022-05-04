package creational.Builder.CarExample.Model;

public interface TripComputer {
	int calculateDistance(int from, int to);
	void recordDistance();
	void displayTravelledDistance();
	int calculateAverageFuelConsumption(Engine engine);
}
