package structural.Bridge.ScrollAppExample;

public abstract class PresenterListItem {
	private IViewModel viewModel;
	
	public PresenterListItem(IViewModel viewModel) {
		this.viewModel = viewModel;
	}
	protected abstract void render();
	
	protected IViewModel getViewModel() {
		return viewModel;
	}
}
