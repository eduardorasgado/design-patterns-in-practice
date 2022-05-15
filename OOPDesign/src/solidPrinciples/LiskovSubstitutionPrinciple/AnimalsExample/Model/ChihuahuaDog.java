package solidPrinciples.LiskovSubstitutionPrinciple.AnimalsExample.Model;

import java.util.List;

public class ChihuahuaDog extends Dog {
	private int nervousLevel;
	
	public ChihuahuaDog(String animalName, AnimalClassification classification, List<FeedType> feedType,
			GenderType gender, int padThickness, int nailSizeInMm, int maxTeethLengthInMm, int legCount, int heightInCm,
			boolean isFearful, boolean isPlayFul, String eyeColor, int nervousLevel) {
		super(animalName, classification, feedType, gender, padThickness, nailSizeInMm, maxTeethLengthInMm, legCount,
				heightInCm, isFearful, isPlayFul, eyeColor);
		this.nervousLevel = nervousLevel;
	}
	
	@Override
	protected void move() {
		System.out.println("General dog is moving...");
	}
}
