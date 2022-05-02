package creational.Factory.CarExample;

public class CarFactoryDemo {
	public static void main(String[] args) {
		Car car = CarFactory.createCar(CarType.TRUCK); 
		car.design();
		car.manufacture();
		
		car = CarFactory.createCar(CarType.SEDAN);
		car.design();
		car.manufacture();
	}
}
