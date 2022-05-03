package creational.Builder.RobotExample;

public class RobotBuilderDemo {
	
	public static void main(String[] args) {
		RobotBuilder robotBuilder = new C3PIORobotBuilder();
		RobotBuildDirector robotBuildDirector = new RobotBuildDirector(robotBuilder);
		
		Robot robot = robotBuildDirector.construct();
		
		System.out.println("Turning on C3PIO...");
		robot.turnOn();
		System.out.println("-----------------");
		
		robotBuilder = new R2D2RobotBuilder();
		robotBuildDirector = new RobotBuildDirector(robotBuilder);
		
		robot = robotBuildDirector.construct();
		
		System.out.println("Turning on R2D2...");
		robot.turnOn();
		System.out.println("-----------------");
	}
}
