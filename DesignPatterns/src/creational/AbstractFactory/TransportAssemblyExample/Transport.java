package creational.AbstractFactory.TransportAssemblyExample;

public class Transport {
	private Engine engine;
	private Tyre tyre;
	
	public Transport(TransportFactory transportFactory) {
		engine = transportFactory.getEngine();
		tyre = transportFactory.getTyre();
	}

	public Engine getEngine() {
		return engine;
	}

	public Tyre getTyre() {
		return tyre;
	}
}
