package structural.Decorator.RPGExample;

public class WizardBase implements CharacterVestment {
	private int defensePoints;
	
	public WizardBase() {
		this.defensePoints = 8;
	}
	@Override
	public int getDefense() {
		return defensePoints;
	}

}
