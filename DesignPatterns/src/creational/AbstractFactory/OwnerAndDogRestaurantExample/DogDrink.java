package creational.AbstractFactory.OwnerAndDogRestaurantExample;

public class DogDrink implements Drink {

	@Override
	public void prepare() {
		System.out.println("Preparing dog drink");
	}

	@Override
	public void serve() {
		System.out.println("Serving dog drink");
	}

	@Override
	public void drink() {
		System.out.println("Drinking dog drink");
	}

	@Override
	public void pour() {
		System.out.println("Pouring dog drink");
	}
}
