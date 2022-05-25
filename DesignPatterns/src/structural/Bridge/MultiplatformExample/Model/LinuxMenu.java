package structural.Bridge.MultiplatformExample.Model;

public class LinuxMenu extends UIElement implements IMenu {
	private UINode node;
	
	public LinuxMenu(UINode node) {
		super();
		this.node = node;
	}

	@Override
	public UINode getMenuHierarchy() {
		// doing some changes to return a uiElementNode linux sttyle
		return node;
	}

	@Override
	public void render() {
		// TODO Auto-generated method stub
	}
}
