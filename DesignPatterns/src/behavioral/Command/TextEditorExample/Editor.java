package behavioral.Command.TextEditorExample;

import java.util.List;

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

	public static int getIndexFromList(Editor editor, List<Editor> editors) {
		int index = -1;
		if(editors.contains(editor)) {
			for(int i = 0; i <= editors.size(); i++) {
				if(editors.get(i).equals(editor)) {
					index = i;
					break;
				}
			}
		}
		return index;
	}

	@Override
	protected Editor clone() throws CloneNotSupportedException {
		return new Editor(content);
	}
}
