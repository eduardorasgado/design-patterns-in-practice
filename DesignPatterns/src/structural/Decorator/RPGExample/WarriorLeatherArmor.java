package structural.Decorator.RPGExample;

public class WarriorLeatherArmor extends VestmentDecorator {
	private int defensePoints;
	
	public WarriorLeatherArmor(CharacterVestment vestmentDecorator) {
		super(vestmentDecorator);
		this.defensePoints = 16;
	}

	@Override
	public int getDefense() {
		return super.getDefense() + defensePoints;
	}
}
