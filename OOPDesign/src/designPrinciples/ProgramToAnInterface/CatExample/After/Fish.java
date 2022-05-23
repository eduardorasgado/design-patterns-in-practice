package designPrinciples.ProgramToAnInterface.CatExample.After;

public class Fish implements Food {
	private int protein;
	private int DHA;
	private int boneInGrams;
	private String specie;
	
	public Fish(int protein, int lipid, int boneInGrams, String specie) {
		this.protein = protein;
		this.DHA = lipid;
		this.boneInGrams = boneInGrams;
		this.specie = specie;
	}

	public int getProtein() {
		return protein;
	}

	public int getDHA() {
		return DHA;
	}

	public int getBoneInGrams() {
		return boneInGrams;
	}

	public String getSpecie() {
		return specie;
	}

	@Override
	public int getNutrition() {
		return getProtein() + getDHA();
	}
}
