package solidPrinciples.LiskovSubstitutionPrinciple.AnimalsExample.Model;

import java.util.List;

public abstract class Animal {
	private String animalName;
	private AnimalClassification classification;
	private List<FeedType> feedType;
	private GenderType gender;

	public Animal(String animalName, AnimalClassification classification, List<FeedType> feedType, GenderType gender) {
		// this constructor could be reimplemented using a builder
		// and to be able to create new animal variants we could create a prototype and
		// registry
		this.animalName = animalName;
		this.classification = classification;
		this.feedType = feedType;
		this.gender = gender;
	}
	
	protected abstract void eat(String feed, FeedType feedType);
	protected abstract void reproduce(Animal animal, GenderType genderType);
	protected abstract void move();

	public String getAnimalName() {
		return animalName;
	}

	public AnimalClassification getClassification() {
		return classification;
	}

	public List<FeedType> getFeedType() {
		return feedType;
	}

	public GenderType getGender() {
		return gender;
	}
}
