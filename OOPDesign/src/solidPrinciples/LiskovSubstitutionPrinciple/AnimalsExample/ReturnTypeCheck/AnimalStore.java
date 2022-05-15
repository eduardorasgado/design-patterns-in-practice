package solidPrinciples.LiskovSubstitutionPrinciple.AnimalsExample.ReturnTypeCheck;

import java.util.ArrayList;

import solidPrinciples.LiskovSubstitutionPrinciple.AnimalsExample.Model.*;

public class AnimalStore {
	
	public Animal buy() {
		System.out.println("Buying an animal...");
		// not even closed the best implementation but a bengal cat is an animal so...
		// constructor params could be encapsulated into a builder with random generated values;
		return new BengalCat("Bengal cat", 
				new AnimalClassification("Mammals", "Fenile", "Cat", "Bengal"), 
				new ArrayList<>() {{add(FeedType.CARNIVORE);}}, 
				GenderType.MALE, 2, 20, 20, 4, 10, 2, 10, 16);
	}
}
