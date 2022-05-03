package creational.Builder.HeroExample.Model;

public enum HairType {
	BALD("Bald"),
	CURLY("Curly"),
	LONG_CURLY("Long curly"),
	LONG_STRAIGHT("Long Straight"),
	SHORT("Short");
	
	private String name;
	
	private HairType(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
