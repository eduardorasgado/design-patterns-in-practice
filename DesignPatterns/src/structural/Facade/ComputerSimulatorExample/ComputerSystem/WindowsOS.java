package structural.Facade.ComputerSimulatorExample.ComputerSystem;

public class WindowsOS implements OS {
	private CPU cpu;
	private HardDrive hardDrive;
	private RamMemory ramMemory;

	public WindowsOS(CPU cpu, HardDrive hardDrive, RamMemory ramMemory) {
		super();
		this.cpu = cpu;
		this.hardDrive = hardDrive;
		this.ramMemory = ramMemory;
	}

	@Override
	public void startSystem() {
		System.out.println("Windows is starting...");
	}

	@Override
	public void load(Device device) {
		System.out.println("windows is loading " + device.getClass().getSimpleName());
	}

	@Override
	public boolean isListening() {
		System.out.println("windows keep listening...");
		return true;
	}

	@Override
	public void listen(Device device) {
		System.out.println("windows listens to " + device.getClass().getSimpleName());
	}

	@Override
	public boolean isTurnedOff(int limit) {
		if(limit > 10) {
			return true;
		}
		return false;
	}

	@Override
	public void turnOff() {
		System.out.println("os is turning off...");
		cpu.turnOff();
		hardDrive.turnOff();
		ramMemory.turnOff();
	}
}
