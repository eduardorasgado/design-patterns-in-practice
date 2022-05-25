package structural.Bridge.MultiplatformExample.Model;

public class MacMenu extends UIElement implements IMenu {
	private UINode node;
	
	public MacMenu(UINode node) {
		this.node = node;
	}
	
	@Override
	public UINode getMenuHierarchy() {
		// doing some changes to return a uiElementNode mac style
		return node;
	}

	@Override
	public void render() {
		// TODO Auto-generated method stub
	}
}
