package creational.Singleton.SingleThread.ConfigurationFileReaderExample;

public class ReaderDemo {
	public static void main(String[] args) {
		String file = "C:/Users/cheetos/Library/ComputerScienceLibrary/POO/silo.pub_dive-into-design-patterns.pdf";
		
		storeData(file);		
	}
	
	public static void storeData(String file) {
		ConfigurationFileReader fileReader = ConfigurationFileReader.getInstance();
		fileReader.initialize(file);
		
		ConfigurationFileReader fileReader2 = ConfigurationFileReader.getInstance();
		
		ConfigurationFileReader fileReader3 = ConfigurationFileReader.getInstance();
		
		System.out.println(fileReader.equals(fileReader2) && fileReader.equals(fileReader3));
	}

}
