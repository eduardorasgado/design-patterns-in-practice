package behavioral.Command.TextEditorExample;

public class UndoCommand extends DocCommand {

	public UndoCommand(Application application, Editor editor) {
		super(application, editor);
	}

	@Override
	boolean execute() {
		DocCommand command = getApplication().getHistory().pop();
		command.undo();
		return false;
	}

}
