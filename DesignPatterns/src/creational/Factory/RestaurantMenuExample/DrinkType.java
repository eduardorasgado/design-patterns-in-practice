package creational.Factory.RestaurantMenuExample;

import java.util.function.Supplier;

public enum DrinkType {
	LEMONADE(LemonadeDrink::new),
	WATER(WaterDrink::new),
	WINE(WineDrink::new);
	
	private Supplier<Drink> constructor;
	
	private DrinkType(Supplier<Drink> constructor) {
		this.constructor = constructor;
	}

	public Supplier<Drink> getConstructor() {
		return constructor;
	}
}
