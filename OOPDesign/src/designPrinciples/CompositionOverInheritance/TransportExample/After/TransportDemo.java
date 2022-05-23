package designPrinciples.CompositionOverInheritance.TransportExample.After;

import designPrinciples.CompositionOverInheritance.TransportExample.After.System.AIDirectionSystem;
import designPrinciples.CompositionOverInheritance.TransportExample.After.System.AutopilotDrivingSystem;
import designPrinciples.CompositionOverInheritance.TransportExample.After.System.BaseSystem;
import designPrinciples.CompositionOverInheritance.TransportExample.After.System.CombustionEngineSystem;
import designPrinciples.CompositionOverInheritance.TransportExample.After.System.DirectionSystem;
import designPrinciples.CompositionOverInheritance.TransportExample.After.System.DrivingSystem;
import designPrinciples.CompositionOverInheritance.TransportExample.After.System.ElectricSystem;
import designPrinciples.CompositionOverInheritance.TransportExample.After.System.LocalizationSystem;
import designPrinciples.CompositionOverInheritance.TransportExample.After.System.ManualDrivingSystem;
import designPrinciples.CompositionOverInheritance.TransportExample.After.System.SensorFusionLocalizacionSystem;
import designPrinciples.CompositionOverInheritance.TransportExample.After.System.SteeringWheelSystem;

public class TransportDemo {
	public static void main(String[] args) throws InterruptedException {
		BaseSystem teslaCarBaseSystem = new ElectricSystem();
		LocalizationSystem teslaCarLocalizationSystem = new SensorFusionLocalizacionSystem();
		DirectionSystem teslaCarDirectionSystem = new AIDirectionSystem(teslaCarLocalizationSystem);
		DrivingSystem teslaCarDrivingSystem = new AutopilotDrivingSystem(teslaCarDirectionSystem);

		Transport teslaCar = new Car(teslaCarBaseSystem, teslaCarDrivingSystem);

		System.out.println("---------Driving a tesla car--------------");
		teslaCar.turnOn();
		teslaCar.turnOff();
		
		BaseSystem classicTruckBaseSystem = new CombustionEngineSystem();
		DirectionSystem classicTruckDirectionSystem = new SteeringWheelSystem();
		DrivingSystem classicTruckDrivingSystem = new ManualDrivingSystem(classicTruckDirectionSystem);
		
		Transport classicTruck = new Truck(classicTruckBaseSystem, classicTruckDrivingSystem);
		
		System.out.println("---------Driving a classic truck--------------");
		classicTruck.turnOn();
		classicTruck.turnOff();
	}
}
