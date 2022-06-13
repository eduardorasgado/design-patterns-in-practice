package structural.Flyweight.GameParticleExample;

import static java.util.Objects.isNull;

import java.util.EnumMap;
import java.util.Map;

public class WeaponFlyweightFactory {
	private static Map<WeaponType, WeaponFlyweight> weapons;

	public WeaponFlyweightFactory() {
		this.weapons = new EnumMap<>(WeaponType.class);
	}

	public static WeaponFlyweight getWeaponFlyweight(WeaponType weaponType) {
		WeaponFlyweight weaponFlyweight = weapons.get(weaponType);
		if (isNull(weaponFlyweight)) {			
			Shot shot = WeaponShotFactory.getInstance().getWeaponShot(weaponType.getWeaponShotType());
			weaponFlyweight = new WeaponFlyweight(weaponType, shot);
			System.out.println("> [weaponFlyweight created id]: " + System.identityHashCode(weaponFlyweight));
			weapons.put(weaponType, weaponFlyweight);
		} else {
			System.out.println("> > [shot selected id]: " + System.identityHashCode(weaponFlyweight.getShot()));
			System.out.println("> [weaponFlyweight selected id]: " + System.identityHashCode(weaponFlyweight));
		}

		return weaponFlyweight;
	}
}
