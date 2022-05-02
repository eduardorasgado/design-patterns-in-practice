package creational.Factory.BlackSmithExample;

import java.util.HashMap;
import java.util.Map;

public class OrcBlackSmith implements BlackSmith {
	
	public final Map<WeaponType, Getter<Weapon>> ORCARSENAL;
	
	public OrcBlackSmith() {
		ORCARSENAL = new HashMap<>();
		ORCARSENAL.put(WeaponType.AXE, () -> new OrcAxe());
		ORCARSENAL.put(WeaponType.SPEAR, () -> new OrcSpear());
		ORCARSENAL.put(WeaponType.CROSSBOW, () -> new OrcCrossBow());
	}

	@Override
	public Weapon manufacturerWeapon(WeaponType weaponType) {
		return ORCARSENAL.get(weaponType).get();
	}
}
