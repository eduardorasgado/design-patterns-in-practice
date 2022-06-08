package structural.Facade.VideoConverterExample.AIAudio;

import structural.Facade.VideoConverterExample.AlienConverter.MediaFile;

public class AIAudioEnhancer {
	
	public void reduceNoise(MediaFile media) {
		System.out.println("AI Audio Enhancer is reducing noise from media file");
	}

	public AudioSegmentList recreateLowQualitySegments(MediaFile media) {
		System.out.println("AI Audio Enhancer is recreating low quality segments in media, using AI");
		return new AudioSegmentList();
	}

	public void fusionSegmentsToMedia(MediaFile media, AudioSegmentList segmentList) {
		System.out.println("AI Audio Enhancer is sticking together the audio segments within the media");
	}

}
