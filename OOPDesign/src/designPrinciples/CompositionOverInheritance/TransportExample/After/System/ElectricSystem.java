package designPrinciples.CompositionOverInheritance.TransportExample.After.System;

public class ElectricSystem implements BaseSystem {

	@Override
	public void start() {
		System.out.println("Applying energy to main board to start engine");
	}

	@Override
	public void stop() {
		System.out.println("turn off safely every system and cuttting energy");
	}

	@Override
	public void updateSpeed(int speed) {
		System.out.println("Applying formula to decrease or increse amount of energy to move at : " + speed);
	}

}
