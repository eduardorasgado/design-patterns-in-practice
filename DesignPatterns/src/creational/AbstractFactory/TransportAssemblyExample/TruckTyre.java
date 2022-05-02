package creational.AbstractFactory.TransportAssemblyExample;

public class TruckTyre implements Tyre {

	@Override
	public void design() {
		System.out.println("Designing a truck tyre");
	}

	@Override
	public void manufacture() {
		System.out.println("Manufacturing a truck tyre");
	}
	
}
