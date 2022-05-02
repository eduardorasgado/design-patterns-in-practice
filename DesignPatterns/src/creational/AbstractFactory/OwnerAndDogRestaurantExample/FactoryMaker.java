package creational.AbstractFactory.OwnerAndDogRestaurantExample;

public abstract class FactoryMaker {

	public static ComboFactory getFactory(ComboFactoryType cfType) {
		switch (cfType) {
		case HUMAN:
			return new HumanComboFactory();
		case DOG:
			return new DogComboFactory();

		default:
			throw new IllegalArgumentException();
		}
	}
}
