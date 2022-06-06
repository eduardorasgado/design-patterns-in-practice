package structural.Decorator.NotifierExample;

public class Application {
	private Notifier notifier;
	
	public Application(Notifier notifier) {
		this.notifier = notifier;
	}

	public void send(String message) {
		notifier.send(message);
	}
	
}
