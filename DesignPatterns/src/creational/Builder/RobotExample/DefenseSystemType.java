package creational.Builder.RobotExample;

public enum DefenseSystemType {
	LASER("Laser"),
	BULLETS("Bullets");
	
	private String description;
	
	private DefenseSystemType(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}
}
