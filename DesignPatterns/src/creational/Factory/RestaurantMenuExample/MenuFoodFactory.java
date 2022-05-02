package creational.Factory.RestaurantMenuExample;

public abstract class MenuFoodFactory {
	
	public static Pizza getPizza(PizzaType pizzaType) {
		return pizzaType.getConstructor().get();
	}
	
	public static Topping getTopping(ToppingType toppingType) {
		return toppingType.getConstructor().get();
	}
	
	public static Drink getDrink(DrinkType drinkType) {
		return drinkType.getConstructor().get();
	}
}
