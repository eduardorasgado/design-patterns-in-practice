package structural.Decorator.RPGExample;

public class WizardSphinxBoots extends VestmentDecorator {
	private int defensePoints;
	
	public WizardSphinxBoots(CharacterVestment wrappee) {
		super(wrappee);
		this.defensePoints = 14;
	}

	@Override
	public int getDefense() {
		return super.getDefense() + defensePoints;
	}

}
