package creational.Builder.HeroExample.Model;

public enum Armor {
	CHAIN_MAIL("Chain mail"),
	CLOTHES("Clothes"),
	LEATHER("Leather"),
	PLATE_MAIL("Plate mail");
	
	private String name;
	
	private Armor(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
