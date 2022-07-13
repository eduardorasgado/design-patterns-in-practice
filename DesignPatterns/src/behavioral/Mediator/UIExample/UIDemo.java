package behavioral.Mediator.UIExample;

public class UIDemo {
	
	public static void main(String[] args) {
		AuthenticationDialog dialog = new AuthenticationDialog();
		
		Button button = new Button(dialog);
		Textbox textbox = new Textbox(dialog);
		Checkbox checkbox = new Checkbox(dialog);
		
		LayOut layOut = new LayOut();
		
		layOut.appendElement(button);
		layOut.appendElement(textbox);		
		layOut.appendElement(checkbox);
		layOut.appendElement(dialog);
		
		layOut.render();
	}
}
	