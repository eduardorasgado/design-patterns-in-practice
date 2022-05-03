package creational.Builder.RobotExample;

public enum MotherBoardType {
	INTEL("Intel"),
	NVIDIA("Nvidia");
	
	private String description;
	
	private MotherBoardType(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}
}
