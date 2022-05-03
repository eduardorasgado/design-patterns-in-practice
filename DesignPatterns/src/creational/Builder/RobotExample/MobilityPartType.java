package creational.Builder.RobotExample;

public enum MobilityPartType {
	WHEELED("Wheeled"),
	TWO_LEGGED("Two Legged");
	
	private String description;
	
	private MobilityPartType(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}
}
