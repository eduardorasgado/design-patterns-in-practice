package creational.AbstractFactory.FurnitureOnlineStoreExample.Factory;

import creational.AbstractFactory.FurnitureOnlineStoreExample.Model.Chair;
import creational.AbstractFactory.FurnitureOnlineStoreExample.Model.CoffeeTable;
import creational.AbstractFactory.FurnitureOnlineStoreExample.Model.Sofa;

public interface FurnitureFactory {
	Sofa createSofa();
	Chair createChair();
	CoffeeTable createCoffeeTable();
}
