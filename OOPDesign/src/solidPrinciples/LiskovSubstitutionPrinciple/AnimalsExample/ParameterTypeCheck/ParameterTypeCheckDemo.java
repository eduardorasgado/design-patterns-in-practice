package solidPrinciples.LiskovSubstitutionPrinciple.AnimalsExample.ParameterTypeCheck;

import java.util.ArrayList;

import solidPrinciples.LiskovSubstitutionPrinciple.AnimalsExample.Model.*;


public class ParameterTypeCheckDemo {

	// liskov substitution principle: parameter type check
	public static void main(String[] args) {
		// I know this need to be a builder constructor or better a prototype registry product
		//also, if we change parameter type in feed method for CatFeeder to BengalCat it keep working due to
		// we are using a bengal cat, given the Animal hierarchy design(it is abstract) I didnt instantiate an animal
		// but, if this was an animal object, the changed method in CatFeeder method wouldnt worked correctly(i think).
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
