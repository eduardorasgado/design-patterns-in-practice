package structural.Decorator.FileProcesingExample.FileDemo;

public class DataSourceBaseDecorator  implements DataSource {
	private DataSource wrappee;

	public DataSourceBaseDecorator(DataSource wrappee) {
		this.wrappee = wrappee;
	}

	@Override
	public void writeData(String data) {
		getWrappee().writeData(data);
		
	}

	@Override
	public String readData() {
		return getWrappee().readData();
	}

	private DataSource getWrappee() {
		return wrappee;
	}
}
