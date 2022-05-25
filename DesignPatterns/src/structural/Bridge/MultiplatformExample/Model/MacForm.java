package structural.Bridge.MultiplatformExample.Model;

public class MacForm extends UIElement implements IForm {

	@Override
	public void render() {
		System.out.println("Drawing a mac form");
	}
}
