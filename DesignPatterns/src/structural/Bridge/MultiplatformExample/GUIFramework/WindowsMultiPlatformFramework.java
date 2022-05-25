package structural.Bridge.MultiplatformExample.GUIFramework;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import structural.Bridge.MultiplatformExample.Model.IForm;
import structural.Bridge.MultiplatformExample.Model.IFrame;
import structural.Bridge.MultiplatformExample.Model.IMenu;
import structural.Bridge.MultiplatformExample.Model.INode;
import structural.Bridge.MultiplatformExample.Model.IWindow;
import structural.Bridge.MultiplatformExample.Model.UIElement;
import structural.Bridge.MultiplatformExample.Model.UIElementNode;
import structural.Bridge.MultiplatformExample.Model.UINode;

public class WindowsMultiPlatformFramework extends BaseMultiPlatformFramework implements MultiPlatformFramework {

	public WindowsMultiPlatformFramework(UINode appElements) {
		super(appElements);
	}
	
	@Override
	public void render(UIElement uiElement) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render(UIElement parent, UIElement child) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public IWindow createWindow(IFrame frame, String title) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IMenu createMenu(UINode uiElementNode) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IFrame createFrame(String title, UIElement element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IForm createForm(List<HashMap<String, String>> formContext) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UINode createUITree(INode node) {
		// TODO Auto-generated method stub
		return null;
	}	
}
