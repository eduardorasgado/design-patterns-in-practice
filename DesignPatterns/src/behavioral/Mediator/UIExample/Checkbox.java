package behavioral.Mediator.UIExample;

public class Checkbox extends Component implements LayoutElement {
	private boolean checked = false;

	public Checkbox(String title) {
		super(title);
	}

	@Override
	public void render() {
		System.out.println("[Checkbox]: " + getTitle());
	}

	public void check() {
		checked = !checked;
		dialog.notify(this, "check");
	}

	public boolean isChecked() {
		return checked;
	}
}
