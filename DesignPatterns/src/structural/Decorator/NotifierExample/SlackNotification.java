package structural.Decorator.NotifierExample;

public class SlackNotification extends BaseDecorator {

	public SlackNotification(Notifier wrappee) {
		super(wrappee);
	}

	@Override
	public void send(String message) {
		super.send(message);
		sendSlackMessage(message);
	}
	
	private void sendSlackMessage(String message) {
		System.out.println("Loading the Slack API...");
		System.out.println("Sending the slack message...");
	}
}
