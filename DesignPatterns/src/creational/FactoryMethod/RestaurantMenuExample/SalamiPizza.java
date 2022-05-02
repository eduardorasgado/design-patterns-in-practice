package creational.FactoryMethod.RestaurantMenuExample;

public class SalamiPizza implements Pizza {

	@Override
	public void prepare() {
		System.out.println("Preparing salami pizza");
	}

	@Override
	public void serve() {
		System.out.println("Serving salami pizza");
		
	}

	@Override
	public void slice() {
		System.out.println("Slicing salami pizza");
	}

	@Override
	public void eat() {
		System.out.println("Eating salami pizza");
	}
}
