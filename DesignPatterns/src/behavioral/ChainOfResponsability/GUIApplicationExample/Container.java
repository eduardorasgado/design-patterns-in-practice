package behavioral.ChainOfResponsability.GUIApplicationExample;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is the composite object
 * @author cheetos
 *
 */
public class Container extends Component {
	private List<Component> children;
	
	public Container() {
		children = new ArrayList<>();
	}
	
	public void addChild(Component child) {
		children.add(child);
		child.setContainer(this);
	}

	@Override
	public void changeTheme(String theme) {
		for(Component child : children) {
			child.changeTheme(theme);
		}
	}	
}
