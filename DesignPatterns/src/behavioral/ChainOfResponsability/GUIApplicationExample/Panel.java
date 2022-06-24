package behavioral.ChainOfResponsability.GUIApplicationExample;

public class Panel extends Container {
	private String modalHelpText;
	
	public Panel() {
	}
	
	public Panel(String modalHelpText) {
		this.modalHelpText = modalHelpText;
	}

	@Override
	public void showHelp() {
		if(modalHelpText != null) {
			System.out.println("[modal help]: " + modalHelpText);
		} else {
			super.showHelp();
		}
	}

	@Override
	public void changeTheme(String theme) {
		setTheme(theme);
		System.out.println("new theme for panel: " + getTheme());
		super.changeTheme(theme);
	}
}
