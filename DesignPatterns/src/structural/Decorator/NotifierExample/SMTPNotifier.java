package structural.Decorator.NotifierExample;

public class SMTPNotifier implements Notifier{
	
	@Override
	public void send(String message) {
		System.out.println("message send via email");
	}
}
