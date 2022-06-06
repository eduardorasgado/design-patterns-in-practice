package structural.Decorator.FileProcesingExample.FileDemo;

public class DataHandler {
	
	private DataSource fileManager;

	public DataHandler(DataSource fileManager) {
		this.fileManager = fileManager;
	}

	public void writeData(String data) {
		System.out.println("writing data in data handler...");
		fileManager.writeData(data);
		
	}

	public void readData() {
		System.out.println("reading data in data handler...");
		System.out.println(fileManager.readData());
	}

}
