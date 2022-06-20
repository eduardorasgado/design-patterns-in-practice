package structural.Proxy.YoutubeExample;

public class YoutubeVideo implements Video {
	private String name;
	private int id;
	private static int incrementalId = 1;
	
	public YoutubeVideo(String name) {
		this.name = name;
		id = incrementalId++;
	}

	public YoutubeVideo() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@Override
	public String getDetails() {
		return toString();
	}

	@Override
	public String toString() {
		return "YoutubeVideo [name=" + name + ", id=" + id + "]";
	}
}
