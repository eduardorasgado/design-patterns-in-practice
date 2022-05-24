package structural.Bridge.ScrollAppExample.After;

public class WithThumbnailListItem extends PresenterListItem {
	
	public WithThumbnailListItem(IViewModel viewModel) {
		super(viewModel);
	}

	@Override
	public void render() {
		System.out.println("-----------------------");
		System.out.println(getViewModel().getTitle());
		System.out.println(getViewModel().getImage());
		System.out.println("-----------------------");
		System.out.println();
	}
}
