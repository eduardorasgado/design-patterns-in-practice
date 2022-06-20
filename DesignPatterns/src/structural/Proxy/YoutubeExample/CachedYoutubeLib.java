package structural.Proxy.YoutubeExample;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.Objects.isNull;

public class CachedYoutubeLib implements ThirdPartyYoutubeService {
	private ThirdPartyYoutubeService service;
	private Map<Integer, Video> cachedVideo;
	
	public CachedYoutubeLib(ThirdPartyYoutubeService service) {
		this.service = service;
		cachedVideo = new HashMap<>();
	}

	@Override
	public void uploadVideo(Video video) {
		System.out.println("[Log to DB]");
		service.uploadVideo(video);
	}

	@Override
	public void listVideos() {
		System.out.println("[Log to DB]");
		service.listVideos();
	}

	@Override
	public void getVideoInfo(int id) {
		System.out.println("[Log to DB]");
		Video video = cachedVideo.get(id);
		
		if(isNull(video)) {
			service.getVideoInfo(id);
			
			video = downloadVideo(id);
			
		} else {
			System.out.println(video.getDetails());
		}
		System.out.println(System.identityHashCode(video));
	}

	@Override
	public Video downloadVideo(int id) {
		System.out.println("[Log to DB]");
		Video video = cachedVideo.get(id);
		
		if(isNull(video)) {
			video = service.downloadVideo(id);
			cachedVideo.put(id, video);
		}
		
		return video;
	}
}
