package structural.Proxy.YoutubeExample;

public interface ThirdPartyYoutubeService {

	void uploadVideo(Video video);

	void listVideos();

	void getVideoInfo(int id);

	Video downloadVideo(int id);

}
