package creational.Prototype.UIExample;

public enum ClickableInteractionType {
	PRESSED("pressed"), RELEASED("released"), HOLDING("holding");

	private String description;

	private ClickableInteractionType(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}
}
