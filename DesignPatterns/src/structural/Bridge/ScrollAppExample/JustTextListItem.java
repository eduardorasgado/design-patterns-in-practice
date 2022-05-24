package structural.Bridge.ScrollAppExample;

public class JustTextListItem extends PresenterListItem {

	public JustTextListItem(IViewModel viewModel) {
		super(viewModel);
	}

	@Override
	public void render() {
		System.out.println("-----------------------");
		System.out.println(getViewModel().getTitle());
		System.out.println("-----------------------");
		System.out.println();
	}
}
