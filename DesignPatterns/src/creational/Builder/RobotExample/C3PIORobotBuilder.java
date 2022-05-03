package creational.Builder.RobotExample;

public class C3PIORobotBuilder implements RobotBuilder {
	
	private Robot robot;
	
	public C3PIORobotBuilder() {
		robot = new Robot();
	}
	
	@Override
	public RobotBuilder assemblyMotherBoard() {
		robot.setMotherBoard(MotherBoardType.NVIDIA);
		return this;
	}

	@Override
	public RobotBuilder assemblyMobilityPart() {
		robot.setMobilityPart(MobilityPartType.TWO_LEGGED);
		return this;
	}

	@Override
	public RobotBuilder assemblyDefenseSystem() {
		robot.setDefenseSystem(DefenseSystemType.BULLETS);
		return this;
	}

	@Override
	public RobotBuilder assemblyVisionSystem() {
		robot.setVisionSystem(VisionSystemType.LIDAR);
		return this;
	}

	@Override
	public Robot build() {
		return robot;
	}
}
