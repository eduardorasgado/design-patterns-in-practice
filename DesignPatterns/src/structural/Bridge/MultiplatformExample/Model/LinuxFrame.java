package structural.Bridge.MultiplatformExample.Model;

public class LinuxFrame extends UIElement implements IFrame{

	@Override
	public void render() {
		System.out.println("Drawing a mac frame");
	}

	@Override
	public void addUIElement(UINode node) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addUIElement(UIElement node) {
		// TODO Auto-generated method stub
		
	}
}
