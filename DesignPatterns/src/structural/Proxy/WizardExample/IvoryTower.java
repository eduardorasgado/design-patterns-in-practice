package structural.Proxy.WizardExample;

public class IvoryTower implements WizardTower {

	@Override
	public void enter(Wizard wizard) {
		System.out.println("Wizard " + wizard.getName() + " is entering into an Ivory Tower]");
	}
}
