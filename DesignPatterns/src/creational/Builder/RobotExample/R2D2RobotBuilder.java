package creational.Builder.RobotExample;

public class R2D2RobotBuilder implements RobotBuilder {
	
	private Robot robot;
	
	public R2D2RobotBuilder() {
		robot = new Robot();
	}
	
	@Override
	public RobotBuilder assemblyMotherBoard() {
		robot.setMotherBoard(MotherBoardType.INTEL);
		return this;
	}

	@Override
	public RobotBuilder assemblyMobilityPart() {
		robot.setMobilityPart(MobilityPartType.WHEELED);
		return this;
	}

	@Override
	public RobotBuilder assemblyDefenseSystem() {
		robot.setDefenseSystem(DefenseSystemType.LASER);
		return this;
	}

	@Override
	public RobotBuilder assemblyVisionSystem() {
		robot.setVisionSystem(VisionSystemType.SONAR);
		return this;
	}

	@Override
	public Robot build() {
		return robot;
	}
}
