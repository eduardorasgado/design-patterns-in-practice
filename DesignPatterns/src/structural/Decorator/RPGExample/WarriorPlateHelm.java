package structural.Decorator.RPGExample;

public class WarriorPlateHelm extends VestmentDecorator {
	private int defensePoints;
	
	public WarriorPlateHelm(CharacterVestment wrappee) {
		super(wrappee);
		this.defensePoints = 31; 
	}

	@Override
	public int getDefense() {
		return super.getDefense() + defensePoints;
	}
}
