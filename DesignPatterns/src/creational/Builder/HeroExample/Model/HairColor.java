package creational.Builder.HeroExample.Model;

public enum HairColor {
	BLACK("Black"),
	BLOND("Blond"),
	BROWN("Brown"),
	RED("Red"),
	WHITE("White");
	
	private String name;
	
	private HairColor(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
