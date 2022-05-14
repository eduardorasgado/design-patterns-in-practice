package creational.Singleton.SingleThread.ConfigurationFileReaderExample;

import static java.util.Objects.isNull;

public class ConfigurationFileReader {
	private String filePath;
	
	private static ConfigurationFileReader instance;
	
	private ConfigurationFileReader() {
	}
	
	public static ConfigurationFileReader getInstance() {
		if(isNull(instance)) {
			instance = new ConfigurationFileReader();
		}
		return instance;
	}
	
	public void initialize(String filePath) {
		this.filePath = filePath;
		validateFile();
		prepareFile();
	}
	
	private void prepareFile() {
		System.out.println("Preparing the file " + filePath);
	}
	
	private void validateFile() {
		System.out.println("Validating file...");
	}
}
