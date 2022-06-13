package structural.Flyweight.GameParticleExample;

public class WeaponFlyweight {
	private String color;
	private String spriteName;
	private String sprintePath;
	private Shot shot;
	
	public WeaponFlyweight(String color, String spriteName, String sprintePath, Shot shot) {
		super();
		this.color = color;
		this.spriteName = spriteName;
		this.sprintePath = sprintePath;
		this.shot = shot;
	}

	public WeaponFlyweight(WeaponType weaponType, Shot shot) {
		this(weaponType.getColor(), weaponType.getName(), weaponType.getPath(), shot);
	}

	public String getColor() {
		return color;
	}

	public String getSpriteName() {
		return spriteName;
	}

	public String getSprintePath() {
		return sprintePath;
	}

	public Shot getShot() {
		return shot;
	}
}
