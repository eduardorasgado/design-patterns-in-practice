package creational.Builder.CarExample;

import creational.Builder.CarExample.Model.Engine;
import creational.Builder.CarExample.Model.GPS;
import creational.Builder.CarExample.Model.TripComputer;

public interface Builder {
	void setSeats(int number);
	void setEngine(Engine engine);
	void setTripComputer(TripComputer tripComputer);
	void setGPS(GPS gps);
}
