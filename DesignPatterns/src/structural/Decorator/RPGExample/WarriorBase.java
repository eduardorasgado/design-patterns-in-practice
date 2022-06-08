package structural.Decorator.RPGExample;

public class WarriorBase implements CharacterVestment {
	private int defensePoints;
	
	public WarriorBase() {
		defensePoints = 10;
	}
	@Override
	public int getDefense() {
		return defensePoints;
	}
}
