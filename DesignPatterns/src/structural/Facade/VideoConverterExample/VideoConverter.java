package structural.Facade.VideoConverterExample;

import structural.Facade.VideoConverterExample.AlienConverter.BitrateReader;
import structural.Facade.VideoConverterExample.AlienConverter.CodecFactory;
import structural.Facade.VideoConverterExample.AlienConverter.CompressionCodec;
import structural.Facade.VideoConverterExample.AlienConverter.File;
import structural.Facade.VideoConverterExample.AlienConverter.MediaBuffer;
import structural.Facade.VideoConverterExample.AlienConverter.MediaFile;
import structural.Facade.VideoConverterExample.AlienConverter.VideoFile;

/**
 * This class represents the video converter facade for the AlienConverter library
 * @author cheetos
 *
 */
public class VideoConverter {
	private AudioEnhancer audioEnhancer;
	
	public VideoConverter() {
		audioEnhancer = new AudioEnhancer();
	}
	public File convert(String fileName, FormatType format) {
		VideoFile file = new VideoFile(fileName);
		CompressionCodec sourceCodec = CodecFactory.extract(file);
		
		CompressionCodec destinationCodec = format.getSupplier().get();
		
		MediaBuffer buffer = BitrateReader.read(fileName, sourceCodec);
		MediaFile result = BitrateReader.convert(buffer, destinationCodec);
		
		// calling the audio facade
		audioEnhancer.fixAndEnhance(result);
		
		return new File(result);
	}
}
