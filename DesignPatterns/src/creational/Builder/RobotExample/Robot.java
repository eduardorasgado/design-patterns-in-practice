package creational.Builder.RobotExample;

public class Robot {
	private MotherBoardType motherBoard;
	private MobilityPartType mobilityPart;
	private DefenseSystemType defenseSystem;
	private VisionSystemType visionSystem;
	
	public void turnOn() {
		System.out.println("Robot starting...");
		System.out.println(motherBoard.getDescription() + " is starting...");
		System.out.println(mobilityPart.getDescription() + " is starting..");
		System.out.println(defenseSystem.getDescription() + " is starting..");
		System.out.println(visionSystem.getDescription() + " is starting..");
	}
	
	public void setMotherBoard(MotherBoardType motherBoard) {
		this.motherBoard = motherBoard;
	}
	
	public void setMobilityPart(MobilityPartType mobilityPart) {
		this.mobilityPart = mobilityPart;
	}
	
	public void setDefenseSystem(DefenseSystemType defenseSystem) {
		this.defenseSystem = defenseSystem;
	}
	
	public void setVisionSystem(VisionSystemType visionSystem) {
		this.visionSystem = visionSystem;
	}
}
