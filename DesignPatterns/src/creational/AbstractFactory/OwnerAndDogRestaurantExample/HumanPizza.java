package creational.AbstractFactory.OwnerAndDogRestaurantExample;

public class HumanPizza implements Pizza {

	@Override
	public void prepare() {
		System.out.println("Preparing human pizza");
	}

	@Override
	public void serve() {
		System.out.println("Serving human pizza");
		
	}

	@Override
	public void slice() {
		System.out.println("Slicing human pizza");
	}

	@Override
	public void eat() {
		System.out.println("Eating human pizza");
	}
}
