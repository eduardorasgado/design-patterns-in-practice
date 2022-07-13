package behavioral.Mediator.UIExample;

public class Textbox extends Component implements LayoutElement {
	private boolean hidden = true;

	public Textbox(String title) {
		super(title);
	}

	@Override
	public void render() {
		if (!isHidden()) {
			System.out.println("[Textbox]: " + getTitle());
		}
	}

	public boolean isHidden() {
		return hidden;
	}

	public void setHidden(boolean hidden) {
		this.hidden = hidden;
	}
}
