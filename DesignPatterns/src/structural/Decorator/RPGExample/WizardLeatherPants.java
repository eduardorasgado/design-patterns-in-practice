package structural.Decorator.RPGExample;

public class WizardLeatherPants extends VestmentDecorator {
	private int defensePoints;
	
	public WizardLeatherPants(CharacterVestment wrappee) {
		super(wrappee);
		this.defensePoints = 10;
	}

	@Override
	public int getDefense() {
		// TODO Auto-generated method stub
		return super.getDefense() + defensePoints;
	}
}
