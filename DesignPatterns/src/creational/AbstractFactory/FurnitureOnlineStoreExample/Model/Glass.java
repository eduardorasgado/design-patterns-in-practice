package creational.AbstractFactory.FurnitureOnlineStoreExample.Model;

public class Glass implements HandableThing {
	private final String name;
	
	public Glass() {
		name = "Glass";
	}
	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public void take() {
		System.out.println("taking a glass");
	}

	@Override
	public void leave() {
		System.out.println("leaving a glass");
	}
}
