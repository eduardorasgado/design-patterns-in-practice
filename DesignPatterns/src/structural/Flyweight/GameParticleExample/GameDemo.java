package structural.Flyweight.GameParticleExample;

public class GameDemo {
	public static void main(String[] args) {
		// Bridge
		// Factory
		
		Game game = new Game();
		
		Unit aiSoldierEnemy = new Soldier(new Coordinate(), "AI Kennedy", true);
		Unit aiSoldierAlly = new Soldier(new Coordinate(), "AI Marcus", false);
		
		WeaponFactory weaponFactory = new WeaponFactory();
		
		System.out.println("Building aks...");
		Weapon ak47 = weaponFactory.createWeapon(WeaponType.AK47, game);
		System.out.println("[weapon created id]: " + System.identityHashCode(ak47));
		Weapon ak472 = weaponFactory.createWeapon(WeaponType.AK47, game);
		System.out.println("[weapon created id]: " + System.identityHashCode(ak472));
		Weapon ak473 = weaponFactory.createWeapon(WeaponType.AK47, game);
		System.out.println("[weapon created id]: " + System.identityHashCode(ak473));
		
		System.out.println("Building negevs...");
		Weapon negev = weaponFactory.createWeapon(WeaponType.NEGEV, game);
		System.out.println("[weapon created id]: " + System.identityHashCode(negev));
		Weapon negev2 = weaponFactory.createWeapon(WeaponType.NEGEV, game);
		System.out.println("[weapon created id]: " + System.identityHashCode(negev2));
		Weapon negev3 = weaponFactory.createWeapon(WeaponType.NEGEV, game);
		System.out.println("[weapon created id]: " + System.identityHashCode(negev3));
		
		aiSoldierEnemy.takeWeapon(ak47);
		aiSoldierAlly.takeWeapon(negev);
		
		aiSoldierEnemy.fireAt(aiSoldierAlly);
		aiSoldierEnemy.fireAt(aiSoldierAlly);
		aiSoldierEnemy.fireAt(aiSoldierAlly);
		aiSoldierEnemy.fireAt(aiSoldierAlly);
		
		aiSoldierAlly.fireAt(aiSoldierEnemy);
		aiSoldierAlly.fireAt(aiSoldierEnemy);
	}
}
