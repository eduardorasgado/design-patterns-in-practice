package structural.Bridge.ScrollAppExample;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ScrollAppDemo {
	public static void main(String[] args) {
		List<Video> videos = new ArrayList<>();
		videos.add(new Video("Maky | Afro Sunset Tulum 2021 | By @EPHIMERA Tulum", (60 * 20) + 5,
				"https://12.345.564/124142", "music at Tulum!", "image1"));
		videos.add(new Video("Astrix, Xerox, Illumination - Oranda (XI Live Mix 2017)", (60 * 4) + 34,
				"https://12.345.564/2400009", "trance music", "image2"));
		videos.add(new Video("Solomun - Rüfüs Du Sol - Hozho - Tale Of Us - Adriatique - And more", (60 * 60 * 3) + 15,
				"https://12.345.564/875939939", "Please Like And Subscribe To Support The Channel", "image3"));
		videos.add(new Video("brand new super cars!", (60 * 8) + 43, "https://12.345.564/08208304", "2022 new cars",
				"image4"));
		videos.add(new Video("Lo Mejor de Tchaikovsky", (60 * 2 * 60) + (60 * 12) + 5,
				"https://www.youtube.com/watch?v=DG87oy53_zM",
				"Muchas gracias por ver este vídeo del canal Halidon Music, ¡esperamos que lo hayas disfrutado! No olvides compartirlo y suscribirte a nuestro cana",
				"image5"));

		List<Stream> streams = new ArrayList<>();
		streams.add(new Stream("TheStreaM3R", 1220, "Take a look at this gameplay!", "https://12.345.433/34636332"));
		streams.add(new Stream("CAT223", 1220, "were reaaaaaaaaaaaady!", "https://12.345.433/23464363433"));
		streams.add(new Stream("BOY LITTLE BOY", 1220, "lets play COD", "https://12.345.433/234623623"));
		streams.add(new Stream("Some Gamer Gameplays", 1220, "freeFire here guys!", "https://12.345.433/2464364346"));
		streams.add(new Stream("xXAssassinG4M3RXx", 1220, "boring things here", "https://12.345.433/3646363423"));
		streams.add(new Stream("thingles", 1220, "asmr for yaa", "https://12.345.433/53532553"));

		videos.forEach(video -> System.out.println(video));
		streams.forEach(stream -> System.out.println(stream));

		List<IViewModel> resourcesViewModelList = new ArrayList<>();

		for (Video video : videos) {
			resourcesViewModelList.add(new VideoViewModel(video));
		}

		for (Stream stream : streams) {
			resourcesViewModelList.add(new StreamViewModel(stream));
		}

		List<PresenterListItem> viewModelList = new ArrayList<>();

		for (IViewModel resource : resourcesViewModelList) {
			viewModelList.add(
					new Random().nextBoolean() ? new WithThumbnailListItem(resource) : new JustTextListItem(resource));
		}
		
		// optional step: shuffle the list
		
		for (PresenterListItem item : viewModelList) {
			item.render();
		}
	}
}
