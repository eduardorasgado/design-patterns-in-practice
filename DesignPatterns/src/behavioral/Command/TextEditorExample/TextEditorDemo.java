package behavioral.Command.TextEditorExample;

/**
 * @author cheetos
 *
 */
public class TextEditorDemo {
	public static void main(String[] args) {
		Application textApplication = new Application();
		textApplication.createUI();
		textApplication.interact();
	}
}