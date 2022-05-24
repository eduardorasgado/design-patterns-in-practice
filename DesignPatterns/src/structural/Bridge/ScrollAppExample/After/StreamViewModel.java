package structural.Bridge.ScrollAppExample.After;

public class StreamViewModel implements IViewModel{

	private Stream stream;
	
	public StreamViewModel(Stream stream) {
		this.stream = stream;
	}

	@Override
	public String getTitle() {
		return "(STREAM) " + stream.getStreamerName() + " is streaming..." + stream.getDescription() + " | viewers: " + stream.getViewersCount();
	}

	@Override
	public String getImage() {
		return "(STREAM) " + "Image extracted from the last minutes of " + stream.getStreamUniqueUrl();
	}
}
