package structural.Bridge.MultiplatformExample;

import java.util.List;

import structural.Bridge.MultiplatformExample.GUIFramework.MultiPlatformFramework;
import structural.Bridge.MultiplatformExample.Model.INode;
import structural.Bridge.MultiplatformExample.Model.MenuNode;

public class TradingApplication30 extends BaseApplication {

	public TradingApplication30(String appTitle, INode menuMetadata, MultiPlatformFramework multiPlatformFramework) {
		super(appTitle, menuMetadata, multiPlatformFramework);
	}

	@Override
	public void start() {
		System.out.println("Starting the trading application 3.0");
	}
}
