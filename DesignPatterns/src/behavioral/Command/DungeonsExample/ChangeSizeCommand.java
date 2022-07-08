package behavioral.Command.DungeonsExample;

public class ChangeSizeCommand extends Command {
	
	public ChangeSizeCommand(Goblin goblin) {
		super(goblin);
	}

	@Override
	public void execute() {
		getGoblin().changeSize();
	}
}
