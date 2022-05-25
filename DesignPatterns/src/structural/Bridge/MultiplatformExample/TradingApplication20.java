package structural.Bridge.MultiplatformExample;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import structural.Bridge.MultiplatformExample.GUIFramework.BaseMultiPlatformFramework;
import structural.Bridge.MultiplatformExample.GUIFramework.MultiPlatformFramework;
import structural.Bridge.MultiplatformExample.Model.IFrame;
import structural.Bridge.MultiplatformExample.Model.INode;
import structural.Bridge.MultiplatformExample.Model.MenuNode;
import structural.Bridge.MultiplatformExample.Model.UIElement;
import structural.Bridge.MultiplatformExample.Model.UIElementNode;
import structural.Bridge.MultiplatformExample.Model.UINode;

public class TradingApplication20 extends BaseApplication {

	public TradingApplication20(String appTitle, INode menuMetadata, MultiPlatformFramework multiPlatformFramework) {
		super(appTitle, menuMetadata, multiPlatformFramework);
	}

	@Override
	public void start() {
		System.out.println("Starting the trading application 2.0");

		MultiPlatformFramework multiPlatformFramework = getMultiPlatformFramework();

		UINode uiNode = multiPlatformFramework.createUITree(getMenuMetadata());
		UIElement menu = (UIElement) multiPlatformFramework.createMenu(uiNode);

		List<HashMap<String, String>> loginDataMap = getLoginFormRequiredDataMapList();
		UIElement loginForm = (UIElement) multiPlatformFramework.createForm(loginDataMap);

		// get title out of menu.getMenuHierarchy()
		IFrame menuFrame = multiPlatformFramework.createFrame(getAppTitle(), menu);
		menuFrame.addUIElement(loginForm);

		multiPlatformFramework.createWindow(menuFrame, getAppTitle());
		
		// I know, this smells really bad, im still learning ok? :)
		multiPlatformFramework
				.render(((UIElementNode) ((BaseMultiPlatformFramework) multiPlatformFramework).getAppElements())
						.getUiElement());
	}

	private ArrayList<HashMap<String, String>> getLoginFormRequiredDataMapList() {
		ArrayList<HashMap<String, String>> formDataMap = new ArrayList<HashMap<String, String>>();
		return formDataMap;
	}
}
