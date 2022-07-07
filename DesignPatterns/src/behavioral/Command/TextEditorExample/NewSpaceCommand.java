package behavioral.Command.TextEditorExample;

import java.util.ArrayList;
import java.util.List;

public class NewSpaceCommand extends DocCommand {

	private List<Editor> editorsBackup;
	
	public NewSpaceCommand(Application application, Editor editor) {
		super(application, editor, "NEW SPACE");
	}

	@Override
	public boolean execute() throws CloneNotSupportedException {
		saveBackup();
		Editor activeEditor = getApplication().getActiveEditor();
		List<Editor> editors = getApplication().getEditors();
		
		int insertionIndex = Editor.getIndexFromList(activeEditor, editors);
		editors.add(insertionIndex + 1, new Editor(""));
		
		
		//getApplication().setActiveEditor(editors.get(insertionIndex + 1));
		getApplication().executeCommand(new UpdateActiveEditorCommand(getApplication(), editors.get(insertionIndex + 1)));
		return true;
	}

	@Override
	public void undo() {
		Editor activeEditor = getApplication().getActiveEditor();
		List<Editor> editors = getApplication().getEditors();
		int insertionIndex = Editor.getIndexFromList(activeEditor, editors);
		editors.remove(activeEditor);
	}
}
