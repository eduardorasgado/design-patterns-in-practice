package structural.Flyweight.GameParticleExample;

import java.util.EnumMap;
import java.util.Map;

import static java.util.Objects.isNull;

public class WeaponShotFactory {
	private Map<WeaponShotType, Shot> weaponShots;
	private static WeaponShotFactory weaponShotFactory;

	private WeaponShotFactory() {
		this.weaponShots = new EnumMap<>(WeaponShotType.class);
	}

	public static WeaponShotFactory getInstance() {
		if (isNull(weaponShotFactory)) {
			weaponShotFactory = new WeaponShotFactory();
		}
		return weaponShotFactory;
	}

	public Shot getWeaponShot(WeaponShotType weaponShotType) {
		Shot weaponShot = weaponShots.get(weaponShotType);

		if (isNull(weaponShot)) {
			weaponShot = new Shot(weaponShotType.getShotRange(), weaponShotType.getShotRecoil());
			weaponShots.put(weaponShotType, weaponShot);
			System.out.println("> > [shot created id]: " + System.identityHashCode(weaponShot));
		}
		
		return weaponShot;
	}
}
