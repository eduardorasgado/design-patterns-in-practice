package designPrinciples.CompositionOverInheritance.TransportExample.After;

import designPrinciples.CompositionOverInheritance.TransportExample.After.System.BaseSystem;
import designPrinciples.CompositionOverInheritance.TransportExample.After.System.DrivingSystem;

public class Truck implements Transport {
	private boolean hasTrailerAttached;

	private BaseSystem baseSystem;
	private DrivingSystem drivingSystem;

	public Truck(BaseSystem baseSystem, DrivingSystem drivingSystem) {
		this.baseSystem = baseSystem;
		this.drivingSystem = drivingSystem;
	}

	@Override
	public void turnOn() throws InterruptedException {
		baseSystem.start();
		int i = 0;
		
		while(i < 10) {
			Thread.sleep(200);
			drivingSystem.move();
			i++;
		}
	}

	@Override
	public void turnOff() {
		baseSystem.stop();
	}
}
