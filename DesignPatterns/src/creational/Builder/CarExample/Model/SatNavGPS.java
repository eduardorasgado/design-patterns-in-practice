package creational.Builder.CarExample.Model;

public class SatNavGPS implements GPS {

	@Override
	public void track() {
		System.out.println("Tracking with a sat nav gps");
	}

	@Override
	public void map() {
		System.out.println("Mapping with a sat nav gps");
	}

	@Override
	public void locate() {
		System.out.println("Locating with a sat nav gps");
	}

}
