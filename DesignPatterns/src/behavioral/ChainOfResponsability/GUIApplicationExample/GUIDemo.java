package behavioral.ChainOfResponsability.GUIApplicationExample;

import java.net.Authenticator.RequestorType;

public class GUIDemo {
	public static void main(String[] args) {
		Container dialog = new Dialog();
		// never appeas in button show help call because it is not part of container chain
		// of button
		Container panel = new Panel("panel 1 modal help here!");
		Container panel2 = new Panel("panel 2 modal help here!");
		Component button = new Button();
		
		dialog.addChild(panel);
		
		panel2.addChild(button);
		dialog.addChild(panel2);
		
		// will stop until it found help text
		button.showHelp();
		System.out.println();
		dialog.changeTheme("blue");
		
	}
}
