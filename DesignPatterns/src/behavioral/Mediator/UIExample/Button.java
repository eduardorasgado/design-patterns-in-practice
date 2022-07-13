package behavioral.Mediator.UIExample;

public class Button extends Component implements LayoutElement {

	public Button(Mediator dialog) {
		super(dialog);
	}

	@Override
	public void render() {
		System.out.println("[Button]");
	}
}
