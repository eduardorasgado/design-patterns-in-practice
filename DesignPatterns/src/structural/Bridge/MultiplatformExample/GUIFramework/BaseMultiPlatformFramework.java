package structural.Bridge.MultiplatformExample.GUIFramework;

import structural.Bridge.MultiplatformExample.Model.UIElementNode;
import structural.Bridge.MultiplatformExample.Model.UINode;

public class BaseMultiPlatformFramework {
	private UINode appElements;

	public BaseMultiPlatformFramework(UINode appElements) {
		this.appElements = appElements;
	}


	public UINode getAppElements() {
		return appElements;
	}
}
