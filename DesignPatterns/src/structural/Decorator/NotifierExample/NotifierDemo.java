package structural.Decorator.NotifierExample;

public class NotifierDemo {
	public static void main(String[] args) {
		
		Notifier notifier = new SMTPNotifier();
		
		Notifier smsSender = new SMSNotification(notifier);
		Notifier fbSender = new FacebookNotification(smsSender);
		Notifier slackSender = new SlackNotification(fbSender);
		
		Application app = new Application(slackSender);
		app.send("Alert!");
	}
}
