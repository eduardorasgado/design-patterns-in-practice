package structural.Decorator.NotifierExample;

public class NotifierDemo {
	public static void main(String[] args) {
		
		Notifier notifier = new Notifier();
		SMSNotification smsSender = new SMSNotification(notifier);
		FacebookNotification fbSender = new FacebookNotification(smsSender);
		SlackNotification slackSender = new SlackNotification(fbSender);
		
		Application app = new Application(slackSender);
		app.send("Alert!");
	}
}
