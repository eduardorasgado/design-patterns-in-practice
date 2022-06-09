package structural.Facade.ComputerSimulatorExample.ComputerSystem;

public class HardDrive {

	public void turnOn() {
		System.out.println("Turning on hard drive...");	
	}

	public void readData() {
		System.out.println("Hard drive is reading data...");
	}

	public void prepareHeaders() {
		System.out.println("Hard Drive is preparing headers");
	}

	public void shareHeaders(RamMemory ramMemory) {
		System.out.println("Hard drive is sharing headers to " + ramMemory.getClass().getSimpleName());
	}

	public void turnOff() {
		System.out.println("Hard drive is turning off...");		
	}

}
