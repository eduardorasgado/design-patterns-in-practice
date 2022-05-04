package creational.Builder.CarExample;

import creational.Builder.CarExample.Model.ModelTripComputer;
import creational.Builder.CarExample.Model.PDABasedGPS;
import creational.Builder.CarExample.Model.SatNavGPS;
import creational.Builder.CarExample.Model.SportEngine;
import creational.Builder.CarExample.Model.StandardEngine;
import creational.Builder.CarExample.Model.UniversalMultisystemTripComputer;

public class AutomobileBuildDirector {
	public static void makeSUVCar(Builder builder) {
		builder.setSeats(6);
		builder.setEngine(new StandardEngine());
		builder.setTripComputer(new ModelTripComputer());
		builder.setGPS(new PDABasedGPS());
	}
	
	public static void makeSportsCar(Builder builder ) {
		builder.setSeats(2);
		builder.setEngine(new SportEngine());
		builder.setTripComputer(new UniversalMultisystemTripComputer());
		builder.setGPS(new SatNavGPS());
	}
}
