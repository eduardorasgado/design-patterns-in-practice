package behavioral.Command.TextEditorExample;

public class CopyCommand extends DocCommand {

	public CopyCommand(Application application, Editor editor) {
		super(application, editor);
	}

	@Override
	boolean execute() {
		getApplication().setClipboard(getEditor().getSelection());
		return false;
	}

}
