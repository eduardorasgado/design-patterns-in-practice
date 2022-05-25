package structural.Bridge.MultiplatformExample;

import structural.Bridge.MultiplatformExample.GUIFramework.BaseMultiPlatformFramework;
import structural.Bridge.MultiplatformExample.GUIFramework.MultiPlatformFramework;
import structural.Bridge.MultiplatformExample.Model.IFrame;
import structural.Bridge.MultiplatformExample.Model.IMenu;
import structural.Bridge.MultiplatformExample.Model.INode;
import structural.Bridge.MultiplatformExample.Model.MenuNode;
import structural.Bridge.MultiplatformExample.Model.UIElement;
import structural.Bridge.MultiplatformExample.Model.UIElementNode;
import structural.Bridge.MultiplatformExample.Model.UINode;

public class TradingApplication10 extends BaseApplication {

	public TradingApplication10(String appTitle, INode menuMetadata, MultiPlatformFramework multiPlatformFramework) {
		super(appTitle, menuMetadata, multiPlatformFramework);
	}

	@Override
	public void start() {
		System.out.println("Starting the trading application 1.0");
		MultiPlatformFramework multiPlatformFramework = getMultiPlatformFramework();
		
		UINode uiNode = multiPlatformFramework.createUITree(getMenuMetadata()); 
		UIElement menu = (UIElement) multiPlatformFramework.createMenu(uiNode);
		
		// get title out of menu.getMenuHierarchy()
		IFrame menuFrame = multiPlatformFramework.createFrame(getAppTitle(), menu);
		multiPlatformFramework.createWindow(menuFrame, buildTitle(getAppTitle()));
		
		multiPlatformFramework
		.render(((UIElementNode) ((BaseMultiPlatformFramework) multiPlatformFramework).getAppElements())
				.getUiElement());
	}
	
	public String buildTitle(String title) {
		return "-------------" + title + "-----------------";
	}
}
