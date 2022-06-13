package structural.Flyweight.GameParticleExample;

public interface Unit {

	void fireAt(Unit aiSoldierAlly);

	void takeWeapon(Weapon weapon);

	void receiveShot(Weapon weapon);
}
