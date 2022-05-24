package structural.Bridge.ScrollAppExample.Before;

public class VideoViewModel extends ViewModel {
	private int lengthInSecs;

	public VideoViewModel(String title, int lengthInSecs) {
		super(title);
		this.lengthInSecs = lengthInSecs;
	}

	public int getLengthInSecs() {
		return lengthInSecs;
	}
}
