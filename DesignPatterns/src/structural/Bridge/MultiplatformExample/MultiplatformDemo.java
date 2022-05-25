package structural.Bridge.MultiplatformExample;

import structural.Bridge.MultiplatformExample.GUIFramework.LinuxMultiPlatformFramework;
import structural.Bridge.MultiplatformExample.GUIFramework.MacMultiPlatformFramework;
import structural.Bridge.MultiplatformExample.GUIFramework.MultiPlatformFramework;
import structural.Bridge.MultiplatformExample.GUIFramework.WindowsMultiPlatformFramework;
import structural.Bridge.MultiplatformExample.Model.INode;
import structural.Bridge.MultiplatformExample.Model.LinuxFrame;
import structural.Bridge.MultiplatformExample.Model.MacFrame;
import structural.Bridge.MultiplatformExample.Model.MenuNode;
import structural.Bridge.MultiplatformExample.Model.UIElement;
import structural.Bridge.MultiplatformExample.Model.UIElementNode;
import structural.Bridge.MultiplatformExample.Model.UINode;

public class MultiplatformDemo {
	public static void main(String[] args) {
		UIElement linuxUiElement = new LinuxFrame();
		UINode linuxMainTree = new UIElementNode(1, "title 1", linuxUiElement);		
		UIElement macUiElement = new MacFrame();
		UINode macMainTree = new UIElementNode(1, "title 1", macUiElement);
				
		MultiPlatformFramework linux = new LinuxMultiPlatformFramework(linuxMainTree);
		//MultiPlatformFramework windows = new WindowsMultiPlatformFramework();
		MultiPlatformFramework mac = new MacMultiPlatformFramework(macMainTree);
		
		INode appNode10 = new MenuNode(1, "Home", "You can see the main dashboard");
		INode appNode20 = new MenuNode(1, "Home Dashboard", "You can see the main dashboard");
		INode appNode30 = new MenuNode(1, "Start", "You can see the main dashboard");
		
		BaseApplication application10 = new TradingApplication10("TraderPlus 1.0", appNode10, linux);
		BaseApplication application20 = new TradingApplication20("TraderPlus 2.0", appNode20, mac);
		BaseApplication application30 = new TradingApplication30("TraderPlus 3.0", appNode30, linux);		

		application10.start();
		application20.start();
		application30.start();
	}
}
