package creational.Factory.RestaurantMenuExample;

public class MenuFoodFactoryDemo {
	public static void main(String[] args) {
		Pizza pizza = MenuFoodFactory.getPizza(PizzaType.MARGHERITA);
		Topping topping = MenuFoodFactory.getTopping(ToppingType.ONION);
		Drink drink = MenuFoodFactory.getDrink(DrinkType.WINE);
		
		pizza.slice();
		topping.dip();
		drink.drink();
	}
}
