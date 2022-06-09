package structural.Facade.ComputerSimulatorExample.ComputerSystem;

public interface OS {

	void startSystem();

	void load(Device keyBoard);

	boolean isListening();

	void listen(Device keyBoard);
	
	boolean isTurnedOff(int limit);

	void turnOff();

}
