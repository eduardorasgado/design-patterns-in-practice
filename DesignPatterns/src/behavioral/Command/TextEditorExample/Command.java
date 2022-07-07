package behavioral.Command.TextEditorExample;

public interface Command {
	
	boolean execute() throws CloneNotSupportedException;

	void undo();

	void saveBackup() throws CloneNotSupportedException;
}
