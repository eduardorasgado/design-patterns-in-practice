package behavioral.Mediator.UIExample;

public abstract class Component {
	protected Mediator dialog;
	
	public Component(Mediator dialog) {
		this.dialog = dialog;
	}

	public void click() {
		dialog.notify(null, null);
	}
	
	public void keyPress() {
		dialog.notify(null, null);
	}
}
