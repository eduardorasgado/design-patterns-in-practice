package structural.Decorator.RPGExample;

public class Wizard implements RPGCharacter {
	private CharacterVestment set;
	private int lifePoints;
	
	public Wizard(CharacterVestment set) {
		this.set = set;
	}

	@Override
	public void attack(RPGCharacter character) {
		// TODO Auto-generated method stub

	}

	@Override
	public void defend(RPGCharacter character) {
		// TODO Auto-generated method stub
	}

	@Override
	public int getLifePoints() {
		return lifePoints;
	}

}
