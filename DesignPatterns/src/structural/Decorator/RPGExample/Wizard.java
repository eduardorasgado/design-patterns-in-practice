package structural.Decorator.RPGExample;

public class Wizard extends RPGCharacter {
	private int healingBonus;

	public Wizard(CharacterVestment set, int lifePoints, int attackRate, int healingBonus) {
		super(set, lifePoints, attackRate);
		this.healingBonus = healingBonus;
	}
	
	

	@Override
	public void attack(RPGCharacter character) {
		System.out.println("wizard is attacking...");
		super.attack(character);
	}

	@Override
	public void defend(RPGCharacter character) {
		super.defend(character);
		System.out.println("wizard is healing: " + healingBonus + " of life");
		setLifePoints(healingBonus + getLifePoints());
	}
}
