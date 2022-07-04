package behavioral.Command.RobotExample;

public class R2D2Robot {
	private HandlerSystem handlerSystem;
	private RobotCommand robotCommand;

	public R2D2Robot(HandlerSystem handlerSystem) {
		this.handlerSystem = handlerSystem;
	}

	public boolean canSetCommand() {
		if (robotCommand == null || (robotCommand != null && !robotCommand.hasStarted())
				|| (robotCommand != null && robotCommand.isFinished())) {
			return true;
		}
		return false;
	}

	public void setCommand(RobotCommand robotCommand) {
		this.robotCommand = robotCommand;
	}

	public void executeCommand() {
		if(systemsAreWorking()) {
			robotCommand.execute();
		}
	}

	public boolean systemsAreWorking() {
		return handlerSystem.getStatus() == 1;
	}
}
