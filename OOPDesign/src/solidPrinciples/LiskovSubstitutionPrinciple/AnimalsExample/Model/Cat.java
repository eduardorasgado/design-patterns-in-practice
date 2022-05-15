package solidPrinciples.LiskovSubstitutionPrinciple.AnimalsExample.Model;

import java.util.List;

public class Cat extends LeggedAnimal {
	private int whiskersCount;
	private int whiskersThicknessInMm;
	private int independenceLevel;
	
	public Cat(String animalName, AnimalClassification classification, List<FeedType> feedType, GenderType gender,
			int padThickness, int nailSizeInMm, int maxTeethLengthInMm, int legCount, int whiskersCount,
			int whiskersThicknessInMm, int independenceLevel) {
		super(animalName, classification, feedType, gender, padThickness, nailSizeInMm, maxTeethLengthInMm, legCount);
		this.whiskersCount = whiskersCount;
		this.whiskersThicknessInMm = whiskersThicknessInMm;
		this.independenceLevel = independenceLevel;
	}

	@Override
	protected void eat(String feed, FeedType feedType) {
		System.out.println("General way a cat diggest feeding with " + feed);
	}

	@Override
	protected void reproduce(Animal animal, GenderType genderType) {
		System.out.println("General way a cat reproduce with " + animal);
	}
	
	@Override
	protected void move() {
		System.out.println("Bengal cat is moving...");
	}
}
