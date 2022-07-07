package behavioral.Command.TextEditorExample;

public class PasteCommand extends DocCommand {

	public PasteCommand(Application application, Editor editor) {
		super(application, editor, "PASTE");
	}

	@Override
	public boolean execute() throws CloneNotSupportedException {
		if(getApplication().getClipboard() != null) {
			saveBackup();
			getEditor().replaceSelection(getApplication().getClipboard());
			return true;
		}
		return false;
	}

}
