package behavioral.Command.RobotExample;

public abstract class RobotCommand {
	
	private HandlerSystem handlerSystem;
	private boolean started = false;
	private boolean finished = false;
	
	public RobotCommand(HandlerSystem handlerSystem) {
		this.handlerSystem = handlerSystem;
	}

	public boolean hasStarted() {
		return started;
	}

	public boolean isFinished() {
		return finished;
	}

	abstract void execute();

	public HandlerSystem getHandlerSystem() {
		return handlerSystem;
	}

	public void setStarted(boolean started) {
		this.started = started;
	}

	public void setFinished(boolean finished) {
		this.finished = finished;
	}
}
