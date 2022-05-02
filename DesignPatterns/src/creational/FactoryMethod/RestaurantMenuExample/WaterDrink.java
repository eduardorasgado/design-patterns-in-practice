package creational.FactoryMethod.RestaurantMenuExample;

public class WaterDrink implements Drink {

	@Override
	public void prepare() {
		System.out.println("Preparing water");
	}

	@Override
	public void serve() {
		System.out.println("Serving water");
	}

	@Override
	public void drink() {
		System.out.println("Drinking water");
	}

	@Override
	public void pour() {
		System.out.println("Pouring water");
	}
}
