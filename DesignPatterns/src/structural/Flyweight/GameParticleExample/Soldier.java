package structural.Flyweight.GameParticleExample;

// this class can be a composite
public class Soldier extends Localizable implements Unit {
	private Weapon weapon;
	private String name;
	private boolean isEnemy;
	private Game game;

	public Soldier(Coordinate coordinate, Weapon weapon, String name, boolean isEnemy) {
		super(coordinate);
		this.weapon = weapon;
		this.name = name;
		this.isEnemy = isEnemy;
	}
	
	public Soldier(Coordinate coordinate, String name, boolean isEnemy) {
		super(coordinate);
		this.name = name;
		this.isEnemy = isEnemy;
	}

	@Override
	public void fireAt(Unit soldier) {
		weapon.shot(getCoordinate(), ((Localizable) soldier).getCoordinate());		
		soldier.receiveShot(weapon);		
		
	}


	@Override
	public void takeWeapon(Weapon weapon) {
		this.weapon = weapon;
		System.out.println("Taking weapon");
	}

	@Override
	public void receiveShot(Weapon weapon) {
		System.out.println("Soldier " + name + " is receiving a shot.");
	}
}
