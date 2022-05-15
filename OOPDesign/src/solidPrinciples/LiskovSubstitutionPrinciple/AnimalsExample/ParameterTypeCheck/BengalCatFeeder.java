package solidPrinciples.LiskovSubstitutionPrinciple.AnimalsExample.ParameterTypeCheck;

import solidPrinciples.LiskovSubstitutionPrinciple.AnimalsExample.Model.Animal;

public class BengalCatFeeder extends CatFeeder {

	@Override
	void feed(Animal animal) {
		System.out.println("Particular food type to be dispensed for a bengal cat");
	}
	
}
