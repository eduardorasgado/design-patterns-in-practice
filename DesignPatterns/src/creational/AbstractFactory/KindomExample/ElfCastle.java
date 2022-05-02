package creational.AbstractFactory.KindomExample;

public class ElfCastle implements Castle {

	private final String DESCRIPTION = "This is the elf castle";
	
	@Override
	public String getDescription() {
		return DESCRIPTION;
	}

}
