package creational.Factory.RestaurantMenuExample;

import java.util.function.Supplier;

public enum ToppingType {
	HAM(HamTopping::new),
	ONION(OnionTopping::new),
	CHEESE(CheeseTopping::new);
	
	private Supplier<Topping> constructor;
	
	private ToppingType(Supplier<Topping> constructor) {
		this.constructor = constructor;
	}

	public Supplier<Topping> getConstructor() {
		return constructor;
	}
}
