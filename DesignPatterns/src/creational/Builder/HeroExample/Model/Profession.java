package creational.Builder.HeroExample.Model;

public enum Profession {
	MAGE("Mage"),
	PRIEST("Priest"),
	THIEF("Thief"),
	WARRIOR("Warrior");
	
	private String name;
	
	private Profession(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
