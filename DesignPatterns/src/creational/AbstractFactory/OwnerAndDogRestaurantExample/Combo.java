package creational.AbstractFactory.OwnerAndDogRestaurantExample;

public class Combo {
	private Pizza pizza;
	private Topping topping;
	private Drink drink;
	
	public Combo(ComboFactory comboFactory) {
		pizza = comboFactory.getPizza();
		topping = comboFactory.getTopping();
		drink = comboFactory.getDrink();
	}

	public Pizza getPizza() {
		return pizza;
	}

	public Topping getTopping() {
		return topping;
	}

	public Drink getDrink() {
		return drink;
	}
}
