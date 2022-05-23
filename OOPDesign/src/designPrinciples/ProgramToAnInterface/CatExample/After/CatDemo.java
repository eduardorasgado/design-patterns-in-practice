package designPrinciples.ProgramToAnInterface.CatExample.After;

public class CatDemo {
	public static void main(String[] args) {
		Cat doki = new Cat(50);
		Food[] food = new Food[2];
		food[0] = new Sausage(3, 5, 4, "Red", "Tomorrow");
		food[1] = new Fish(4, 3, 2, "Salmon");
		
		for(int i = 0; i < food.length; i++) {
			doki.eat(food[i]);
			System.out.println(doki.getEnergy());
		}
	}
}
