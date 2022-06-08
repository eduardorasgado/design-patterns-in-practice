package structural.Decorator.RPGExample;

public class WarriorPlateGloves extends VestmentDecorator{
	private int defensePoints;
	
	public WarriorPlateGloves(CharacterVestment wrappee) {
		super(wrappee);
		this.defensePoints = 22; 
	}

	@Override
	public int getDefense() {
		return super.getDefense() + defensePoints;
	}

}
