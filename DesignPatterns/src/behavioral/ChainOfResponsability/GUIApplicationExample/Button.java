package behavioral.ChainOfResponsability.GUIApplicationExample;

public class Button extends Component {
	private boolean wasClicked;

	public Button() {
	}
	
	public Button(String tooltipText) {
		super(tooltipText);
	}



	@Override
	public void changeTheme(String theme) {
		super.setTheme(theme);
		System.out.println("new theme for button: " + getTheme());
	}
}
