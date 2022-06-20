package structural.Proxy.YoutubeExample;

import java.util.ArrayList;
import java.util.List;

import structural.Proxy.YoutubeExample.CachedYoutubeLib.YoutubeLibType;

public class YoutubeCachingDemo {
	public static void main(String[] args) {
		ThirdPartyYoutubeService cachedYoutubeLib = CachedYoutubeLib.getInstance(YoutubeLibType.CACHE);
		System.out.println("--------> " + System.identityHashCode(cachedYoutubeLib));
		
		List<Video> videos = new ArrayList<>();

		uploadVideos(videos, cachedYoutubeLib);

		cachedYoutubeLib.listVideos();
		cachedYoutubeLib.getVideoInfo(videos.get(4).getId());
		cachedYoutubeLib.getVideoInfo(videos.get(4).getId());
		cachedYoutubeLib.getVideoInfo(videos.get(4).getId());
		
		downloadVideo(videos.get(2).getId(), cachedYoutubeLib);
		downloadVideo(videos.get(2).getId(), cachedYoutubeLib);
		downloadVideo(videos.get(2).getId(), cachedYoutubeLib);
		downloadVideo(videos.get(2).getId(), cachedYoutubeLib);
		
		cachedYoutubeLib = CachedYoutubeLib.getInstance(YoutubeLibType.CACHE);
		System.out.println("--------> " + System.identityHashCode(cachedYoutubeLib));
		
		downloadVideo(videos.get(4).getId(), cachedYoutubeLib);
		downloadVideo(videos.get(4).getId(), cachedYoutubeLib);


		downloadVideo(videos.get(3).getId(), cachedYoutubeLib);
		downloadVideo(videos.get(3).getId(), cachedYoutubeLib);
		
		cachedYoutubeLib = CachedYoutubeLib.getInstance(YoutubeLibType.ORIGINAL);
		System.out.println("--------> " + System.identityHashCode(cachedYoutubeLib));
		
		uploadVideos(videos, cachedYoutubeLib);
		cachedYoutubeLib.listVideos();
		
		cachedYoutubeLib = CachedYoutubeLib.getInstance(YoutubeLibType.ORIGINAL);
		System.out.println("--------> " + System.identityHashCode(cachedYoutubeLib));
		
		cachedYoutubeLib.getVideoInfo(videos.get(3).getId());
	}
	
	private static void downloadVideo(int videoId, ThirdPartyYoutubeService service) {
		Video downloadedVideo = service.downloadVideo(videoId);
		System.out.println(downloadedVideo.getDetails() + " hash: " + System.identityHashCode(downloadedVideo));
	}
	
	private static void uploadVideos(List<Video> videos, ThirdPartyYoutubeService youtubeLib) {
		videos.add(new YoutubeVideo("elephants flying in the desert"));
		videos.add(new YoutubeVideo("Matrix all deaths"));
		videos.add(new YoutubeVideo("how to swim at midnight"));
		videos.add(new YoutubeVideo("Tegridy Farms - South Park part 1"));
		videos.add(new YoutubeVideo("Tegridy Farms - South Park part 2"));

		for(Video video : videos) {
			youtubeLib.uploadVideo(video);
		}
	}
}
