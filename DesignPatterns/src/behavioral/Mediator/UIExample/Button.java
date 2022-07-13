package behavioral.Mediator.UIExample;

public class Button extends Component implements LayoutElement {

	public Button(String title) {
		super(title);
	}

	@Override
	public void render() {
		System.out.println("[Button]: " + getTitle());
	}
}
