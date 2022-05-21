package creational.AbstractFactory.FurnitureOnlineStoreExample.Model;

public class VictorianCoffeeTable implements CoffeeTable {

	@Override
	public void putSomethingIn(HandableThing thing) {
		System.out.println("Putting a " + thing.getName() + " into a victorian coffee table");
	}

}
