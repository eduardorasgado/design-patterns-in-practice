package structural.Proxy.YoutubeExample;

import java.util.ArrayList;
import java.util.List;

public class YoutubeCachingDemo {
	public static void main(String[] args) {
		ThirdPartyYoutubeService youtubeLib = new ThirdPartyYoutubeLib();
		ThirdPartyYoutubeService cachedYoutubeLib = new CachedYoutubeLib(youtubeLib);
		List<Video> videos = new ArrayList<>();

		videos.add(new YoutubeVideo("elephants flying in the desert"));
		videos.add(new YoutubeVideo("Matrix all deaths"));
		videos.add(new YoutubeVideo("how to swim at midnight"));
		videos.add(new YoutubeVideo("Tegridy Farms - South Park part 1"));
		videos.add(new YoutubeVideo("Tegridy Farms - South Park part 2"));

		videos.forEach(video -> cachedYoutubeLib.uploadVideo(video));

		cachedYoutubeLib.listVideos();
		cachedYoutubeLib.getVideoInfo(videos.get(4).getId());
		cachedYoutubeLib.getVideoInfo(videos.get(4).getId());
		cachedYoutubeLib.getVideoInfo(videos.get(4).getId());
		
		downloadVideo(videos.get(2).getId(), cachedYoutubeLib);
		downloadVideo(videos.get(2).getId(), cachedYoutubeLib);
		downloadVideo(videos.get(2).getId(), cachedYoutubeLib);
		downloadVideo(videos.get(2).getId(), cachedYoutubeLib);
		
		
		
		downloadVideo(videos.get(4).getId(), cachedYoutubeLib);
		downloadVideo(videos.get(4).getId(), cachedYoutubeLib);


		downloadVideo(videos.get(3).getId(), cachedYoutubeLib);
		downloadVideo(videos.get(3).getId(), cachedYoutubeLib);
	}
	
	private static void downloadVideo(int videoId, ThirdPartyYoutubeService service) {
		Video downloadedVideo = service.downloadVideo(videoId);
		System.out.println(downloadedVideo.getDetails() + " hash: " + System.identityHashCode(downloadedVideo));
	}
}
