package creational.AbstractFactory.TransportAssemblyExample;


public class CarFactory extends TransportFactory {

	@Override
	public Engine getEngine() {
		return new CarEngine();
	}

	@Override
	public Tyre getTyre() {
		return new CarTyre();
	}
}
