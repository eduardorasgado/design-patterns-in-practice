package behavioral.Command.TextEditorExample;

public abstract class DocCommand {
	private Application application;
	private Editor editor;
	private String backup;
	
	public DocCommand(Application application, Editor editor) {
		this.application = application;
		this.editor = editor;
	}

	abstract boolean execute();
	public void undo() {
		editor.replaceSelection(backup);
	}
	
	public void saveBackup() {
		backup = editor.getSelection();
	}

	public Application getApplication() {
		return application;
	}

	public Editor getEditor() {
		return editor;
	}
}
