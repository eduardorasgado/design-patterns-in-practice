package behavioral.Mediator.UIExample;

public abstract class Component {
	protected Mediator dialog;
	private String title;

	public Component(String title) {
		this.title = title;
	}

	public void click() {
		dialog.notify(this, "click");
	}

	public void keyPress() {
		dialog.notify(this, "keypress");
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setDialog(Mediator dialog) {
		this.dialog = dialog;
	}
}
