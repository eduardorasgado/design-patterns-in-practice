package behavioral.Mediator.UIExample;

public class DialogBuilder {

	private Checkbox loginOrRegister;

	private Textbox loginUsername, loginPassword;
	private Textbox registerUsername, registerPassword, registerEmail;

	private Button ok, cancel;

	private Checkbox rememberMe;

	public DialogBuilder setButtons(Button okButton, Button cancelButton) {
		ok = okButton;
		cancel = cancelButton;

		return this;
	}

	public DialogBuilder setLoginTextboxes(Textbox loginUsernameTextbox, Textbox loginPasswordTextbox) {
		loginUsername = loginUsernameTextbox;
		loginPassword = loginPasswordTextbox;

		return this;
	}

	public DialogBuilder setRegisterTextboxes(Textbox registerUsernameTextbox, Textbox registerPasswordTextbox,
			Textbox registerEmailTextbox) {
		registerUsername = registerUsernameTextbox;
		registerPassword = registerPasswordTextbox;
		registerEmail = registerEmailTextbox;

		return this;
	}

	public DialogBuilder setCheckboxes(Checkbox loginOrRegisterCheckbox, Checkbox rememberMeCheckbox) {
		loginOrRegister = loginOrRegisterCheckbox;
		rememberMe = rememberMeCheckbox;

		return this;
	}

	public AuthenticationDialog build() {
		return new AuthenticationDialog("", loginOrRegister, loginUsername, loginPassword, registerUsername,
				registerPassword, registerEmail, ok, cancel, rememberMe);
	}
}
