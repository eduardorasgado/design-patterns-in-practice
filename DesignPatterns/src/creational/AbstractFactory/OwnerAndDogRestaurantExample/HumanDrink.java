package creational.AbstractFactory.OwnerAndDogRestaurantExample;

public class HumanDrink implements Drink {

	@Override
	public void prepare() {
		System.out.println("Preparing human drink");
	}

	@Override
	public void serve() {
		System.out.println("Serving human drink");
	}

	@Override
	public void drink() {
		System.out.println("Drinking human drink");
	}

	@Override
	public void pour() {
		System.out.println("Pouring human drink");
	}
}
