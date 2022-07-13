package behavioral.Mediator.UIExample;

public class Checkbox extends Component implements LayoutElement {

	public Checkbox(Mediator dialog) {
		super(dialog);
	}

	@Override
	public void render() {
		System.out.println("[Checkbox]");
	}
	
	public void check() {
		dialog.notify(null, null);
	}
}
