package creational.Builder.HeroExample;

import creational.Builder.HeroExample.Model.Armor;
import creational.Builder.HeroExample.Model.HairColor;
import creational.Builder.HeroExample.Model.HairType;
import creational.Builder.HeroExample.Model.Profession;
import creational.Builder.HeroExample.Model.Weapon;

public class HeroBuilder implements CharacterBuilder{
	private final Profession profession;
	private final String name;
	private HairType hairType;
	private HairColor hairColor;
	private Armor armor;
	private Weapon weapon;
	
	public HeroBuilder(Profession profession, String name) {
		if(profession == null || name == null) {
			throw new IllegalArgumentException("Profession and name can not be null");
		}
		
		this.profession = profession;
		this.name = name;
	}
	
	@Override
	public CharacterBuilder withHairType(HairType hairType) {
		this.hairType = hairType;
		return this;
	}
	
	@Override
	public CharacterBuilder withHairColor(HairColor hairColor) {
		this.hairColor = hairColor;
		return this;
	}
	
	@Override
	public CharacterBuilder withArmor(Armor armor) {
		this.armor = armor;
		return this;
	}
	
	@Override
	public CharacterBuilder withWeapon(Weapon weapon) {
		this.weapon = weapon;
		return this;
	}
	
	@Override
	public Character build() {
		return new Hero(this);
	}

	public Profession getProfession() {
		return profession;
	}

	public String getName() {
		return name;
	}

	public HairType getHairType() {
		return hairType;
	}

	public HairColor getHairColor() {
		return hairColor;
	}

	public Armor getArmor() {
		return armor;
	}

	public Weapon getWeapon() {
		return weapon;
	}
}