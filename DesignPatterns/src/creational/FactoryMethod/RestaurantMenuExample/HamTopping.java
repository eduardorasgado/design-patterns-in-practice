package creational.FactoryMethod.RestaurantMenuExample;

public class HamTopping implements Topping {

	@Override
	public void prepare() {
		System.out.println("Preparing ham topping");

	}

	@Override
	public void serve() {
		System.out.println("Serving ham topping");
	}

	@Override
	public void mix() {
		System.out.println("Mixing ham topping");
	}

	@Override
	public void dip() {
		System.out.println("Dipping ham topping");

	}
}
