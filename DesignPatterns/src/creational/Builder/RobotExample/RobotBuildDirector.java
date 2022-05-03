package creational.Builder.RobotExample;

public class RobotBuildDirector {
	private RobotBuilder robotBuilder;
	
	public RobotBuildDirector(RobotBuilder robotBuilder) {
		this.robotBuilder = robotBuilder;
	}
	
	public Robot construct() {
		return robotBuilder
				.assemblyMotherBoard()
				.assemblyMobilityPart()
				.assemblyVisionSystem()
				.assemblyDefenseSystem()
				.build();
	}
}
