package behavioral.Command.TextEditorExample;

public class UpdateActiveEditorCommand extends BaseCommand {
	private Editor newActiveEditor;
	private Editor lastEditorBackup;

	public UpdateActiveEditorCommand(Application application, Editor newActiveEditor)
			throws CloneNotSupportedException {
		super("UPDATE ACTIVE EDITOR", application);
		this.newActiveEditor = newActiveEditor;
		saveBackup();
	}

	@Override
	public boolean execute() throws CloneNotSupportedException {
		getApplication().setActiveEditor(newActiveEditor);
		return true;
	}

	@Override
	public void undo() {
		super.undo();
		getApplication().setActiveEditor(lastEditorBackup);
	}

	@Override
	public void saveBackup() throws CloneNotSupportedException {
		lastEditorBackup = getApplication().getActiveEditor();
	}
}
