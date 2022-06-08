package structural.Facade.VideoConverterExample;

import java.util.function.Supplier;

import structural.Facade.VideoConverterExample.AlienConverter.CompressionCodec;
import structural.Facade.VideoConverterExample.AlienConverter.MPEG4CompressionCodec;
import structural.Facade.VideoConverterExample.AlienConverter.OggCompressionCodec;

public enum FormatType {
	MP4(MPEG4CompressionCodec::new),
	OGG(OggCompressionCodec::new);
	
	private Supplier<CompressionCodec> supplier;

	private FormatType(Supplier<CompressionCodec> supplier) {
		this.supplier = supplier;
	}

	public Supplier<CompressionCodec> getSupplier() {
		return supplier;
	}
}
