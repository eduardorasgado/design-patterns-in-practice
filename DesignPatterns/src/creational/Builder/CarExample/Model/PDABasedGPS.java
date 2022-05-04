package creational.Builder.CarExample.Model;

public class PDABasedGPS implements GPS {

	@Override
	public void track() {
		System.out.println("Tracking with a pda based gps");
	}

	@Override
	public void map() {
		System.out.println("Mapping with a pda based gps");
	}

	@Override
	public void locate() {
		System.out.println("Locating with a pda based gps");
	}

}
