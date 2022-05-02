package creational.FactoryMethod.LogisticsExample;

public class LogisticsDemo {
	public static void main(String[] args) {
		Logistics logistics = new RoadLogistics();
		logistics.planDelivery();
		
		logistics = new SeaLogistics();
		logistics.planDelivery();
	}
}
