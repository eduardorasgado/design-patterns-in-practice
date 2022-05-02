package creational.FactoryMethod.RestaurantMenuExample;

public class LemonadeDrink implements Drink {

	@Override
	public void prepare() {
		System.out.println("Preparing lemonade drink");
	}

	@Override
	public void serve() {
		System.out.println("Serving lemonade drink");
	}

	@Override
	public void drink() {
		System.out.println("Drinking lemonade drink");
	}

	@Override
	public void pour() {
		System.out.println("Pouring lemonade drink");
	}
}
