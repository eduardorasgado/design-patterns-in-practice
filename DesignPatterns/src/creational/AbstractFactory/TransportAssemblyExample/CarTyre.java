package creational.AbstractFactory.TransportAssemblyExample;

public class CarTyre implements Tyre {

	@Override
	public void design() {
		System.out.println("Designing a car tyre");
	}

	@Override
	public void manufacture() {
		System.out.println("Manufacturig a car tyre");
	}
	
}
