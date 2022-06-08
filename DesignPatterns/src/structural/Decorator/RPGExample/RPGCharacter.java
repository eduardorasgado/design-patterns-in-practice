package structural.Decorator.RPGExample;

public interface RPGCharacter {
	void attack(RPGCharacter character);
	void defend(RPGCharacter character);
	int getLifePoints();
}
