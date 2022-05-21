package creational.AbstractFactory.FurnitureOnlineStoreExample;

import creational.AbstractFactory.FurnitureOnlineStoreExample.Model.Chair;
import creational.AbstractFactory.FurnitureOnlineStoreExample.Model.CoffeeTable;
import creational.AbstractFactory.FurnitureOnlineStoreExample.Model.Glass;
import creational.AbstractFactory.FurnitureOnlineStoreExample.Model.HandableThing;
import creational.AbstractFactory.FurnitureOnlineStoreExample.Model.Sofa;

public class FurnitureStoreDemo {
	
	public static void main(String[] args) {
		FurnitureStoreApp store = new FurnitureStoreApp();
		
		Chair modernChair = store.buyChair(FurnitureStyle.MODERN);
		CoffeeTable victorianCoffeeTable = store.buyCoffeTable(FurnitureStyle.VICTORIAN);
		Sofa artDecoSofa = store.buySofa(FurnitureStyle.ART_DECO);
		
		modernChair.sitOn();
		
		HandableThing glass = new Glass();
		victorianCoffeeTable.putSomethingIn(glass);
		
		artDecoSofa.relax();
	}
}
