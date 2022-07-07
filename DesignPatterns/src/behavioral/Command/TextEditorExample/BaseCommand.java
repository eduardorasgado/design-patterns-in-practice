package behavioral.Command.TextEditorExample;

public abstract class BaseCommand  implements Command {
	private String commandName;
	private Application application;
	
	public BaseCommand(String commandName, Application application) {
		this.application = application;
		this.commandName = commandName;
	}

	public String getCommandName() {
		return commandName;
	}

	public Application getApplication() {
		return application;
	}

	@Override
	public void undo() {
		System.out.print(getCommandName());
	}
}
