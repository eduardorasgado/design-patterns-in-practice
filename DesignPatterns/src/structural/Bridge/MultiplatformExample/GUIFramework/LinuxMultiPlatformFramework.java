package structural.Bridge.MultiplatformExample.GUIFramework;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import structural.Bridge.MultiplatformExample.Model.IForm;
import structural.Bridge.MultiplatformExample.Model.IFrame;
import structural.Bridge.MultiplatformExample.Model.IMenu;
import structural.Bridge.MultiplatformExample.Model.INode;
import structural.Bridge.MultiplatformExample.Model.IWindow;
import structural.Bridge.MultiplatformExample.Model.LinuxForm;
import structural.Bridge.MultiplatformExample.Model.LinuxFrame;
import structural.Bridge.MultiplatformExample.Model.LinuxMenu;
import structural.Bridge.MultiplatformExample.Model.LinuxWindow;
import structural.Bridge.MultiplatformExample.Model.MacFrame;
import structural.Bridge.MultiplatformExample.Model.UIElement;
import structural.Bridge.MultiplatformExample.Model.UIElementNode;
import structural.Bridge.MultiplatformExample.Model.UINode;

public class LinuxMultiPlatformFramework extends BaseMultiPlatformFramework implements MultiPlatformFramework {
	
	public LinuxMultiPlatformFramework(UINode appElements) {
		super(appElements);
	}
	
	@Override
	public void render(UIElement uiElement) {
		System.out.println("rendering a single uielement for linux");
	}

	@Override
	public void render(UIElement parent, UIElement child) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public IWindow createWindow(IFrame frame, String title) {
		// TODO Auto-generated method stub
		return new LinuxWindow();
	}

	@Override
	public IMenu createMenu(UINode uiElementNode) {
		return new LinuxMenu(uiElementNode);
	}

	@Override
	public IFrame createFrame(String title, UIElement element) {
		// TODO Auto-generated method stub
		return new LinuxFrame();
	}

	@Override
	public IForm createForm(List<HashMap<String, String>> formContext) {
		// TODO Auto-generated method stub
		return new LinuxForm();
	}

	@Override
	public UINode createUITree(INode node) {
		// TODO: this shouldnt be a macframe, should be something that comes from INodeTpe?
		UIElement uiElement = new LinuxFrame();
		return new UIElementNode(1, "title 1", uiElement);
	}
}
