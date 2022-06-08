package structural.Facade.VideoConverterExample.AlienConverter;

public class AudioMixer {

	public MediaFile fix(MediaFile result) {
		System.out.println("Audio Mixer is fixing audio from media file");
		return new MediaFile();
	}

}
