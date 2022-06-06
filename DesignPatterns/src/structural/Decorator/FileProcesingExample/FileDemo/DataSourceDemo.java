package structural.Decorator.FileProcesingExample.FileDemo;

public class DataSourceDemo {
	public static void main(String[] args) {
		String newMessage = "";
		DataSource fileDataSource = new FileDataSource("", newMessage);
		Encryptor encryptor = new ReverseEncryptor();
		DataSource encryptorFuncionality = new DataSourceEncryptor(encryptor, fileDataSource);
		DataSource compressorFuncionality = new DataSourceCompressor(encryptorFuncionality);
		
		DataHandler dataHandler = new DataHandler(compressorFuncionality);
		
		String data = "this message will be cyphered encrypted and stored";
		
		dataHandler.writeData(data);
		System.out.println(newMessage);
		dataHandler.readData();
	}
}
