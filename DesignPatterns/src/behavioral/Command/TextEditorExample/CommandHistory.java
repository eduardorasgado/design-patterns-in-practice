package behavioral.Command.TextEditorExample;

import java.util.ArrayList;
import java.util.List;

public class CommandHistory {
	List<DocCommand> stack;
	
	public CommandHistory() {
		stack = new ArrayList<>();
	}

	public void push(DocCommand docCommand) {
		stack.add(docCommand);
	}
	
	public DocCommand pop() {
		DocCommand toRemove = null;
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
