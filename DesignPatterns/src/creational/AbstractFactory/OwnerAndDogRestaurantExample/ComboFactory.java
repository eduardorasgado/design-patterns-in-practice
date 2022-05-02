package creational.AbstractFactory.OwnerAndDogRestaurantExample;

public interface ComboFactory {
	Drink getDrink();
	Pizza getPizza();
	Topping getTopping();
}
