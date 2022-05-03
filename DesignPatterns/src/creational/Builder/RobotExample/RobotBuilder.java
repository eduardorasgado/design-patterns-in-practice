package creational.Builder.RobotExample;

public interface RobotBuilder {
	RobotBuilder assemblyMotherBoard();
	RobotBuilder assemblyMobilityPart();
	RobotBuilder assemblyDefenseSystem();
	RobotBuilder assemblyVisionSystem();
	Robot build();
}
