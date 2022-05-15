package solidPrinciples.LiskovSubstitutionPrinciple.AnimalsExample.Model;

import java.util.List;

public class BengalCat extends Cat {
	private int spotsCount;

	public BengalCat(String animalName, AnimalClassification classification, List<FeedType> feedType, GenderType gender,
			int padThickness, int nailSizeInMm, int maxTeethLengthInMm, int legCount, int whiskersCount,
			int whiskersThicknessInMm, int independenceLevel, int spotsCount) {
		super(animalName, classification, feedType, gender, padThickness, nailSizeInMm, maxTeethLengthInMm, legCount,
				whiskersCount, whiskersThicknessInMm, independenceLevel);
		this.spotsCount = spotsCount;
	}

	public void hunt() {
		System.out.println("Bengal cat is hunting...");
	}
}
