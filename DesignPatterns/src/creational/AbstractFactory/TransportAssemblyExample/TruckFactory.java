package creational.AbstractFactory.TransportAssemblyExample;

public class TruckFactory extends TransportFactory {

	@Override
	public Engine getEngine() {
		return new TruckEngine();
	}

	@Override
	public Tyre getTyre() {
		return new TruckTyre();
	}
}
