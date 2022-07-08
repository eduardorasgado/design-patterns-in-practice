package behavioral.Command.DungeonsExample;

public class DungeonsDemo {
	public static void main(String[] args) {
		Goblin goblin = new Goblin();
		Wizard wizard = new Wizard();
		
		goblin.showStatus();
		
		wizard.castSpell(new ChangeSizeCommand(goblin));
		
		goblin.showStatus();
		
		wizard.castSpell(new ChangeVisibilityCommand(goblin));
		
		goblin.showStatus();
		
		// undoing everything
		
		System.out.println("undoing everything\n");
		
		wizard.undoLastSpell();
		
		goblin.showStatus();
		
		wizard.undoLastSpell();
		
		goblin.showStatus();
		
		// redoing everything
		
		System.out.println("redoing everything\n");
		
		wizard.redoLastSpell();
		
		goblin.showStatus();
		
		wizard.redoLastSpell();
		
		goblin.showStatus();
		
		
	}
}
