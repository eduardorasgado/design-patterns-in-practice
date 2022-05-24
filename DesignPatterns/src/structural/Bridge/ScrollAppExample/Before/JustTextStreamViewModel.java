package structural.Bridge.ScrollAppExample.Before;

public class JustTextStreamViewModel extends StreamViewModel{
	private boolean isTrending;

	public JustTextStreamViewModel(String title, int viewersCount, boolean isTrending) {
		super(title, viewersCount);
		this.isTrending = isTrending;
	}

	public boolean isTrending() {
		return isTrending;
	}
	
	public void render() {
		System.out.println("-----------------");
		System.out.println(getTitle() + (isTrending() ? "(TRENDING)" : ""));
		System.out.println("-----------------");
		System.out.println();
	}
}
