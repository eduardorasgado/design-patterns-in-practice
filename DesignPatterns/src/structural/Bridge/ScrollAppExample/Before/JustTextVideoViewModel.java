package structural.Bridge.ScrollAppExample.Before;

public class JustTextVideoViewModel extends VideoViewModel {
	private String descriptor;
	private boolean isColoredText;

	public JustTextVideoViewModel(String title, int lengthInSecs, String descriptor, boolean isColoredText) {
		super(title, lengthInSecs);
		this.descriptor = descriptor;
		this.isColoredText = isColoredText;
	}

	public String getDescriptor() {
		return descriptor;
	}

	public boolean isColoredText() {
		return isColoredText;
	}
	
	public void render() {
		System.out.println("-----------------");
		System.out.println(getTitle() + " [ " + getDescriptor() + " ]");
		System.out.println("-----------------");
		System.out.println();
	}
}
