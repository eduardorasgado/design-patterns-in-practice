package creational.AbstractFactory.OwnerAndDogRestaurantExample;

public class ComboFactoryDemo {
	
	public static void main(String[] args) {
		Combo combo = new Combo(FactoryMaker.getFactory(ComboFactoryType.HUMAN));
		
		Pizza pizza = combo.getPizza();
		pizza.serve();
		Topping topping = combo.getTopping();
		topping.dip();
		Drink drink = combo.getDrink();
		drink.drink();
		
		combo = new Combo(FactoryMaker.getFactory(ComboFactoryType.DOG));
		
		pizza = combo.getPizza();
		pizza.slice();
		topping = combo.getTopping();
		topping.mix();
		drink = combo.getDrink();
		drink.pour();
	}
}
