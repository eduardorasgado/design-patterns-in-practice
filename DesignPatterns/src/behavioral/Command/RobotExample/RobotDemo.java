package behavioral.Command.RobotExample;

public class RobotDemo {
	public static void main(String[] args) throws InterruptedException {
		Motor handlerMotor = new Motor(MotorDirection.NEUTRAL);
		HandlerSystem handlerSystem = new HandlerSystem(handlerMotor);
		
		R2D2Robot robot = new R2D2Robot(handlerSystem);
		 
		RobotCommand grabCommand = new GrabCommand(handlerSystem);
		if(robot.canSetCommand()) {
			robot.setCommand(grabCommand);
			robot.executeCommand();
		}
		
		RobotCommand dropCommand = new DropCommand(handlerSystem);
		if(robot.canSetCommand()) {
			robot.setCommand(dropCommand);
			robot.executeCommand();
		}
	}
}
