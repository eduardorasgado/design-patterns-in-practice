package structural.Bridge.ScrollAppExample.After;

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
