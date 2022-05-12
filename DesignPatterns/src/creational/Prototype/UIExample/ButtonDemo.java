package creational.Prototype.UIExample;

import java.util.ArrayList;
import java.util.List;

public class ButtonDemo {
	public static void main(String[] args) {
		InteractableRegistry registry = new InteractableRegistry();

		String ORANGE_COLOR = "Orange";
		String YELLOW_COLOR = "Yellow";
		String GREEN_COLOR = "Green";
		
		Button warningButton = new Button(100, 100);
		Style warningStyle = warningButton.getStyle();
		warningStyle.setColor(ORANGE_COLOR);
		warningButton.setStyle(warningStyle);
		
		Button preventButton = new Button(50, 50);
		Style preventStyle = preventButton.getStyle();
		preventStyle.setColor(YELLOW_COLOR);
		preventButton.setStyle(preventStyle);

		Button successButton = new Button(60, 60);
		Style successStyle = successButton.getStyle();
		successStyle.setColor(GREEN_COLOR);
		successButton.setStyle(successStyle);

		registry.addItem(InteractableType.BUTTON, warningButton, ORANGE_COLOR);
		registry.addItem(InteractableType.BUTTON, preventButton, YELLOW_COLOR);
		registry.addItem(InteractableType.BUTTON, successButton, GREEN_COLOR);
		
		ArrayList<Clickable> uiElements = new ArrayList<>();
		
		uiElements.add((Clickable) registry.getItemByTag(InteractableType.BUTTON, ORANGE_COLOR));
		uiElements.add((Clickable) registry.getItemByTag(InteractableType.BUTTON, YELLOW_COLOR));
		uiElements.add((Clickable) registry.getItemByTag(InteractableType.BUTTON, GREEN_COLOR));
		
		uiElements.forEach(uiElement -> 
			System.out.println(
					uiElement == registry.getItemByTag(InteractableType.BUTTON, ((Button) uiElement).getStyle().getColor())
					)
			);

		interactAllClickables(uiElements, ClickableInteractionType.PRESSED);
	}

	public static void interactAllClickables(List<Clickable> uiElements, ClickableInteractionType type) {
		uiElements.forEach(uiElement -> {
			uiElement.startInteraction();
			uiElement.interact(type);
		});
	}
}
