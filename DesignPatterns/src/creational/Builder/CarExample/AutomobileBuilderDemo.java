package creational.Builder.CarExample;

public class AutomobileBuilderDemo {
	public static void main(String[] args) {
		CarBuilder carBuilder = new CarBuilder();
		AutomobileBuildDirector.makeSportsCar(carBuilder);
		Car superCar = carBuilder.getResult();
		System.out.println(superCar.toString());
		
		CarManualBuilder carManualBuilder = new CarManualBuilder();
		AutomobileBuildDirector.makeSUVCar(carManualBuilder);
		CarManual carManual = carManualBuilder.getResult();
		System.out.println(carManual.toString());
	}
}
