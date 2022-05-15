package solidPrinciples.LiskovSubstitutionPrinciple.AnimalsExample.ReturnTypeCheck;

import java.util.ArrayList;

import solidPrinciples.LiskovSubstitutionPrinciple.AnimalsExample.Model.AnimalClassification;
import solidPrinciples.LiskovSubstitutionPrinciple.AnimalsExample.Model.BengalCat;
import solidPrinciples.LiskovSubstitutionPrinciple.AnimalsExample.Model.Cat;
import solidPrinciples.LiskovSubstitutionPrinciple.AnimalsExample.Model.FeedType;
import solidPrinciples.LiskovSubstitutionPrinciple.AnimalsExample.Model.GenderType;

public class CatStore extends AnimalStore {

	@Override
	public Cat buy() {
		System.out.println("Buying a cat...");
		
		return new BengalCat("Bengal cat", 
				new AnimalClassification("Mammals", "Fenile", "Cat", "Bengal"), 
				new ArrayList<>() {{add(FeedType.CARNIVORE);}}, 
				GenderType.MALE, 2, 20, 20, 4, 10, 2, 10, 16);
	}
}
