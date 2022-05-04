package creational.Builder.CarExample.Model;

public class StandardEngine extends Engine {

	@Override
	protected void turnOn() {
		System.out.println("Turning on a standard engine");
	}

	@Override
	protected void turnOff() {
		System.out.println("Turning off a standard engine");	
	}
	
}
