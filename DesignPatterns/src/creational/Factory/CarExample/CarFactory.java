package creational.Factory.CarExample;

public class CarFactory {
	
	public static Car createCar(CarType carType) {
		return carType.getConstructor().get();
	}
}
