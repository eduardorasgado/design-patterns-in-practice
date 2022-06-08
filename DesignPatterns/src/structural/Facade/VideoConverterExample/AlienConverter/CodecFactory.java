package structural.Facade.VideoConverterExample.AlienConverter;

public class CodecFactory {

	public static CompressionCodec extract(VideoFile file) {
		System.out.println("Codec factory is extracting compression codec from video file...");
		return new ThreeGPCompressionCodec();
	}

}
