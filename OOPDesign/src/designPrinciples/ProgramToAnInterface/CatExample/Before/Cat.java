package designPrinciples.ProgramToAnInterface.CatExample.Before;

/**
 * The eat cat's method can only feed a cat by eating only sausages 
 * @author cheetos
 *
 */
public class Cat {
	private int energy;
	
	public void eat(Sausage sausage) {
		energy += sausage.getNutrition();
	}
}
