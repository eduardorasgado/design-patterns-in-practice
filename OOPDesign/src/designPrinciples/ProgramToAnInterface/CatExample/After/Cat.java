package designPrinciples.ProgramToAnInterface.CatExample.After;

/**
 * The this cat can eat any food 
 * @author cheetos
 *
 */
public class Cat {
	private int energy;
	
	public Cat(int energy) {
		this.energy = energy;
	}

	public void eat(Food food) {
		int tempEnergy = energy + food.getNutrition();
		if(tempEnergy > 100) {
			tempEnergy = 100;
		}		
		energy = tempEnergy;
	}

	public int getEnergy() {
		return energy;
	}
}
