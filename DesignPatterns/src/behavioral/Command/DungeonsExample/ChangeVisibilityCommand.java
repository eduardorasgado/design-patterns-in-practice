package behavioral.Command.DungeonsExample;

public class ChangeVisibilityCommand extends Command {

	public ChangeVisibilityCommand(Goblin goblin) {
		super(goblin);
	}	

	@Override
	public void execute() {
		getGoblin().changeVisibility();
	}

}
