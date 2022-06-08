package structural.Decorator.FileProcesingExample;

public class FileDataSource implements DataSource {
	private String fileName;
	private String message;
	
	public FileDataSource(String fileName, String message) {
		this.fileName = fileName;
		this.message = message;
	}
	@Override
	public void writeData(String data) {
		setMessage(data);
	}

	@Override
	public String readData() {
		return getMessage();
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}
