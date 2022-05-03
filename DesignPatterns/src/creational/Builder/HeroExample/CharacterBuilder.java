package creational.Builder.HeroExample;

import creational.Builder.HeroExample.Model.Armor;
import creational.Builder.HeroExample.Model.HairColor;
import creational.Builder.HeroExample.Model.HairType;
import creational.Builder.HeroExample.Model.Weapon;

public interface CharacterBuilder {
	CharacterBuilder withHairType(HairType hairType);
	CharacterBuilder withHairColor(HairColor hairColor);
	CharacterBuilder withArmor(Armor armor);
	CharacterBuilder withWeapon(Weapon weapon);
	Character build();
}
