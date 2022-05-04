package creational.Builder.CarExample;

import creational.Builder.CarExample.Model.Engine;
import creational.Builder.CarExample.Model.GPS;
import creational.Builder.CarExample.Model.TripComputer;

public class Car {
	private int seats;
	private Engine engine;
	private TripComputer tripComputer;
	private GPS gps;
	
	public int getSeats() {
		return seats;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public TripComputer getTripComputer() {
		return tripComputer;
	}
	public void setTripComputer(TripComputer tripComputer) {
		this.tripComputer = tripComputer;
	}
	public GPS getGps() {
		return gps;
	}
	public void setGps(GPS gps) {
		this.gps = gps;
	}
	@Override
	public String toString() {
		return "Car [seats=" + seats + ", engine=" + engine + ", tripComputer=" + tripComputer + ", gps=" + gps + "]";
	}
}
