package creational.Builder.HeroExample.Model;

public enum HeroLineageType {
	LOW("Low", HairColor.BLACK, Weapon.BOW, Armor.CLOTHES, HairType.BALD),
	MEDIUM("Medium", HairColor.BROWN, Weapon.AXE, Armor.CHAIN_MAIL, HairType.SHORT),
	HIGH("High", HairColor.BLOND, Weapon.SWORD, Armor.PLATE_MAIL, HairType.LONG_CURLY);
	
	private String name;
	private HairColor hairColor;
	private Weapon weapon;
	private Armor armor;
	private HairType hairType;
	
	private HeroLineageType(String name, HairColor hairColor, Weapon weapon, Armor armor, HairType hairType) {
		this.name = name;
		this.hairColor = hairColor;
		this.weapon = weapon;
		this.armor = armor;
		this.hairType = hairType;
	}

	public String getName() {
		return name;
	}

	public HairColor getHairColor() {
		return hairColor;
	}

	public Weapon getWeapon() {
		return weapon;
	}

	public Armor getArmor() {
		return armor;
	}

	public HairType getHairType() {
		return hairType;
	}
}
