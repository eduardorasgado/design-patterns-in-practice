package creational.AbstractFactory.OwnerAndDogRestaurantExample;

public class HumanComboFactory implements ComboFactory {

	@Override
	public Drink getDrink() {
		return new HumanDrink();
	}

	@Override
	public Pizza getPizza() {
		return new HumanPizza();
	}

	@Override
	public Topping getTopping() {
		return new HumanTopping();
	}

}
