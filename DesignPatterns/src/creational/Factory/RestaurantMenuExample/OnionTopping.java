package creational.Factory.RestaurantMenuExample;

public class OnionTopping implements Topping {
	@Override
	public void prepare() {
		System.out.println("Preparing onion topping");

	}

	@Override
	public void serve() {
		System.out.println("Serving onion topping");
	}

	@Override
	public void mix() {
		System.out.println("Mixing onion topping");
	}

	@Override
	public void dip() {
		System.out.println("Dipping onion topping");

	}
}
