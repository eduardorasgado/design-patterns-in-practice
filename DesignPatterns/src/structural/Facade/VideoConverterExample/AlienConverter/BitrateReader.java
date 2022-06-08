package structural.Facade.VideoConverterExample.AlienConverter;

public class BitrateReader {

	public static MediaBuffer read(String fileName, CompressionCodec sourceCodec) {
		System.out.println(
				"Bit rate reader is reading a file given a sourceCodec: " + sourceCodec.getClass().getSimpleName());
		return new MediaBuffer();
	}

	public static MediaFile convert(MediaBuffer buffer, CompressionCodec destinationCodec) {
		System.out.println("Bit rate reader is converting media from buffer to a new codec: "
				+ destinationCodec.getClass().getSimpleName());
		return new MediaFile();
	}

}
