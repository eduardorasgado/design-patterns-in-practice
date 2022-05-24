package structural.Bridge.MultiplatformExample.GUIFramework;

import java.util.List;
import java.util.Map;

import structural.Bridge.MultiplatformExample.Model.IForm;
import structural.Bridge.MultiplatformExample.Model.IFrame;
import structural.Bridge.MultiplatformExample.Model.IWindow;
import structural.Bridge.MultiplatformExample.Model.MacWindow;
import structural.Bridge.MultiplatformExample.Model.UIElement;

public class MacMultiPlatformFramework implements MultiPlatformFramework {
	// this could be a class designed with composite pattern
	

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
	public IFrame createFrame(String title, String content) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IForm createForm(List<Map<String, String>> formContext) {
		// TODO Auto-generated method stub
		return null;
	}
}
