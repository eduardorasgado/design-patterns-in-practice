package structural.Bridge.ScrollAppExample.Before;

import java.util.List;

public class WithThumbnailStreamViewModel extends StreamViewModel {
	private List<String> imageSet;

	public WithThumbnailStreamViewModel(String title, int viewersCount, List<String> imageSet) {
		super(title, viewersCount);
		this.imageSet = imageSet;
	}

	public List<String> getImageSet() {
		return imageSet;
	}
	
	public void render() {
		System.out.println("-----------------");
		System.out.println(getTitle() + " viewers: " + getViewersCount());
		for(String image : getImageSet()) {
			System.out.println(image);
		}
		System.out.println("-----------------");
		System.out.println();
	}
}
