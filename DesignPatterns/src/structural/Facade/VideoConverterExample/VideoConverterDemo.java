package structural.Facade.VideoConverterExample;

import structural.Facade.VideoConverterExample.AlienConverter.File;

public class VideoConverterDemo {
	public static void main(String[] args) {
		VideoConverter converter = new VideoConverter();
		
		File convertedFile = converter.convert("graduation-day.3gp", FormatType.MP4);
		convertedFile.save();
	}
}
