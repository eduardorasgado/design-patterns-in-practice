package structural.Flyweight.GameParticleExample;

public enum WeaponType {
	NEGEV("negevTextures.png", "//guns/heavy", "black", WeaponShotType.MACHINEGUN, "bulletNegev.png"), 
	AK47("ak47Textures.png", "//guns/rifle", "red", WeaponShotType.AUTOMATIC_RIFLE, "bulletAk47.png");
	
	private String name;
	private String path;
	private String color;
	private WeaponShotType weaponShotType;
	private String bulletSprite;

	private WeaponType(String name, String path, String color, WeaponShotType weaponShotType, String bulletSprite) {
		this.name = name;
		this.path = path;
		this.color = color;
		this.weaponShotType = weaponShotType;
		this.bulletSprite = bulletSprite;
	}

	public String getName() {
		return name;
	}

	public String getPath() {
		return path;
	}

	public String getColor() {
		return color;
	}

	public WeaponShotType getWeaponShotType() {
		return weaponShotType;
	}

	public String getBulletSprite() {
		return bulletSprite;
	}
}
