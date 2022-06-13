package structural.Flyweight.GameParticleExample;

public class Weapon extends Localizable {
	private WeaponType weaponType;
	private WeaponFlyweight weaponFlyweight;
	private Game game;

	public Weapon(Coordinate coordinate, WeaponType weaponType, WeaponFlyweight weaponFlyweight, Game game) {
		super(coordinate);
		
		this.weaponType = weaponType;
		this.weaponFlyweight = weaponFlyweight;
		this.game = game;
	}

	public void shot(Coordinate originCoordinate, Coordinate targetCoordinate) {
		System.out.println("shooting...!");
		game.addParticle(originCoordinate, targetCoordinate, weaponType, "red");
	}
}
