package creational.Builder.HeroExample;

import creational.Builder.HeroExample.Model.HeroLineageType;
import creational.Builder.HeroExample.Model.Profession;

public class HeroBuilderDemo {
	public static void main(String[] args) {
		CharacterBuilder chBuilder = new HeroBuilder(Profession.PRIEST, "Geiko");
		HeroBuildDirector hbd = new HeroBuildDirector(chBuilder);
		
		Character character = hbd.construct(HeroLineageType.MEDIUM);
		System.out.println(character.toString());
		
		chBuilder = new HeroBuilder(Profession.WARRIOR, "Saitama");
		hbd = new HeroBuildDirector(chBuilder);
		
		character = hbd.construct(HeroLineageType.HIGH);
		System.out.println(character.toString());
	}
}
