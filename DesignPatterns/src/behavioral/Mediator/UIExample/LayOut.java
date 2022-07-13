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
		
		System.out.println("---------------");
		
		// interact with components here (to make dialog works)
		((Checkbox) elements.get(0)).check();
		
		for(LayoutElement element : elements) {
			element.render();
		}
		
		System.out.println("---------------");
		
		// interact with components here (to make dialog works)
		((Checkbox) elements.get(0)).check();
		
		for(LayoutElement element : elements) {
			element.render();
		}
		
		((Button) elements.get(7)).click();
		
		System.out.println("---------------");
		
		// interact with components here (to make dialog works)
		((Checkbox) elements.get(0)).check();
				
		for(LayoutElement element : elements) {
			element.render();
		}
		
		((Button) elements.get(7)).click();
	}
}
