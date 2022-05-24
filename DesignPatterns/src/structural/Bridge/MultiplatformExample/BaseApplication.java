package structural.Bridge.MultiplatformExample;

import java.util.List;

import structural.Bridge.MultiplatformExample.GUIFramework.MultiPlatformFramework;

public abstract class BaseApplication {
	private String title;
	private List<String> menuItems;
	private MultiPlatformFramework multiPlatformFramework;

	public BaseApplication(String title, List<String> menuItems, MultiPlatformFramework multiPlatformFramework) {
		this.title = title;
		this.menuItems = menuItems;
		this.multiPlatformFramework = multiPlatformFramework;
	}
	
	public abstract void start();

	public String getTitle() {
		return title;
	}

	public List<String> getMenuItems() {
		return menuItems;
	}

	public MultiPlatformFramework getMultiPlatformFramework() {
		return multiPlatformFramework;
	}
}
