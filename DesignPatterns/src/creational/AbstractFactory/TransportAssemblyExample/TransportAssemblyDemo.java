package creational.AbstractFactory.TransportAssemblyExample;

public class TransportAssemblyDemo {
	public static void main(String[] args) {
		Transport transport = new Transport(TransportFactory.getFactory(TransportFactoryType.CAR_FACTORY));
		Engine engine = transport.getEngine();
		engine.design();
		
		transport = new Transport(TransportFactory.getFactory(TransportFactoryType.TRUCK_FACTORY));
		Tyre tyre = transport.getTyre();
		tyre.manufacture();
	}
}
