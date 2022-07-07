package behavioral.Command.TextEditorExample;

public class CutCommand extends DocCommand {

	public CutCommand(Application application, Editor editor) {
		super(application, editor, "CUT");
	}

	@Override
	boolean execute() throws CloneNotSupportedException {
		saveBackup();
		getApplication().setClipboard(getEditor().getSelection());
		getEditor().deleteSelection();
		return true;
	}

}
