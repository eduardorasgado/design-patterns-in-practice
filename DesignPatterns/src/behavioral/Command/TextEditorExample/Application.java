package behavioral.Command.TextEditorExample;

import java.util.ArrayList;
import java.util.List;

public class Application {
	private Shortcuts shorcuts;
	
	private Button copyButton;
	private Button cutButton;
	private Button pasteButton;
	private Button undoButton;
	
	private String clipboard;
	private CommandHistory history;
	private List<Editor> editors;
	private Editor activeEditor;
	
	public Application() {
		editors = new ArrayList<>();
		history = new CommandHistory();
	}
	
	public void createUI() {
		initializeButtons();
		
		Runnable copy = () -> {
			executeCommand(new CopyCommand(this, getActiveEditor()));
		};
		
		Runnable cut = () -> {
			executeCommand(new CutCommand(this, getActiveEditor()));
		};
		
		Runnable paste = () -> {
			executeCommand(new PasteCommand(this, getActiveEditor()));
		};
		
		Runnable undo = () -> {
			undo();
		};

		copyButton.setCommand(copy);
		cutButton.setCommand(cut);
		pasteButton.setCommand(paste);
		undoButton.setCommand(undo);
	}
	
	private void initializeButtons() {
		copyButton = new Button("Copy");
		cutButton = new Button("Cut");
		pasteButton = new Button("Paste");
		undoButton = new Button("Undo");
	}

	protected void executeCommand(DocCommand docCommand) {
		if(docCommand.execute()) {
			history.push(docCommand);
		}
	}
	
	public void undo() {
		executeCommand(new UndoCommand(this, activeEditor));
	}

	public String getClipboard() {
		return clipboard;
	}

	public void setClipboard(String clipboard) {
		this.clipboard = clipboard;
	}

	public Editor getActiveEditor() {
		return activeEditor;
	}

	public void setActiveEditor(Editor activeEditor) {
		this.activeEditor = activeEditor;
	}

	public CommandHistory getHistory() {
		return history;
	}
	
	public void interact() {
		Editor editor1 = new Editor("This is a text editor!");
		editors.add(editor1);
		
		Editor editor2 = new Editor("What a wonderful world!");
		editors.add(editor2);
		
		Editor editor3 = new Editor("Its my life.");
		editors.add(editor3);
		
		activeEditor = editor2;
		
		generateDocument();
		
		cutButton.onClick();
		
		generateDocument();
		
		Editor editor4 = new Editor("");
		editors.add(editor4);
		
		generateDocument();
		
		activeEditor = editor4;
		
		pasteButton.onClick();
		
		generateDocument();
		
		activeEditor = editor1;
		
		copyButton.onClick();
		
		generateDocument();
		
		Editor editor5 = new Editor("");
		editors.add(editor5);
		
		activeEditor = editor5;
		
		generateDocument();
		
		pasteButton.onClick();
		
		
		generateDocument();
		
		undoButton.onClick();
		
		generateDocument();
		
		undoButton.onClick();
		
		generateDocument();
	}
	
	private void generateDocument() {
		System.out.println("------------------------");
		for(Editor editor : editors) {
			System.out.println(editor.getSelection());
		}
		System.out.print("------------------------");
	}
}
