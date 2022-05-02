package creational.Factory.RestaurantMenuExample;

public class CheeseTopping implements Topping {

	@Override
	public void prepare() {
		System.out.println("Preparing cheese topping");

	}

	@Override
	public void serve() {
		System.out.println("Serving cheese topping");
	}

	@Override
	public void mix() {
		System.out.println("Mixing cheese topping");
	}

	@Override
	public void dip() {
		System.out.println("Dipping cheese topping");

	}
}
