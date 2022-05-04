package creational.Builder.CarExample;

import creational.Builder.CarExample.Model.Engine;
import creational.Builder.CarExample.Model.GPS;
import creational.Builder.CarExample.Model.TripComputer;

public class CarManualBuilder implements Builder{
	private CarManual carManual;
	
	public CarManualBuilder() {
		carManual = new CarManual();
	}
	@Override
	public void setSeats(int number) {
		carManual.setSeatsPage(number);
	}

	@Override
	public void setEngine(Engine engine) {
		carManual.setEnginePage(engine);
	}

	@Override
	public void setTripComputer(TripComputer tripComputer) {
		carManual.setTripComputerPage(tripComputer);
	}

	@Override
	public void setGPS(GPS gps) {
		carManual.setGpsPage(gps);
	}

	public CarManual getResult() {
		return carManual;
	}
}
