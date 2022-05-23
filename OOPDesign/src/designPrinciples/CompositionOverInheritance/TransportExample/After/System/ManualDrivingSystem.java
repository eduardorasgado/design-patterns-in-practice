package designPrinciples.CompositionOverInheritance.TransportExample.After.System;

public class ManualDrivingSystem implements DrivingSystem {
	private DirectionSystem directionSystem;

	public ManualDrivingSystem(DirectionSystem directionSystem) {
		this.directionSystem = directionSystem;
	}

	@Override
	public void move() {
		System.out.println("user is moving to " + directionSystem.getDirection());
	}

	@Override
	public void stop() {
		System.out.println("user pushed break");
	}

}
