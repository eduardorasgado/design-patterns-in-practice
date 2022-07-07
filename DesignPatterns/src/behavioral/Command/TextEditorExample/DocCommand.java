package behavioral.Command.TextEditorExample;

public abstract class DocCommand {
	private Application application;
	private Editor editor;
	private String backup;
	private String commandName;
	
	public DocCommand(Application application, Editor editor, String commandName) {
		this.application = application;
		this.editor = editor;
		this.commandName = commandName;
	}

	abstract boolean execute() throws CloneNotSupportedException;
	
	public void undo() {
		System.out.print(commandName);
		editor.replaceSelection(backup);
	}
	
	public void saveBackup() throws CloneNotSupportedException {
		backup = editor.getSelection();
	}

	public Application getApplication() {
		return application;
	}

	public Editor getEditor() {
		return editor;
	}

	public String getCommandName() {
		return commandName;
	}
}
