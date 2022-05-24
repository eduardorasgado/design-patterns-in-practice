package structural.Bridge.ScrollAppExample;

public class Stream {
	private String streamerName;
	private int viewersCount;
	private String description;
	private String streamUniqueUrl;
	
	public Stream(String streamerName, int viewersCount, String description, String streamUniqueUrl) {
		super();
		this.streamerName = streamerName;
		this.viewersCount = viewersCount;
		this.description = description;
		this.streamUniqueUrl = streamUniqueUrl;
	}
	
	public String getStreamerName() {
		return streamerName;
	}
	public int getViewersCount() {
		return viewersCount;
	}
	public String getDescription() {
		return description;
	}
	public String getStreamUniqueUrl() {
		return streamUniqueUrl;
	}

	@Override
	public String toString() {
		return "Stream [streamerName=" + streamerName + ", viewersCount=" + viewersCount + ", description="
				+ description + ", streamUniqueUrl=" + streamUniqueUrl + "]";
	}
}
