package designPrinciples.CompositionOverInheritance.TransportExample.After.System;

public class AutopilotDrivingSystem implements DrivingSystem {
	private DirectionSystem directionSystem;

	public AutopilotDrivingSystem(DirectionSystem directionSystem) {
		super();
		this.directionSystem = directionSystem;
	}

	@Override
	public void move() {
		System.out.println("Turning direction: " + directionSystem.getDirection());
	}

	@Override
	public void stop() {
		System.out.println("Stopping autopilot system");
	}
}
