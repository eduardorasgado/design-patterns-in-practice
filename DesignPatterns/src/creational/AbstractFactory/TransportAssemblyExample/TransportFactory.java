package creational.AbstractFactory.TransportAssemblyExample;

import java.util.HashMap;
import java.util.Map;

public abstract class TransportFactory {
	
	private static Map<TransportFactoryType, TransportFactory> FACTORIES = new HashMap<>() {
		private static final long serialVersionUID = 1L;

	{
		put(TransportFactoryType.CAR_FACTORY, new CarFactory());
		put(TransportFactoryType.TRUCK_FACTORY, new TruckFactory());
	}};
	
	protected abstract Engine getEngine();
	protected abstract Tyre getTyre();
	
	public static TransportFactory getFactory(TransportFactoryType tfType) {
		return FACTORIES.get(tfType);
	}
}
