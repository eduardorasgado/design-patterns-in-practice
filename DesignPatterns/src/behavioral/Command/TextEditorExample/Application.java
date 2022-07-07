package behavioral.Command.TextEditorExample;

import java.util.ArrayList;
import java.util.List;

public class Application {
	private Shortcuts shorcuts;

	private Button copyButton;
	private Button cutButton;
	private Button pasteButton;
	private Button tabButton;
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

		Runnable newSpace = () -> {
			executeCommand(new NewSpaceCommand(this, getActiveEditor()));
		};

		Runnable undo = () -> {
			undo();
		};

		copyButton.setCommand(copy);
		cutButton.setCommand(cut);
		pasteButton.setCommand(paste);
		tabButton.setCommand(newSpace);
		undoButton.setCommand(undo);
	}

	private void initializeButtons() {
		copyButton = new Button("Copy");
		cutButton = new Button("Cut");
		pasteButton = new Button("Paste");
		undoButton = new Button("Undo");
		tabButton = new Button("Space");
	}

	protected void executeCommand(Command docCommand) {
		try {
			if (docCommand.execute()) {
				history.push(docCommand);
			}
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
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

	public List<Editor> getEditors() {
		return editors;
	}

	public void interact() {
		Editor editor1 = new Editor("This is a text editor!");
		editors.add(editor1);

		Editor editor2 = new Editor("What a wonderful world!");
		editors.add(editor2);

		Editor editor3 = new Editor("Its my life.");
		editors.add(editor3);

		activeEditor = editor2;

		System.out.println("Creation time");
		generateDocument();

		cutButton.onClick();

		System.out.println("Cut time");
		generateDocument();

		activeEditor = getEditors().get(getEditors().size() - 1);

		tabButton.onClick();

		System.out.println("space time");
		generateDocument();

		pasteButton.onClick();

		System.out.println("pasting...");
		generateDocument();

		activeEditor = editor1;

		copyButton.onClick();

		System.out.println("copying...");
		generateDocument();

		activeEditor = getEditors().get(getEditors().size() - 1);

		tabButton.onClick();

		System.out.println("new tab!");
		generateDocument();

		pasteButton.onClick();

		System.out.println("Pasting!!!");
		generateDocument();

		System.out.println("!undoing!");
		for (int i = 0; i < 7; i++) {
			undoButton.onClick();
			generateDocument();
		}
	}

	private void generateDocument() {
		System.out.println("------------------------");
		for (Editor editor : editors) {
			System.out.println(editor.getSelection());
		}
		System.out.println("------------------------ active line: " + " ["
				+ Editor.getIndexFromList(getActiveEditor(), getEditors()) + "]" + getActiveEditor().getSelection());
	}

	public void setEditors(List<Editor> editorsBackup) {
		editors = editorsBackup;
	}
}
