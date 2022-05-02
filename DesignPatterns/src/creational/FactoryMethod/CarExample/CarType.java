package creational.FactoryMethod.CarExample;

import java.util.function.Supplier;

public enum CarType {
	TRUCK(Truck::new),
	SEDAN(Sedan::new),
	SUPERCAR(SuperCar::new);
	
	private Supplier<Car> constructor;
	
	private CarType(Supplier<Car> constructor) {
		this.constructor = constructor;
	}

	public Supplier<Car> getConstructor() {
		return constructor;
	}
}
