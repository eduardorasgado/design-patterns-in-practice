package structural.Bridge.MultiplatformExample.GUIFramework;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import structural.Bridge.MultiplatformExample.Model.IForm;
import structural.Bridge.MultiplatformExample.Model.IFrame;
import structural.Bridge.MultiplatformExample.Model.IMenu;
import structural.Bridge.MultiplatformExample.Model.INode;
import structural.Bridge.MultiplatformExample.Model.IWindow;
import structural.Bridge.MultiplatformExample.Model.MacForm;
import structural.Bridge.MultiplatformExample.Model.MacFrame;
import structural.Bridge.MultiplatformExample.Model.MacMenu;
import structural.Bridge.MultiplatformExample.Model.MacWindow;
import structural.Bridge.MultiplatformExample.Model.UIElement;
import structural.Bridge.MultiplatformExample.Model.UIElementNode;
import structural.Bridge.MultiplatformExample.Model.UINode;

public class MacMultiPlatformFramework extends BaseMultiPlatformFramework implements MultiPlatformFramework {	
	
	public MacMultiPlatformFramework(UINode appElements) {
		super(appElements);
	}

	@Override
	public void render(UIElement uiElement) {
		System.out.println("rendering a single uielement for mac");	
	}

	@Override
	public void render(UIElement parent, UIElement child) {
		// TODO Auto-generated method stub
		System.out.println("rendering");
		
	}

	@Override
	public IWindow createWindow(IFrame frame, String title) {
		// TODO Auto-generated method stub
		return new MacWindow();
	}

	@Override
	public IMenu createMenu(UINode uiElementNode) {
		// TODO Auto-generated method stub
		return new MacMenu(uiElementNode);
	}

	@Override
	public IFrame createFrame(String title, UIElement element) {
		// TODO Auto-generated method stub
		return new MacFrame();
	}

	@Override
	public IForm createForm(List<HashMap<String, String>> formContext) {
		// TODO Auto-generated method stub
		return new MacForm();
	}

	@Override
	public UINode createUITree(INode node) {
		// TODO: this shouldnt be a macframe, should be something that comes from INodeTpe?
		UIElement uiElement = new MacFrame();
		return new UIElementNode(1, "title 1", uiElement);
	}
}
