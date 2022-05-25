package structural.Bridge.MultiplatformExample.GUIFramework;

import java.util.HashMap;
import java.util.List;

import structural.Bridge.MultiplatformExample.Model.IForm;
import structural.Bridge.MultiplatformExample.Model.IFrame;
import structural.Bridge.MultiplatformExample.Model.IMenu;
import structural.Bridge.MultiplatformExample.Model.INode;
import structural.Bridge.MultiplatformExample.Model.IWindow;
import structural.Bridge.MultiplatformExample.Model.UIElement;
import structural.Bridge.MultiplatformExample.Model.UINode;

public interface MultiPlatformFramework {
	void render(UIElement uiElement);
	void render(UIElement parent, UIElement child);
	IWindow createWindow(IFrame frame, String title);
	IMenu createMenu(UINode uiElementNode);
	IFrame createFrame(String title, UIElement element);
	IForm createForm(List<HashMap<String, String>> formContext);
	UINode createUITree(INode node);
}
