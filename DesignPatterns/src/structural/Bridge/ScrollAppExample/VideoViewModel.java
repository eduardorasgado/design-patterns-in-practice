package structural.Bridge.ScrollAppExample;

public class VideoViewModel implements IViewModel {
	private Video video;
	
	public VideoViewModel(Video video) {
		this.video = video;
	}

	@Override
	public String getTitle() {
		return "(VIDEO) " + video.getTitle() + " - " + video.getLengthInSecs();
	}

	@Override
	public String getImage() {
		return "(VIDEO)" + " [ " + video.getThumbnail() + " ]";
	}
}
