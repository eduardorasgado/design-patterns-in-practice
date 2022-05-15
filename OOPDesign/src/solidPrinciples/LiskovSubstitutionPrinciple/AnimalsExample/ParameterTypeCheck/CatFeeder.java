package solidPrinciples.LiskovSubstitutionPrinciple.AnimalsExample.ParameterTypeCheck;

import solidPrinciples.LiskovSubstitutionPrinciple.AnimalsExample.Model.Animal;

public class CatFeeder extends AnimalFeeder {

	@Override
	void feed(Animal animal) {
		System.out.println("Preparing or selecting certain cat food for: " + animal.getAnimalName());
	}
}
