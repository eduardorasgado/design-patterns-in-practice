package designPrinciples.CompositionOverInheritance.TransportExample.After.System;

public class AIDirectionSystem implements DirectionSystem {

	private LocalizationSystem localizationSystem;

	public AIDirectionSystem(LocalizationSystem localizationSystem) {
		this.localizationSystem = localizationSystem;
	}

	@Override
	public String getDirection() {
		return calculateDirection();
	}

	private String calculateDirection() {
		// the algorithm to calculate direction need the current position
		String nextPosition = localizationSystem.getForecastedPosition();

		// doing something with next position in order to get the direction to go next
		return nextPosition.equals("point C") ? "Right" : "Left";
	}
}
