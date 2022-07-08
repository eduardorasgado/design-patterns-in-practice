package behavioral.Command.DungeonsExample;

import java.util.Deque;
import java.util.LinkedList;

public class Wizard {

	private Deque<Command> undoStack;
	private Deque<Command> redoStack;
	
	public Wizard() {
		undoStack = new LinkedList<>();
		redoStack = new LinkedList<>();
	}
	
	public void castSpell(Command changeSizeCommand) {
		changeSizeCommand.execute();
		
		undoStack.offerLast(changeSizeCommand);		
	}

	public void undoLastSpell() {
		if(!undoStack.isEmpty()) {
			Command lastSpell = undoStack.pollLast();
			redoStack.offerLast(lastSpell);
			lastSpell.execute();
		}
	}

	public void redoLastSpell() {
		if(!redoStack.isEmpty()) {
			Command lastSpell = redoStack.pollLast();
			undoStack.offerLast(lastSpell);
			lastSpell.execute();
		}
	}

}
