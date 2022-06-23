package structural.Proxy.WizardExample;

public class WizardDemo {
	public static void main(String[] args) {
		WizardTower tower = IvoryTowerProxy.getInstance(TowerType.PROXY);
		
		String[] wizards = new String[] {"Gandalf", "Radagast", "Saruman", "Alatar", "Albus", "Atlantes"};
		
		putWizardsInTower(tower, wizards);
		
		System.out.println("--------------");
		
		//tower = IvoryTowerProxy.getInstance();
		tower = IvoryTowerProxy.getInstance(TowerType.ORIGINAL);
		tower.enter(new Wizard("Gargamel"));
	}
	
	public static void putWizardsInTower(WizardTower tower, String[] names) {
		for(String name : names) {
			putWizardsInTower(tower, new Wizard(name));
		}
	}
	
	public static void putWizardsInTower(WizardTower tower, Wizard wizard) {
		tower.enter(wizard);
	}
}
