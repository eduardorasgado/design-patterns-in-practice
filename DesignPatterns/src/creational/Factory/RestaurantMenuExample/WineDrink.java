package creational.Factory.RestaurantMenuExample;

public class WineDrink implements Drink {

	@Override
	public void prepare() {
		System.out.println("Preparing wine");
	}

	@Override
	public void serve() {
		System.out.println("Serving wine");
	}

	@Override
	public void drink() {
		System.out.println("Drinking wine");
	}

	@Override
	public void pour() {
		System.out.println("Pouring wine");
	}
}
