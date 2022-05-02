package creational.Factory.RestaurantMenuExample;

import java.util.function.Supplier;

public enum PizzaType {
	MARGHERITA(MargheritaPizza::new),
	HAWAIIAN(HawaiianPizza::new),
	SALAMI(SalamiPizza::new);
	
	private Supplier<Pizza> constructor;
	
	private PizzaType(Supplier<Pizza> constructor) {
		this.constructor = constructor;
	}

	public Supplier<Pizza> getConstructor() {
		return constructor;
	}
}
