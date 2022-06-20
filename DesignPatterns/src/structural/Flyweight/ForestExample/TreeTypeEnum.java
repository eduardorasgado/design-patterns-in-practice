package structural.Flyweight.ForestExample;

public enum TreeTypeEnum {
	AHUEHUETE("Ahuehuete", ColorEnum.RED, "A"),
	JACARANDA("Jacaranda", ColorEnum.BLUE, "J"), 
	PAROTA("Parota", ColorEnum.BROWN, "P"),
	ALMENDRO("Almendro", ColorEnum.GREEN, "L");
	
	private String name;
	private ColorEnum color;
	private String texture;
	
	private TreeTypeEnum(String name, ColorEnum color, String texture) {
		this.name = name;
		this.color = color;
		this.texture = texture;
	}

	public String getName() {
		return name;
	}

	public ColorEnum getColor() {
		return color;
	}

	public String getTexture() {
		return texture;
	}	
}
