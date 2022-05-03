package creational.Builder.RobotExample;

public enum VisionSystemType {
	LIDAR("Lidar"),
	SONAR("Sonar");
	
	private String description;
	
	private VisionSystemType(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}
}
