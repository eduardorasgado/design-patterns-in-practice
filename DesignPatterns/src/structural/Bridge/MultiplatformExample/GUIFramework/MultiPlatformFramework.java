package structural.Bridge.MultiplatformExample.GUIFramework;

import java.util.List;
import java.util.Map;

import structural.Bridge.MultiplatformExample.Model.IForm;
import structural.Bridge.MultiplatformExample.Model.IFrame;
import structural.Bridge.MultiplatformExample.Model.IWindow;
import structural.Bridge.MultiplatformExample.Model.UIElement;

public interface MultiPlatformFramework {
	void render(UIElement uiElement);
	void render(UIElement parent, UIElement child);
	IWindow createWindow(IFrame frame, String title);
	IFrame createFrame(String title, String content);
	IForm createForm(List<Map<String, String>> formContext);
}
