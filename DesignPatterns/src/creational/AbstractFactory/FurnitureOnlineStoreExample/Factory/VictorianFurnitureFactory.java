package creational.AbstractFactory.FurnitureOnlineStoreExample.Factory;

import creational.AbstractFactory.FurnitureOnlineStoreExample.Model.Chair;
import creational.AbstractFactory.FurnitureOnlineStoreExample.Model.CoffeeTable;
import creational.AbstractFactory.FurnitureOnlineStoreExample.Model.Sofa;
import creational.AbstractFactory.FurnitureOnlineStoreExample.Model.VictorianChair;
import creational.AbstractFactory.FurnitureOnlineStoreExample.Model.VictorianCoffeeTable;
import creational.AbstractFactory.FurnitureOnlineStoreExample.Model.VictorianSofa;

public class VictorianFurnitureFactory implements FurnitureFactory {

	@Override
	public Sofa createSofa() {
		return new VictorianSofa();
	}

	@Override
	public Chair createChair() {
		return new VictorianChair();
	}

	@Override
	public CoffeeTable createCoffeeTable() {
		return new VictorianCoffeeTable();
	}

}
