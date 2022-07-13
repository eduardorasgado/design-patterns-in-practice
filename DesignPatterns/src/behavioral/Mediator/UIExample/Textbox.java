package behavioral.Mediator.UIExample;

public class Textbox extends Component implements LayoutElement {

	public Textbox(Mediator dialog) {
		super(dialog);
	}

	@Override
	public void render() {
		System.out.println("[Textbox]");
	}
}
