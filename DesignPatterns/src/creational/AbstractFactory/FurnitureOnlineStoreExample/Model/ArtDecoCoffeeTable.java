package creational.AbstractFactory.FurnitureOnlineStoreExample.Model;

public class ArtDecoCoffeeTable implements CoffeeTable {

	@Override
	public void putSomethingIn(HandableThing thing) {
		System.out.println("Putting something into an art deco coffee table");
	}
}
