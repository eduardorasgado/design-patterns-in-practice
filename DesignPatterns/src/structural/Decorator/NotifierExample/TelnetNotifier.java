package structural.Decorator.NotifierExample;

public class TelnetNotifier implements Notifier{
	
	@Override
	public void send(String message) {
		System.out.println("Connecting to the console...");
		System.out.println("Sending message via telnet...");
	}
}
