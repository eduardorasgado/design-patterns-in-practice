package creational.FactoryMethod.BlackSmithExample;

public class BlackSmithDemo {
	public static void main(String[] args) {
		BlackSmith bs = new ElfBlackSmith();
		
		Weapon elfWeapon = bs.manufacturerWeapon(WeaponType.AXE);
		elfWeapon.attack();
		
		elfWeapon = bs.manufacturerWeapon(WeaponType.SPEAR);
		elfWeapon.attack();
		
		elfWeapon = bs.manufacturerWeapon(WeaponType.CROSSBOW);
		elfWeapon.attack();
		
		bs = new OrcBlackSmith();
		
		Weapon orcWeapon = bs.manufacturerWeapon(WeaponType.SPEAR);
		orcWeapon.attack();
		
		orcWeapon = bs.manufacturerWeapon(WeaponType.AXE);
		orcWeapon.attack();
		
		orcWeapon = bs.manufacturerWeapon(WeaponType.CROSSBOW);
		orcWeapon.attack();
	}
}
