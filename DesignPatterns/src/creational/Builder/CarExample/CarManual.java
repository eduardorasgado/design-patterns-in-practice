package creational.Builder.CarExample;

import creational.Builder.CarExample.Model.Engine;
import creational.Builder.CarExample.Model.GPS;
import creational.Builder.CarExample.Model.TripComputer;

public class CarManual {
	private int pageNumber;
	private String name;
	
	void setSeatsPage(int seats) {
		System.out.println("initializing seats page");
	}
	
	void setEnginePage(Engine engine) {
		System.out.println("initializing engine page");
	}
	
	void setTripComputerPage(TripComputer tripComputer) {
		System.out.println("initializing trip computer page");
	}
	
	void setGpsPage(GPS gps) {
		System.out.println("initializing gps page");
	}

	public int getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "CarManual [pageNumber=" + pageNumber + ", name=" + name + "]";
	}
}
