package creational.AbstractFactory.KindomExample;

public class OrcArmy implements Army{

	private final String DESCRIPTION = "This is the orc army";
	
	@Override
	public String getDescription() {
		return DESCRIPTION;
	}

}
