package behavioral.Command.TextEditorExample;

public abstract class DocCommand extends BaseCommand {
	private Editor editor;
	private String backup;
	
	public DocCommand(Application application, Editor editor, String commandName) {
		super(commandName, application);
		this.editor = editor;
		
	}
	
	@Override
	public void undo() {
		super.undo();
		editor.replaceSelection(backup);
	}
	
	@Override
	public void saveBackup() throws CloneNotSupportedException {
		backup = editor.getSelection();
	}

	public Editor getEditor() {
		return editor;
	}

	
}
