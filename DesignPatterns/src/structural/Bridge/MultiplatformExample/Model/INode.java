package structural.Bridge.MultiplatformExample.Model;

import java.util.List;

public interface INode {
	public INode getParent();

	public void setParent(INode parent);

	public List<INode> getChildren();

	public void addChild(INode child);
	
	// create a method to retreive important data is stored in every node
}
