package structural.Decorator.RPGExample;

public class WarriorBronzeBoots extends VestmentDecorator {
	private int defensePoints;
	
	public WarriorBronzeBoots(CharacterVestment wrappee) {
		super(wrappee);
		this.defensePoints = 14;
	}
	
	@Override
	public int getDefense() {
		return super.getDefense() + defensePoints;
	}

}
