package structural.Bridge.MultiplatformExample.Model;

import java.util.LinkedList;
import java.util.List;

public class MenuNode implements INode {
	// these 3 elements can be added as IData
	private int level;
	private String name;
	private String descriptor;
	
	private INode parent;
	private List<INode> children;

	public MenuNode(int level, String name, String descriptor) {
		super();
		this.level = level;
		this.name = name;
		this.descriptor = descriptor;
		this.children = new LinkedList<>();
	}

	public int getLevel() {
		return level;
	}

	public String getName() {
		return name;
	}

	public String getDescriptor() {
		return descriptor;
	}

	@Override
	public INode getParent() {
		return parent;
	}

	@Override
	public void setParent(INode parent) {
		this.parent = parent;
	}

	@Override
	public List<INode> getChildren() {
		return children;
	};

	@Override
	public void addChild(INode child) {
		children.add(child);
		child.setParent(this);
	}
}
