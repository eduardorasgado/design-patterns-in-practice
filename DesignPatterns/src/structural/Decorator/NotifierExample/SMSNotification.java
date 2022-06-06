package structural.Decorator.NotifierExample;

public class SMSNotification extends BaseDecorator {
	
	public SMSNotification(Notifier wrappee) {
		super(wrappee);
	}

	@Override
	public void send(String message) {
		super.send(message);		
		sendSMS(message);
	}
	
	private void sendSMS(String message) {
		System.out.println("Procesando mensaje y enviando mensaje via SMS");
	}
}
