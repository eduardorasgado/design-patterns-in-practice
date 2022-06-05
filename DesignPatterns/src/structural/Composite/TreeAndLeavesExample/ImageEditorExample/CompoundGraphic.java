package structural.Composite.TreeAndLeavesExample.ImageEditorExample;

import java.util.LinkedList;
import java.util.List;

public class CompoundGraphic implements Graphic {

	private List<Graphic> children;

	public CompoundGraphic() {
		children = new LinkedList<>();
	}

	public void addChild(Graphic child) {
		getChildren().add(child);
	}

	public void getChild(int childIndex) {
		getChildren().get(childIndex);
	}

	public void removeChild(int childIndex) {
		getChildren().remove(childIndex);
	}

	@Override
	public void drag(int x, int y) {
		getChildren().forEach(child -> child.drag(x, y));
	}

	@Override
	public void draw() {
		System.out.println("---------------");
		getChildren().forEach(child -> child.draw());
		System.out.println("---------------");
	}

	private List<Graphic> getChildren() {
		return children;
	}
}
