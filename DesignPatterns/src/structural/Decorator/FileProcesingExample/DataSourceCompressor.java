package structural.Decorator.FileProcesingExample;

public class DataSourceCompressor extends DataSourceBaseDecorator implements DataSource {
	
	
	public DataSourceCompressor(DataSource wrappee) {
		super(wrappee);
	}

	@Override
	public void writeData(String data) {
		System.out.println("compressing data...");
		super.writeData(data);

	}

	@Override
	public String readData() {
		System.out.println("Decompressing data...");
		return super.readData();
	}

}
