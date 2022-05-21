package creational.AbstractFactory.FurnitureOnlineStoreExample.Factory;

import creational.AbstractFactory.FurnitureOnlineStoreExample.Model.Chair;
import creational.AbstractFactory.FurnitureOnlineStoreExample.Model.CoffeeTable;
import creational.AbstractFactory.FurnitureOnlineStoreExample.Model.ModernChair;
import creational.AbstractFactory.FurnitureOnlineStoreExample.Model.ModernCoffeeTable;
import creational.AbstractFactory.FurnitureOnlineStoreExample.Model.ModernSofa;
import creational.AbstractFactory.FurnitureOnlineStoreExample.Model.Sofa;

public class ModernFurnitureFactory implements FurnitureFactory {

	@Override
	public Sofa createSofa() {
		return new ModernSofa();
	}

	@Override
	public Chair createChair() {
		return new ModernChair();
	}

	@Override
	public CoffeeTable createCoffeeTable() {
		return new ModernCoffeeTable();
	}

}
