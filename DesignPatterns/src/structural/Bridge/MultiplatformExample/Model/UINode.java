package structural.Bridge.MultiplatformExample.Model;

import java.util.List;

public interface UINode {
	
	public UINode getParent();

	public void setParent(UINode parent);

	public List<UINode> getChildren();

	public void addChild(UINode child);
}
