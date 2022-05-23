package designPrinciples.CompositionOverInheritance.TransportExample.After.System;

import designPrinciples.CompositionOverInheritance.TransportExample.After.RandomBooleanGenerator;

// sensor fusion is a mixture of cameras, lidar, sonar, gps
public class SensorFusionLocalizacionSystem implements LocalizationSystem {

	@Override
	public String getCurrentPosition() {
		String currentPosition = RandomBooleanGenerator.getBoolean() ? "point A" : "point B";
		System.out.println("current position : " + currentPosition);
		return currentPosition;
	}

	@Override
	public String getForecastedPosition() {
		String currentPosition = getCurrentPosition();
		
		// doing something with current position in order to return next point
		String forecastedPosition = currentPosition.equals("point A") ? "point C" : "point D";
		System.out.println("forecasted position : " + forecastedPosition);
		return forecastedPosition;
	}
}
