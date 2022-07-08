package behavioral.Command.DungeonsExample;

public abstract class Command {

	private Goblin goblin;
	
	public Command(Goblin goblin) {
		this.goblin = goblin;
	}
	
	public Goblin getGoblin() {
		return goblin;
	}

	abstract void execute();

}
