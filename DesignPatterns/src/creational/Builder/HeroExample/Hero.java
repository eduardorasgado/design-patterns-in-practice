package creational.Builder.HeroExample;

import creational.Builder.HeroExample.Model.Armor;
import creational.Builder.HeroExample.Model.HairColor;
import creational.Builder.HeroExample.Model.HairType;
import creational.Builder.HeroExample.Model.Profession;
import creational.Builder.HeroExample.Model.Weapon;

public final class Hero implements Character {
	private final Profession profession;
	private final String name;
	private final HairType hairType;
	private final HairColor hairColor;
	private final Armor armor;
	private final Weapon weapon;
	
	public Hero(HeroBuilder builder) {
		profession = builder.getProfession();
		name = builder.getName();
		hairType = builder.getHairType();
		hairColor = builder.getHairColor();
		armor = builder.getArmor();
		weapon = builder.getWeapon();
	}

	@Override
	public String toString() {
		return "Hero [profession=" + profession + ", name=" + name + ", hairType=" + hairType + ", hairColor="
				+ hairColor + ", armor=" + armor + ", weapon=" + weapon + "]";
	}
}
