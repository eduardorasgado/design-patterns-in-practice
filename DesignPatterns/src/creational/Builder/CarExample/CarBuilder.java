package creational.Builder.CarExample;

import creational.Builder.CarExample.Model.Engine;
import creational.Builder.CarExample.Model.GPS;
import creational.Builder.CarExample.Model.TripComputer;

public class CarBuilder implements Builder {
	private Car car;
	
	public CarBuilder() {
		car = new Car();
	}
	
	@Override
	public void setSeats(int number) {
		car.setSeats(number);
	}

	@Override
	public void setEngine(Engine engine) {
		car.setEngine(engine);
	}

	@Override
	public void setTripComputer(TripComputer tripComputer) {
		car.setTripComputer(tripComputer);
	}

	@Override
	public void setGPS(GPS gps) {
		car.setGps(gps);
	}
	
	public Car getResult() {
		return car;
	}
}
