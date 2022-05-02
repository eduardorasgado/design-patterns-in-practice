package creational.Factory.RestaurantMenuExample;

public class MargheritaPizza implements Pizza {

	@Override
	public void prepare() {
		System.out.println("Preparing a margherita pizza");
	}

	@Override
	public void serve() {
		System.out.println("serving a margherita pizza");
		
	}

	@Override
	public void slice() {
		System.out.println("Slicing a margherita pizza");
	}

	@Override
	public void eat() {
		System.out.println("Eating a margherita pizza");
	}

}
