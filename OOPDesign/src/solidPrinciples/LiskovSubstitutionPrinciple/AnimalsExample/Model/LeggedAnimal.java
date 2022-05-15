package solidPrinciples.LiskovSubstitutionPrinciple.AnimalsExample.Model;

import java.util.List;

public abstract class LeggedAnimal extends Animal {
	
	private int padThickness;
	private int nailSizeInMm;
	private int maxTeethLengthInMm;
	private int legCount;
	// could add: legs list

	public LeggedAnimal(String animalName, AnimalClassification classification, List<FeedType> feedType,
			GenderType gender, int padThickness, int nailSizeInMm, int maxTeethLengthInMm, int legCount) {
		super(animalName, classification, feedType, gender);
		this.padThickness = padThickness;
		this.nailSizeInMm = nailSizeInMm;
		this.maxTeethLengthInMm = maxTeethLengthInMm;
		this.legCount = legCount;
	}
	
	public int getPadThickness() {
		return padThickness;
	}

	public int getNailSizeInMm() {
		return nailSizeInMm;
	}

	public int getMaxTeethLengthInMm() {
		return maxTeethLengthInMm;
	}

	public int getLegCount() {
		return legCount;
	}
}
