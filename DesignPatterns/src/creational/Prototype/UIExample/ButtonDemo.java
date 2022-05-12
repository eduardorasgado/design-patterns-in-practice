package creational.Prototype.UIExample;

import java.util.ArrayList;
import java.util.List;

public class ButtonDemo {
	public static void main(String[] args) {
		ArrayList<Interactable> uiElements = new ArrayList<>();
		
		Button uiElement = new Button(104, 105);
		Style style = uiElement.getStyle();
		style.setColor("Orange");
		uiElement.setStyle(style);
		
		uiElements.add(uiElement);
		
		uiElements.add(uiElement.clone());
		
		startInteractionWithElements(uiElements);
	}
	
	public static void startInteractionWithElements(List<Interactable> uiElements) {
		uiElements.forEach(uiElement -> uiElement.startInteraction());
	}
}
