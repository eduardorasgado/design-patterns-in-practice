package behavioral.Mediator.UIExample;

public class AuthenticationDialog implements Mediator, LayoutElement {
	private String title;
	private Checkbox loginOrRegister;

	private Textbox loginUsername, loginPassword;
	private Textbox registerUsername, registerPassword, registerEmail;

	private Button ok, cancel;

	private Checkbox rememberMe;

	public AuthenticationDialog(String title, Checkbox loginOrRegister, Textbox loginUsername, Textbox loginPassword,
			Textbox registerUsername, Textbox registerPassword, Textbox registerEmail, Button ok, Button cancel,
			Checkbox rememberMe) {
		this.title = title;
		this.loginOrRegister = loginOrRegister;
		this.loginUsername = loginUsername;
		this.loginPassword = loginPassword;
		this.registerUsername = registerUsername;
		this.registerPassword = registerPassword;
		this.registerEmail = registerEmail;
		this.ok = ok;
		this.cancel = cancel;
		this.rememberMe = rememberMe;
	}

	@Override
	public void render() {
		System.out.println("[Dialog]: " + title);
	}

	@Override
	public void notify(Component sender, String event) {
		if (sender.equals(ok) && event == "click") {
			if (loginOrRegister.isChecked()) {
				boolean userFound = false;
				// look for user data with credentials
				// compared to login textbox data
				if (!userFound) {
					System.out.println("LOG: Wrong credentials");
				} else {
					System.out.println("[User logged in]");
				}
			} else {
				boolean userFound = false;
				// look for user data in db
				// compared to register textbox data
				// and change userFound flag if need it
				if (userFound) {
					System.out.println("LOG: Credentials already exists");
				} else {
					// save user data
					System.out.println("[New user was successfully created]");
				}
			}
		} else if (sender.equals(loginOrRegister) && event == "check") {
			if (loginOrRegister.isChecked()) {
				title = "Login";
				loginPassword.setHidden(false);
				loginUsername.setHidden(false);

				registerEmail.setHidden(true);
				registerPassword.setHidden(true);
				registerUsername.setHidden(true);
			} else {
				title = "Register";
				loginPassword.setHidden(true);
				loginUsername.setHidden(true);

				registerEmail.setHidden(false);
				registerPassword.setHidden(false);
				registerUsername.setHidden(false);
			}
		}
	}
}
