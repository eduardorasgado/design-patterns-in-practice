package structural.Composite.TreeAndLeavesExample;

import java.util.LinkedList;
import java.util.List;

public class Branch implements LifeProvider {

	private List<LifeProvider> children;
	
	public Branch() {
		children = new LinkedList<>();
	}
	
	@Override
	public void provide(Chemical chemical) {
		children.forEach(child -> child.provide(chemical));
	}
	
	public void addChild(LifeProvider child) {
		children.add(child);
	}
	
	public void removeChild(int childIndex) {
		if(childIndex < children.size()) {
			children.remove(childIndex);
		}
	}

	public List<LifeProvider> getChildren() {
		return children;
	}
}
