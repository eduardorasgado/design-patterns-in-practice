package structural.Facade.ComputerSimulatorExample;

import structural.Facade.ComputerSimulatorExample.ComputerSystem.CPU;
import structural.Facade.ComputerSimulatorExample.ComputerSystem.Device;
import structural.Facade.ComputerSimulatorExample.ComputerSystem.Driver;
import structural.Facade.ComputerSimulatorExample.ComputerSystem.HardDrive;
import structural.Facade.ComputerSimulatorExample.ComputerSystem.KeyBoard;
import structural.Facade.ComputerSimulatorExample.ComputerSystem.KeyBoardDriver;
import structural.Facade.ComputerSimulatorExample.ComputerSystem.Mouse;
import structural.Facade.ComputerSimulatorExample.ComputerSystem.MouseDriver;
import structural.Facade.ComputerSimulatorExample.ComputerSystem.OS;
import structural.Facade.ComputerSimulatorExample.ComputerSystem.RamMemory;
import structural.Facade.ComputerSimulatorExample.ComputerSystem.WindowsOS;

/**
 * Facade for the Computer System library
 * @author cheetos
 *
 */
public class WindowsComputer {
	private CPU cpu;
	private HardDrive hardDrive;
	private RamMemory ramMemory;
	
	private Device keyBoard;
	private Device mouse;
	
	private OS os;
	
	public WindowsComputer() {
		preconfigureSystem();
	}
	
	private void preconfigureSystem() {
		System.out.println("------------PRECONFIGURING SYSTEM------------");
		cpu = new CPU();
		hardDrive = new HardDrive();
		ramMemory = new RamMemory();
		
		Driver keyBoardDriver = new KeyBoardDriver();
		Driver mouseDriver = new MouseDriver();
		
		keyBoard = new KeyBoard(keyBoardDriver);
		mouse = new Mouse(mouseDriver);
		System.out.println("------------------------");
	}
	
	private void initializeSystem() {
		System.out.println("------------INITIALIZING SYSTEM------------");
		ramMemory.turnOn();
		hardDrive.turnOn();
		cpu.turnOn();
		
		ramMemory.prepareCache();
		
		hardDrive.readData();
		hardDrive.prepareHeaders();
		hardDrive.shareHeaders(ramMemory);
		
		cpu.prepareLogicGates();
		System.out.println("------------------------");
	}

	public void run() {
		System.out.println("-----------RUNNING COMPUTER OS-------------");
		initializeSystem();
		os = new WindowsOS(cpu, hardDrive, ramMemory);
		os.startSystem();
		
		os.load(keyBoard);
		os.load(mouse);
		
		int i = 0;
		while(os.isListening()) {
			
			os.listen(keyBoard);
			os.listen(mouse);
			
			if(os.isTurnedOff(i)) {
				break;
			}
			i++;
		}
		os.turnOff();
	}
}
