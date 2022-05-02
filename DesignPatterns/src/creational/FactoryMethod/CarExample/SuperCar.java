package creational.FactoryMethod.CarExample;

public class SuperCar implements Car {

	@Override
	public void design() {
		System.out.println("Designing a super car");
	}

	@Override
	public void manufacture() {
		System.out.println("Manufacturing a Super car");
	}
}
