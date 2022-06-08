package structural.Facade.VideoConverterExample;

import structural.Facade.VideoConverterExample.AIAudio.AIAudioEnhancer;
import structural.Facade.VideoConverterExample.AIAudio.AudioMixer;
import structural.Facade.VideoConverterExample.AIAudio.AudioSegmentList;
import structural.Facade.VideoConverterExample.AlienConverter.MediaFile;

/**
 * This class represents the audio enhancer facade for the AIAudio library
 * @author cheetos
 *
 */
public class AudioEnhancer {
	private AudioMixer mixer;
	private AIAudioEnhancer aiEnhancer;
	
	public AudioEnhancer() {
		mixer = new AudioMixer();
		aiEnhancer = new AIAudioEnhancer();
	}
	
	private void fix(MediaFile media) {
		mixer.adjustBass(media);
		mixer.adjustTreeble(media);
	}
	
	private void enhance(MediaFile media) {
		aiEnhancer.reduceNoise(media);
		AudioSegmentList segmentList = aiEnhancer.recreateLowQualitySegments(media);
		aiEnhancer.fusionSegmentsToMedia(media, segmentList);
	}

	public void fixAndEnhance(MediaFile media) {
		fix(media);
		enhance(media);
	}
	
}
