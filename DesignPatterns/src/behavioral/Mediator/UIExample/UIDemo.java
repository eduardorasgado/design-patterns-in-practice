package behavioral.Mediator.UIExample;

public class UIDemo {

	public static void main(String[] args) {
		Button okButton = new Button("Ok");
		Button cancelButton = new Button("Cancel");

		Textbox loginUsernameTextbox = new Textbox("your username");
		Textbox loginPasswordTextbox = new Textbox("your Password");
		loginUsernameTextbox.setHidden(false);
		loginPasswordTextbox.setHidden(false);

		Textbox registerUsernameTextbox = new Textbox("new username");
		Textbox registerPasswordTextbox = new Textbox("new password");
		Textbox registerEmailTextbox = new Textbox("new email address");

		Checkbox loginOrRegisterCheckbox = new Checkbox("Login/Register");
		Checkbox rememberMeCheckbox = new Checkbox("Remember me");

		DialogBuilder dialogBuilder = new DialogBuilder();
		AuthenticationDialog dialog = dialogBuilder.setButtons(okButton, cancelButton)
				.setLoginTextboxes(loginUsernameTextbox, loginPasswordTextbox)
				.setRegisterTextboxes(registerUsernameTextbox, registerPasswordTextbox, registerEmailTextbox)
				.setCheckboxes(loginOrRegisterCheckbox, rememberMeCheckbox).build();

		okButton.setDialog(dialog);
		cancelButton.setDialog(dialog);
		loginUsernameTextbox.setDialog(dialog);
		loginPasswordTextbox.setDialog(dialog);
		registerUsernameTextbox.setDialog(dialog);
		registerEmailTextbox.setDialog(dialog);
		registerPasswordTextbox.setDialog(dialog);
		loginOrRegisterCheckbox.setDialog(dialog);
		rememberMeCheckbox.setDialog(dialog);

		LayOut layOut = new LayOut();

		layOut.appendElement(loginOrRegisterCheckbox);
		layOut.appendElement(loginUsernameTextbox);
		layOut.appendElement(loginPasswordTextbox);
		layOut.appendElement(registerUsernameTextbox);
		layOut.appendElement(registerPasswordTextbox);
		layOut.appendElement(registerEmailTextbox);
		layOut.appendElement(rememberMeCheckbox);
		layOut.appendElement(okButton);
		layOut.appendElement(cancelButton);
		layOut.appendElement(dialog);

		layOut.render();
	}
}
