package creational.AbstractFactory.FurnitureOnlineStoreExample.Model;

public class ModernCoffeeTable implements CoffeeTable {

	@Override
	public void putSomethingIn(HandableThing thing) {
		System.out.println("Putting something into a modern coffee table");
	}

}
