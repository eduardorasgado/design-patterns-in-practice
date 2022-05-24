package structural.Bridge.ScrollAppExample.Before;

public class StreamViewModel extends ViewModel{
	private int viewersCount;

	public StreamViewModel(String title, int viewersCount) {
		super(title);
		this.viewersCount = viewersCount;
	}

	public int getViewersCount() {
		return viewersCount;
	}
}
