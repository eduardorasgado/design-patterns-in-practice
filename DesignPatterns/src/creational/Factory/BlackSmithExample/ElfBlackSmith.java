package creational.Factory.BlackSmithExample;

import java.util.HashMap;
import java.util.Map;

public class ElfBlackSmith implements BlackSmith {
	
	public final Map<WeaponType, Getter<Weapon>> ELFARSENAL;
	
	public ElfBlackSmith() {
		ELFARSENAL = new HashMap<>();
		ELFARSENAL.put(WeaponType.AXE, () -> new ElfAxe());
		ELFARSENAL.put(WeaponType.SPEAR, () -> new ElfSpear());
		ELFARSENAL.put(WeaponType.CROSSBOW, () -> new ElfCrossBow());
	}
	
	@Override
	public Weapon manufacturerWeapon(WeaponType weaponType) {
		return ELFARSENAL.get(weaponType).get();
	}	
}
