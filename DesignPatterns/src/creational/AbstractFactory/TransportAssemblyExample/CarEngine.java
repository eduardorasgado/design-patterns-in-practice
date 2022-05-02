package creational.AbstractFactory.TransportAssemblyExample;

public class CarEngine implements Engine {

	@Override
	public void design() {
		System.out.println("Designing a car engine");
	}

	@Override
	public void manufacture() {
		System.out.println("Manufacturing a car engine");
	}

	@Override
	public void test() {
		System.out.println("Testing a car engine");
	}

}
