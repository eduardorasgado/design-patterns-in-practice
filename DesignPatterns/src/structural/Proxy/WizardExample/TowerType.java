package structural.Proxy.WizardExample;


public enum TowerType {
	PROXY(IvoryTowerProxy.class), ORIGINAL(IvoryTower.class);
	
	private Class<?> towerClass;

	private TowerType(Class<?> towerClass) {
		this.towerClass = towerClass;
	}

	public Class<?> getTowerClass() {
		return towerClass;
	}
}
