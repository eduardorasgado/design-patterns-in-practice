package structural.Bridge.MultiplatformExample;

import structural.Bridge.MultiplatformExample.GUIFramework.MultiPlatformFramework;
import structural.Bridge.MultiplatformExample.Model.INode;
import structural.Bridge.MultiplatformExample.Model.MenuNode;
import structural.Bridge.MultiplatformExample.Model.UIElementNode;

public abstract class BaseApplication {
	private String appTitle;
	private INode menuMetadata;
	private MultiPlatformFramework multiPlatformFramework;

	public BaseApplication(String appTitle, INode menuMetadata, MultiPlatformFramework multiPlatformFramework) {
		this.appTitle = appTitle;
		this.menuMetadata = menuMetadata;
		this.multiPlatformFramework = multiPlatformFramework;
	}

	public abstract void start();

	public String getAppTitle() {
		return appTitle;
	}

	public MultiPlatformFramework getMultiPlatformFramework() {
		return multiPlatformFramework;
	}

	public INode getMenuMetadata() {
		return menuMetadata;
	}
}
