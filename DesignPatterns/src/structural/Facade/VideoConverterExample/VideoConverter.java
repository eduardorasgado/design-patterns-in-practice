package structural.Facade.VideoConverterExample;

import structural.Facade.VideoConverterExample.AlienConverter.AudioMixer;
import structural.Facade.VideoConverterExample.AlienConverter.BitrateReader;
import structural.Facade.VideoConverterExample.AlienConverter.CodecFactory;
import structural.Facade.VideoConverterExample.AlienConverter.CompressionCodec;
import structural.Facade.VideoConverterExample.AlienConverter.File;
import structural.Facade.VideoConverterExample.AlienConverter.MediaBuffer;
import structural.Facade.VideoConverterExample.AlienConverter.MediaFile;
import structural.Facade.VideoConverterExample.AlienConverter.VideoFile;

public class VideoConverter {
	
	public File convert(String fileName, FormatType format) {
		VideoFile file = new VideoFile(fileName);
		CompressionCodec sourceCodec = CodecFactory.extract(file);
		
		CompressionCodec destinationCodec = format.getSupplier().get();
		
		MediaBuffer buffer = BitrateReader.read(fileName, sourceCodec);
		MediaFile result = BitrateReader.convert(buffer, destinationCodec);
		result = (new AudioMixer()).fix(result);
		
		return new File(result);
	}
}
