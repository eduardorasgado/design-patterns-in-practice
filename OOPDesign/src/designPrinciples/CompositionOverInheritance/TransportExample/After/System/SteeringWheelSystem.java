package designPrinciples.CompositionOverInheritance.TransportExample.After.System;

import designPrinciples.CompositionOverInheritance.TransportExample.After.RandomBooleanGenerator;

public class SteeringWheelSystem implements DirectionSystem {

	@Override
	public String getDirection() {
		return readWheelAngle();
	}

	private String readWheelAngle() {
		// reading the mechanical feedback from the steering wheel given sensor
		// measurement
		return (RandomBooleanGenerator.getBoolean() ? "Right" : "Left");
	}
}
