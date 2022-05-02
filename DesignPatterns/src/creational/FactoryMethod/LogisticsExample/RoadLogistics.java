package creational.FactoryMethod.LogisticsExample;

public class RoadLogistics extends Logistics {
	@Override
	protected Transport createTransport() {
		return new Truck();
	}
}
