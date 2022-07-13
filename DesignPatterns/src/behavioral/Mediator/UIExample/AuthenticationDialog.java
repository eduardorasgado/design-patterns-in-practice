package behavioral.Mediator.UIExample;

public class AuthenticationDialog implements Mediator, LayoutElement {
	private String title;
	private boolean loginOrRegister;
	
	private Textbox loginUsername, loginPassword;
	private Textbox registerUsername, registerPassword, registedEmail;
	
	private Button ok, cancel;
	
	private Checkbox rememberMe;
	
	@Override
	public void render() {
		System.out.println("[Dialog]");
	}

	@Override
	public void notify(Component sender, String event) {
		if (sender == null && event == "click") {
			
		} else if (sender == null && event == "check") {
			
		}
	}
}
