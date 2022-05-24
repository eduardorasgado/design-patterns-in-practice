package structural.Bridge.ScrollAppExample.Before;

public class WithThumbnailVideoViewModel extends VideoViewModel{
	private String imageUrl;

	public WithThumbnailVideoViewModel(String title, int lengthInSecs, String imageUrl) {
		super(title, lengthInSecs);
		this.imageUrl = imageUrl;
	}

	public String getImageUrl() {
		return imageUrl;
	}
	
	public void render() {
		System.out.println("-----------------");
		System.out.println(getTitle() + "[ " + getLengthInSecs() + " ]");
		System.out.println("(VIDEO THUMBNAIL)" + getImageUrl());
		System.out.println("-----------------");
		System.out.println();
	}
}
