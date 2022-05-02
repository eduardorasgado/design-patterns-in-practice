package creational.AbstractFactory.OwnerAndDogRestaurantExample;

public class DogComboFactory implements ComboFactory {

	@Override
	public Drink getDrink() {
		return new DogDrink();
	}

	@Override
	public Pizza getPizza() {
		return new DogPizza();
	}

	@Override
	public Topping getTopping() {
		return new DogTopping();
	}

}
