package behavioral.Command.RobotExample;

public class DropCommand extends RobotCommand {

	public DropCommand(HandlerSystem handlerSystem) {
		super(handlerSystem);
	}

	@Override
	public void execute() {
		setStarted(true);
		getHandlerSystem().drop();
		setFinished(true);
	}
}
