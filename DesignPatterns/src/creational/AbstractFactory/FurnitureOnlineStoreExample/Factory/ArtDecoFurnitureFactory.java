package creational.AbstractFactory.FurnitureOnlineStoreExample.Factory;

import creational.AbstractFactory.FurnitureOnlineStoreExample.Model.ArtDecoChair;
import creational.AbstractFactory.FurnitureOnlineStoreExample.Model.ArtDecoCoffeeTable;
import creational.AbstractFactory.FurnitureOnlineStoreExample.Model.ArtDecoSofa;
import creational.AbstractFactory.FurnitureOnlineStoreExample.Model.Chair;
import creational.AbstractFactory.FurnitureOnlineStoreExample.Model.CoffeeTable;
import creational.AbstractFactory.FurnitureOnlineStoreExample.Model.Sofa;

public class ArtDecoFurnitureFactory implements FurnitureFactory {

	@Override
	public Sofa createSofa() {
		return new ArtDecoSofa();
	}

	@Override
	public Chair createChair() {
		return new ArtDecoChair();
	}

	@Override
	public CoffeeTable createCoffeeTable() {
		return new ArtDecoCoffeeTable();
	}

}
