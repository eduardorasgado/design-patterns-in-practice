package structural.Decorator.RPGExample;

public class RPGDemo {
	public static void main(String[] args) {
		CharacterVestment warriorBase = new WarriorBase();
		CharacterVestment warriorBronzeBoots = new WarriorBronzeBoots(warriorBase);
		CharacterVestment warriorPlateGloves = new WarriorPlateGloves(warriorBronzeBoots);
		CharacterVestment  warriorLeatherArmor = new WarriorLeatherArmor(warriorPlateGloves);
		CharacterVestment warriorPlateHelm = new WarriorPlateHelm(warriorLeatherArmor);
		
		CharacterVestment wizardBase = new WizardBase();
		CharacterVestment  wizardSphinxBoots = new WizardSphinxBoots(wizardBase);
		CharacterVestment  wizardLeatherPants = new WizardLeatherPants(wizardSphinxBoots);
		CharacterVestment  wizardHyperionArmor = new WizardHyperionPad(wizardLeatherPants);
		
		RPGCharacter warrior = new Warrior(warriorPlateHelm);
		RPGCharacter wizard = new Wizard(wizardHyperionArmor);
		
		System.out.println(wizard.getLifePoints());
		warrior.attack(wizard);
		System.out.println(wizard.getLifePoints());
	}
}
