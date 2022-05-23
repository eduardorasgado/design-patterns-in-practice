package designPrinciples.CompositionOverInheritance.TransportExample.After.System;

public class CombustionEngineSystem implements BaseSystem {

	@Override
	public void start() {
		System.out.println("Pushing fuel to start engine");
	}

	@Override
	public void stop() {
		System.out.println("Closing valve to stop engine");
	}

	@Override
	public void updateSpeed(int speed) {
		System.out.println("Pushing a bit more fuel and applying more revolutions to update speed to: " + speed);
	}

}
