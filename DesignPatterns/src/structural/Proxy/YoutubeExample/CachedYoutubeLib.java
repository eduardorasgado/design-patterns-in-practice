package structural.Proxy.YoutubeExample;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;

public class CachedYoutubeLib implements ThirdPartyYoutubeService {
	private static ThirdPartyYoutubeService instance;
	private ThirdPartyYoutubeService service;
	private Map<Integer, Video> cachedVideo;

	private CachedYoutubeLib(ThirdPartyYoutubeService service) {
		this.service = service;
		cachedVideo = new HashMap<>();
	}

	public static enum YoutubeLibType {
		CACHE(CachedYoutubeLib.class), ORIGINAL(ThirdPartyYoutubeLib.class);

		private Class<?> LibClass;

		private YoutubeLibType(Class<?> libClass) {
			LibClass = libClass;
		}

		public Class<?> getLibClass() {
			return LibClass;
		}
	}

	private static Map<YoutubeLibType, Supplier<ThirdPartyYoutubeService>> serviceMap;

	static {
		serviceMap = new HashMap<>();
		serviceMap.put(YoutubeLibType.CACHE, () -> getNewCachedYoutubeLib());
		serviceMap.put(YoutubeLibType.ORIGINAL, ThirdPartyYoutubeLib::new);
	}

	public static ThirdPartyYoutubeService getInstance(YoutubeLibType youtubeLibType) {
		
		
		if (isNull(instance) || (nonNull(instance) && !instance.getClass().equals(youtubeLibType.getLibClass()))) {
			instance = serviceMap.get(youtubeLibType).get();
		}
		return instance;
	}

	private static CachedYoutubeLib getNewCachedYoutubeLib() {
		ThirdPartyYoutubeService youtubeLib = new ThirdPartyYoutubeLib();
		return new CachedYoutubeLib(youtubeLib);

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

		if (isNull(video)) {
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

		if (isNull(video)) {
			video = service.downloadVideo(id);
			cachedVideo.put(id, video);
		}

		return video;
	}
}
