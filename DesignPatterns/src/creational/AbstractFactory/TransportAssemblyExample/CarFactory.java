package creational.AbstractFactory.TransportAssemblyExample;

import creational.FactoryMethod.LogisticsExample.Transport;

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
