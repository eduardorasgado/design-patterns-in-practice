package creational.Builder.HeroExample;

import creational.Builder.HeroExample.Model.HeroLineageType;

public class HeroBuildDirector {
	private CharacterBuilder characterBuilder;
	
	public HeroBuildDirector(CharacterBuilder characterBuilder) {
		this.characterBuilder = characterBuilder;
	}
	public Character construct(HeroLineageType heroLineageType) {
		return characterBuilder
				.withArmor(heroLineageType.getArmor())
				.withWeapon(heroLineageType.getWeapon())
				.withHairType(heroLineageType.getHairType())
				.withHairColor(heroLineageType.getHairColor())
				.build();
	}
}
