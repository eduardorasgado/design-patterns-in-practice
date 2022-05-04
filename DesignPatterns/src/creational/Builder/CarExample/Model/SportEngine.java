package creational.Builder.CarExample.Model;

public class SportEngine extends Engine {

	@Override
	protected void turnOn() {
		System.out.println("Turning on a sport engine");
	}

	@Override
	protected void turnOff() {
		System.out.println("Turning off a sport engine");
	}
}
