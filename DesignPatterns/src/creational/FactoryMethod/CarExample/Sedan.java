package creational.FactoryMethod.CarExample;

public class Sedan implements Car {

	@Override
	public void design() {
		System.out.println("Designing a sedan");
	}

	@Override
	public void manufacture() {
		System.out.println("Manufacturing a Sedan");
	}
}
