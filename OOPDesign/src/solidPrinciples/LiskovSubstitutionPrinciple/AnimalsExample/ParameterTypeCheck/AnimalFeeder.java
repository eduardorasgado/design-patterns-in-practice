package solidPrinciples.LiskovSubstitutionPrinciple.AnimalsExample.ParameterTypeCheck;

import solidPrinciples.LiskovSubstitutionPrinciple.AnimalsExample.Model.Animal;

public class AnimalFeeder {
	void feed(Animal animal) {
		System.out.println("General way to dispense food to animal and selecting a more general food for: " + animal.getAnimalName());
	}
}
