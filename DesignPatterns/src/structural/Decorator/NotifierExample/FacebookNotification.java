package structural.Decorator.NotifierExample;

public class FacebookNotification extends BaseDecorator {

	public FacebookNotification(Notifier wrappee) {
		super(wrappee);
	}

	@Override
	public void send(String message) {
		super.send(message);
		sendFacebookMessage(message);
	}
	
	private void sendFacebookMessage(String message) {
		System.out.println("Loading the Facebook API");
		System.out.println("Sending FB message...");
	}
}
