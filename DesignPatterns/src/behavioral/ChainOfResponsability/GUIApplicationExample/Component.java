package behavioral.ChainOfResponsability.GUIApplicationExample;

public abstract class Component implements ComponentWithContextualHelp {
	private Component container;
	private String tooltipText;
	private String theme;
	
	public Component() {
	}
	
	public Component(String tooltipText) {
		this.tooltipText = tooltipText;
	}
	
	@Override
	public void showHelp() {
		if(tooltipText != null) {
			System.out.println("[tooltip help]: " + tooltipText);
		} else {
			if(container != null) {
				container.showHelp();
			}
		}
	}
	
	protected void setContainer(Component container) {
		if(container != null) {
			this.container = container;
		}
	}
	
	public abstract void changeTheme(String theme);
	
	public void setTheme(String theme) {
		this.theme = theme;
	}

	public String getTheme() {
		return theme;
	}
}
