package solidPrinciples.LiskovSubstitutionPrinciple.AnimalsExample.ParameterTypeCheck;

import java.util.ArrayList;

import solidPrinciples.LiskovSubstitutionPrinciple.AnimalsExample.Model.*;


public class ParameterTypeCheckDemo {
	public static void main(String[] args) {
		// I know this need to be a builder constructor or better a prototype registry product
		Animal bengalCat = new BengalCat("Bengal cat", 
				new AnimalClassification("Mammals", "Fenile", "Cat", "Bengal"), 
				new ArrayList<>() {{add(FeedType.CARNIVORE);}}, 
				GenderType.MALE, 2, 20, 20, 4, 10, 2, 10, 16);
		
		AnimalFeeder feeder = new AnimalFeeder();
		dispenseFood(feeder, bengalCat);
		feeder = new CatFeeder();
		dispenseFood(feeder, bengalCat);
		feeder = new BengalCatFeeder();
		dispenseFood(feeder, (BengalCat) bengalCat);
		
	}
	
	public static void dispenseFood(AnimalFeeder feeder, Animal animal) {
		feeder.feed(animal);
	}
}
