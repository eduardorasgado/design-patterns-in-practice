package structural.Decorator.FileProcesingExample;

public class DataSourceEncryptor extends DataSourceBaseDecorator{
	
	private Encryptor encryptor;
	
	public DataSourceEncryptor(Encryptor encryptor, DataSource dataSource) {
		super(dataSource);
		this.encryptor = encryptor;
	}
	
	@Override
	public void writeData(String data) {
		super.writeData(encryptor.encrypt(data));
	}

	@Override
	public String readData() {
		return encryptor.decrypt(super.readData());
	}

}
