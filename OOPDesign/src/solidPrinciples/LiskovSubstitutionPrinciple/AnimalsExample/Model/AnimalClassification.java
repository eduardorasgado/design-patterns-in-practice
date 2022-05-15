package solidPrinciples.LiskovSubstitutionPrinciple.AnimalsExample.Model;

public class AnimalClassification {
	private String kindom;
	private String animalClass;
	private String family;
	private String specie;
	
	public AnimalClassification(String kindom, String animalClass, String family, String specie) {
		// this constructor could be reimplemented using a builder
		super();
		this.kindom = kindom;
		this.animalClass = animalClass;
		this.family = family;
		this.specie = specie;
	}

	public String getKindom() {
		return kindom;
	}

	public String getAnimalClass() {
		return animalClass;
	}

	public String getFamily() {
		return family;
	}

	public String getSpecie() {
		return specie;
	}
}
