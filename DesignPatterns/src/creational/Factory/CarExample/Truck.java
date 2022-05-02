package creational.Factory.CarExample;

public class Truck implements Car {

	@Override
	public void design() {
		System.out.println("Designing a truck");
	}

	@Override
	public void manufacture() {
		System.out.println("Manufacturing a truck");
	}
}
