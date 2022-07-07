package behavioral.Command.TextEditorExample;

import java.util.ArrayList;
import java.util.List;

public class CommandHistory {
	List<Command> stack;
	
	public CommandHistory() {
		stack = new ArrayList<>();
	}

	public void push(Command docCommand) {
		stack.add(docCommand);
	}
	
	public Command pop() {
		Command toRemove = null;
		if(!stack.isEmpty()) {
			toRemove = stack.get(getTop());
			stack.remove(getTop());
		}
		return toRemove;
	}
	
	private int getTop() {
		return stack.size() - 1;
	}
}
