package behavioral.Command.TextEditorExample;

public class CutCommand extends DocCommand {

	public CutCommand(Application application, Editor editor) {
		super(application, editor);
	}

	@Override
	boolean execute() {
		saveBackup();
		getApplication().setClipboard(getEditor().getSelection());
		getEditor().deleteSelection();
		return true;
	}

}
