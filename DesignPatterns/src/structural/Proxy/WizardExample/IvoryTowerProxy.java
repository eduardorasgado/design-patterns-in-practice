package structural.Proxy.WizardExample;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

import static java.util.Objects.isNull;

public class IvoryTowerProxy implements WizardTower {
	private WizardTower ivoryTower;
	private static Map<TowerType, Supplier<WizardTower>> ivoryTowerProxyMap;
	private static WizardTower instance;
	private static int wizardCount = 0;

	static {
		ivoryTowerProxyMap = new HashMap<>();
		ivoryTowerProxyMap.put(TowerType.PROXY, () -> createIvoryTowerProxy());
		ivoryTowerProxyMap.put(TowerType.ORIGINAL, IvoryTower::new);
	}

	private IvoryTowerProxy(WizardTower ivoryTower) {
		this.ivoryTower = ivoryTower;
	}

	private static WizardTower createIvoryTowerProxy() {
		WizardTower ivoryTower = new IvoryTower();
		return new IvoryTowerProxy(ivoryTower);
	}

	public static WizardTower getInstance() {
		if (isNull(instance)) {
			return getInstance(TowerType.PROXY);
		}
		return instance;
	}

	public static WizardTower getInstance(TowerType towerType) {
		if (isNull(instance) || (!isNull(instance) && instance.getClass() != towerType.getTowerClass())) {
			instance = ivoryTowerProxyMap.get(towerType).get();
		}
		return instance;
	}

	public static void resetInstance() {
		instance = null;
	}

	@Override
	public void enter(Wizard wizard) {
		System.out.println("[Entering into an Ivory proxy Tower]");
		if (wizardCount < 3) {
			ivoryTower.enter(wizard);
			++wizardCount;
		} else {
			System.out.println("[IVORY TOWER IS FULL]");
		}
	}
}
