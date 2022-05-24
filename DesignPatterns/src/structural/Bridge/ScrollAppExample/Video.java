package structural.Bridge.ScrollAppExample;

public class Video {
	private String title;
	private int lengthInSecs;
	private String storageUrl;
	private String description;
	private String thumbnail;
	
	
	public Video(String title, int lengthInSecs, String storageUrl, String description, String thumbnail) {
		super();
		this.title = title;
		this.lengthInSecs = lengthInSecs;
		this.storageUrl = storageUrl;
		this.description = description;
		this.thumbnail = thumbnail;
	}
	
	public String getTitle() {
		return title;
	}
	public int getLengthInSecs() {
		return lengthInSecs;
	}
	public String getStorageUrl() {
		return storageUrl;
	}
	public String getDescription() {
		return description;
	}
	
	public String getThumbnail() {
		return thumbnail;
	}

	@Override
	public String toString() {
		return "Video [title=" + title + ", lengthInSecs=" + lengthInSecs + ", storageUrl=" + storageUrl
				+ ", description=" + description + "]";
	}
}
