package structural.Proxy.YoutubeExample;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ThirdPartyYoutubeLib implements ThirdPartyYoutubeService {
	private List<Video> videos;
	
	public ThirdPartyYoutubeLib() {
		this.videos = new ArrayList<>();
	}

	@Override
	public void uploadVideo(Video video) {
		System.out.println("uploading video: " + video.getName());
		videos.add(video);
	}

	@Override
	public void listVideos() {
		videos.forEach(video -> System.out.println("video: " + video.getName()));
	}

	@Override
	public void getVideoInfo(int id) {
		Optional<Video> video = getVideo(id); 
		video.ifPresent(v -> System.out.println(v.getDetails()));
	}

	@Override
	public Video downloadVideo(int id) {
		Optional<Video> video = getVideo(id);
		return video.orElse(new YoutubeVideo());
	}

	private Optional<Video> getVideo(int id) {
		return videos.stream().filter(v -> v.getId() == id).findFirst();
	}
}
