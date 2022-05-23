package designPrinciples.ProgramToAnInterface.CatExample.After;

public class Sausage implements Food {
	private int protein;
	private int lipids;
	private int carbs;
	
	private String color;
	private String expiration;
	
	public Sausage(int protein, int lipids, int carbs, String color, String expiration) {
		super();
		this.protein = protein;
		this.lipids = lipids;
		this.carbs = carbs;
		this.color = color;
		this.expiration = expiration;
	}

	public int getNutrition() {
		return getProtein() + getCarbs() + getLipids(); 
	}
	
	public String getColor() {
		return color;
	}

	public int getProtein() {
		return protein;
	}

	public int getLipids() {
		return lipids;
	}

	public int getCarbs() {
		return carbs;
	}

	public String getExpiration() {
		return expiration;
	}
}
