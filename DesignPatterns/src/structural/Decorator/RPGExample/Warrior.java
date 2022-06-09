package structural.Decorator.RPGExample;

public class Warrior extends RPGCharacter {
	private int strengthBonus;

	public Warrior(CharacterVestment set, int lifePoints, int attackRate, int strengthBonus) {
		super(set, lifePoints, attackRate);
		this.strengthBonus = strengthBonus;
	}

	@Override
	public void attack(RPGCharacter character) {
		System.out.println("Warrior attacking with enhance of: " + strengthBonus);
		int tempAttackRate = getAttackRate();
		setAttackRate(tempAttackRate + strengthBonus);
		super.attack(character);
		setAttackRate(tempAttackRate);
	}
}
