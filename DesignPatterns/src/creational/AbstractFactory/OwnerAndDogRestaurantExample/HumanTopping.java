package creational.AbstractFactory.OwnerAndDogRestaurantExample;

public class HumanTopping implements Topping {

	@Override
	public void prepare() {
		System.out.println("Preparing human topping");

	}

	@Override
	public void serve() {
		System.out.println("Serving human topping");
	}

	@Override
	public void mix() {
		System.out.println("Mixing human topping");
	}

	@Override
	public void dip() {
		System.out.println("Dipping human topping");

	}
}
