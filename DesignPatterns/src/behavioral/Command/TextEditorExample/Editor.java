package behavioral.Command.TextEditorExample;

public class Editor {
	private String content;
	
	public Editor(String content) {
		this.content = content;
	}
	
	public void replaceSelection(String newContent) {
		content = newContent;
	}
	
	public void deleteSelection() {
		content = "";
	}
	
	public String getSelection() {
		return content;
	}
}
