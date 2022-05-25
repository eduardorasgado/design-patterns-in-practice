package structural.Bridge.MultiplatformExample.Model;

import java.util.LinkedList;
import java.util.List;

public class UIElementNode implements UINode {
	
	// these three can be encapsulated as an IData interface
	private int id;
	private String name;
	private UIElement uiElement;
	
	private UINode parent;
	private List<UINode> children;

	public UIElementNode(int id, String name, UIElement uiElement) {
		super();
		this.id = id;
		this.name = name;
		this.uiElement = uiElement;
		children = new LinkedList<>();
	}

	@Override
	public UINode getParent() {
		return parent;
	}

	@Override
	public void setParent(UINode parent) {
		this.parent = parent;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public UIElement getUiElement() {
		return uiElement;
	}

	@Override
	public List<UINode> getChildren() {
		return children;
	}

	@Override
	public void addChild(UINode child) {
		children.add(child);
		child.setParent(this);
	}
}
