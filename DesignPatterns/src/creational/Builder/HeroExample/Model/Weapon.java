package creational.Builder.HeroExample.Model;

public enum Weapon {
	AXE("Axe"),
	BOW("Bow"),
	DAGGGER("Dagger"),
	SWORD("Sword"),
	WARHAMMER("War Hammer");
	
	private String name;
	
	private Weapon(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
