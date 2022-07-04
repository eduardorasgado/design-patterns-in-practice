package behavioral.Command.RobotExample;

public class GrabCommand extends RobotCommand {

	public GrabCommand(HandlerSystem handlerSystem) {
		super(handlerSystem);
	}

	@Override
	public void execute() {
		setStarted(true);
		getHandlerSystem().grab();
		setFinished(true);
	}
}
