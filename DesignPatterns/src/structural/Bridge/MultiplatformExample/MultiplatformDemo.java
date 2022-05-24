package structural.Bridge.MultiplatformExample;

import structural.Bridge.MultiplatformExample.GUIFramework.LinuxMultiPlatformFramework;
import structural.Bridge.MultiplatformExample.GUIFramework.MacMultiPlatformFramework;
import structural.Bridge.MultiplatformExample.GUIFramework.MultiPlatformFramework;
import structural.Bridge.MultiplatformExample.GUIFramework.WindowsMultiPlatformFramework;

public class MultiplatformDemo {
	public static void main(String[] args) {
		MultiPlatformFramework linux = new LinuxMultiPlatformFramework();
		MultiPlatformFramework windows = new WindowsMultiPlatformFramework();
		MultiPlatformFramework mac = new MacMultiPlatformFramework();
		
		BaseApplication application10 = new TradingApplication10("TraderPlus 1.0", null,linux);
		BaseApplication application20 = new TradingApplication20("TraderPlus 2.0", null,windows);
		BaseApplication application30 = new TradingApplication30("TraderPlus 3.0", null,mac);		

		application10.start();
		application20.start();
		application30.start();
	}
}
