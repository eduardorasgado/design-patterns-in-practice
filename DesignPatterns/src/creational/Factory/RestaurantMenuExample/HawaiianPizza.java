package creational.Factory.RestaurantMenuExample;

public class HawaiianPizza implements Pizza {

	@Override
	public void prepare() {
		System.out.println("Preparing hawaiian pizza");
	}

	@Override
	public void serve() {
		System.out.println("Serving hawaiian pizza");
		
	}

	@Override
	public void slice() {
		System.out.println("Slicing hawaiian pizza");
	}

	@Override
	public void eat() {
		System.out.println("Eating hawaiian pizza");
	}
}
