package structural.Flyweight.GameParticleExample;

public class WeaponFactory {
	private WeaponFlyweightFactory weaponFlyweightFactory;
	
	public WeaponFactory() {
		weaponFlyweightFactory = new WeaponFlyweightFactory();
	}
	
	Weapon createWeapon(WeaponType weaponType, Game game) {
		return new Weapon(new Coordinate(), weaponType, weaponFlyweightFactory.getWeaponFlyweight(weaponType), game);
	}
}
