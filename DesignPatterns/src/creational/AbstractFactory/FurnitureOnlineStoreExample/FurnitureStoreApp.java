package creational.AbstractFactory.FurnitureOnlineStoreExample;

import java.util.HashMap;
import java.util.Map;

import creational.AbstractFactory.FurnitureOnlineStoreExample.Factory.ArtDecoFurnitureFactory;
import creational.AbstractFactory.FurnitureOnlineStoreExample.Factory.FurnitureFactory;
import creational.AbstractFactory.FurnitureOnlineStoreExample.Factory.ModernFurnitureFactory;
import creational.AbstractFactory.FurnitureOnlineStoreExample.Factory.VictorianFurnitureFactory;
import creational.AbstractFactory.FurnitureOnlineStoreExample.Model.Chair;
import creational.AbstractFactory.FurnitureOnlineStoreExample.Model.CoffeeTable;
import creational.AbstractFactory.FurnitureOnlineStoreExample.Model.Sofa;

public class FurnitureStoreApp {
	private final Map<FurnitureStyle, FurnitureFactory> factoryMap;
	
	public FurnitureStoreApp() {
		factoryMap = new HashMap<>();
		
		factoryMap.put(FurnitureStyle.ART_DECO, new ArtDecoFurnitureFactory());
		factoryMap.put(FurnitureStyle.MODERN, new ModernFurnitureFactory());
		factoryMap.put(FurnitureStyle.VICTORIAN, new VictorianFurnitureFactory());
	}
	
	public Chair buyChair(FurnitureStyle style) {
		return getFactory(style).createChair();
	}
	
	public Sofa buySofa(FurnitureStyle style) {
		return getFactory(style).createSofa();
	}
	
	public CoffeeTable buyCoffeTable(FurnitureStyle style) {
		return getFactory(style).createCoffeeTable();
	}
	
	private FurnitureFactory getFactory(FurnitureStyle style) {
		return factoryMap.get(style);
	}
}
