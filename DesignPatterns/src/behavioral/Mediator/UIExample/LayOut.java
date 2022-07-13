package behavioral.Mediator.UIExample;

import java.util.ArrayList;
import java.util.List;

public class LayOut implements LayoutElement {
	private List<LayoutElement> elements;
	
	
	public LayOut() {
		this.elements = new ArrayList<>();
	}

	public void appendElement(LayoutElement element) {
		if(!elements.contains(element)) {
			elements.add(element);
		}
	}

	@Override
	public void render() {
		for(LayoutElement element : elements) {
			element.render();
		}
		
		// interact with components here (to make dialog works)
	}	
}
