package creational.AbstractFactory.KindomExample;

public class ElfArmy implements Army {

	private final String DESCRIPTION = "This is the elf army";
	
	@Override
	public String getDescription() {
		return DESCRIPTION;
	}

}
