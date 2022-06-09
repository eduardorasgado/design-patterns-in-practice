package structural.Decorator.RPGExample;

public class RPGCharacter {
	private CharacterVestment set;
	private int lifePoints;
	// turn it into a decorator
	private int attackRate;
	
	public RPGCharacter(CharacterVestment set, int lifePoints, int attackRate) {
		super();
		this.set = set;
		this.lifePoints = lifePoints;
		this.attackRate = attackRate;
	}

	public void attack(RPGCharacter character) {
		character.defend(this);
	}
	
	public void defend(RPGCharacter character) {
		System.out.println("defense: " + set.getDefense());
		System.out.println("foe attack: " + character.getAttackRate());
		int pointsToRemove = set.getDefense() - character.getAttackRate();
		System.out.println("points to remove: " + pointsToRemove);
		lifePoints = pointsToRemove < 0 ? lifePoints + pointsToRemove : lifePoints; 
	}
	
	public int getLifePoints() {
		return lifePoints;
	}
	
	public void setLifePoints(int lifePoints) {
		this.lifePoints = lifePoints;
	}

	public int getAttackRate() {
		return attackRate;
	}

	public void setAttackRate(int attackRate) {
		this.attackRate = attackRate;
	}
}
