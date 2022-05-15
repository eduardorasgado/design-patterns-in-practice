package solidPrinciples.LiskovSubstitutionPrinciple.AnimalsExample.Model;

import java.util.List;

public abstract class Dog extends LeggedAnimal {

	private int heightInCm;
	private boolean isFearful;
	private boolean isPlayFul;
	private String eyeColor;
	public Dog(String animalName, AnimalClassification classification, List<FeedType> feedType, GenderType gender,
			int padThickness, int nailSizeInMm, int maxTeethLengthInMm, int legCount, int heightInCm, boolean isFearful,
			boolean isPlayFul, String eyeColor) {
		super(animalName, classification, feedType, gender, padThickness, nailSizeInMm, maxTeethLengthInMm, legCount);
		this.heightInCm = heightInCm;
		this.isFearful = isFearful;
		this.isPlayFul = isPlayFul;
		this.eyeColor = eyeColor;
	}
	@Override
	protected void eat(String feed, FeedType feedType) {
		System.out.println("Dog is eating... " + feed);
	}
	@Override
	protected void reproduce(Animal animal, GenderType genderType) {
		System.out.println("Dog is having sex with " + animal.getAnimalName());
		
	}
}
