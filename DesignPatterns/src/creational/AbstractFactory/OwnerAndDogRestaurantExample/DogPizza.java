package creational.AbstractFactory.OwnerAndDogRestaurantExample;

public class DogPizza implements Pizza {

	@Override
	public void prepare() {
		System.out.println("Preparing dog pizza");
	}

	@Override
	public void serve() {
		System.out.println("Serving dog pizza");
		
	}

	@Override
	public void slice() {
		System.out.println("Slicing dog pizza");
	}

	@Override
	public void eat() {
		System.out.println("Eating dog pizza");
	}
}
