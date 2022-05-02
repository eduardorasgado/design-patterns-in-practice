package creational.AbstractFactory.KindomExample;

public class ElfKing implements King {

	private final String DESCRIPTION = "This is the elf king";
	
	@Override
	public String getDescription() {
		return DESCRIPTION;
	}

}
