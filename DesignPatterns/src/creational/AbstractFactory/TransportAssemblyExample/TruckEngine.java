package creational.AbstractFactory.TransportAssemblyExample;

public class TruckEngine implements Engine {

	@Override
	public void design() {
		System.out.println("Designing a truck engine");
	}

	@Override
	public void manufacture() {
		System.out.println("Manufacturing a truck engine");
	}

	@Override
	public void test() {
		System.out.println("Testing a truck engine");
	}

}
