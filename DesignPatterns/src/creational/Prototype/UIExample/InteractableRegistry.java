package creational.Prototype.UIExample;

import java.util.HashMap;
import java.util.Map;

public class InteractableRegistry {
	private Map<InteractableType, Map<String, Interactable>> items;

	public InteractableRegistry() {
		items = new HashMap<>();
		populateItemTypes();
	}

	private void populateItemTypes() {
		items.put(InteractableType.BUTTON, new HashMap<>());
		items.put(InteractableType.CHECKBOX, new HashMap<>());
	}

	public void addItem(InteractableType itemType, Interactable item, String itemTag) {
		try {
			Map<String, Interactable> specificItems = getItemsByType(itemType);
			specificItems.put(itemTag, item);
		} catch (IllegalArgumentException ex) {
			System.out.println("Ilegal item type. Item was not added");
		}
	}

	public Interactable getItemByTag(InteractableType itemType, String itemTag) throws IllegalArgumentException{
			Map<String, Interactable> specificItems = getItemsByType(itemType);
			return specificItems.get(itemTag).clone();
	}

	private Map<String, Interactable> getItemsByType(InteractableType itemType) throws IllegalArgumentException {
		return items.get(itemType);
	}
}
