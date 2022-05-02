package creational.AbstractFactory.OwnerAndDogRestaurantExample;

public class DogTopping implements Topping {
	@Override
	public void prepare() {
		System.out.println("Preparing dog topping");

	}

	@Override
	public void serve() {
		System.out.println("Serving dog topping");
	}

	@Override
	public void mix() {
		System.out.println("Mixing dog topping");
	}

	@Override
	public void dip() {
		System.out.println("Dipping dog topping");

	}
}
