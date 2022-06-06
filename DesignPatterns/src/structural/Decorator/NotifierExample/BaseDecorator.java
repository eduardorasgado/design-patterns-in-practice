package structural.Decorator.NotifierExample;

public class BaseDecorator implements Notifier {
	private Notifier wrappee;
	
	public BaseDecorator(Notifier wrappee) {
		this.wrappee = wrappee;
	}

	@Override
	public void send(String message) {
		wrappee.send(message);
		System.out.println("-----------");
	}
}
