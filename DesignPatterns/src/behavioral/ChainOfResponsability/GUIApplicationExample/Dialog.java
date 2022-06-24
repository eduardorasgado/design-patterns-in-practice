package behavioral.ChainOfResponsability.GUIApplicationExample;

public class Dialog extends Container {
	private String wikiPage;
	
	public Dialog() {
		// TODO Auto-generated constructor stub
	}

	public Dialog(String wikiPage) {
		this.wikiPage = wikiPage;
	}

	@Override
	public void showHelp() {
		if(wikiPage != null) {
			System.out.println("[wiki page]: " + wikiPage);
		} else {
			super.showHelp();
		}
	}

	@Override
	public void changeTheme(String theme) {
		setTheme(theme);
		System.out.println("new theme for dialog: " + getTheme());
		super.changeTheme(theme);
	}
}
