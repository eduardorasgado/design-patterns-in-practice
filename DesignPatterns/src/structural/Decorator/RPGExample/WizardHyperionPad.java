package structural.Decorator.RPGExample;

public class WizardHyperionPad extends VestmentDecorator {
	private int defensePoints;
	
	public WizardHyperionPad(CharacterVestment wrappee) {
		super(wrappee);
		this.defensePoints = 41;
	}

	@Override
	public int getDefense() {
		return super.getDefense() + defensePoints;
	}
}
