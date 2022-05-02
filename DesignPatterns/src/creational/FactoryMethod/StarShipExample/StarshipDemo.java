package creational.FactoryMethod.StarShipExample;

public class StarshipDemo {
	public static void main(String[] args) {
		StarshipFactory starshipFactory = new HumanStarshipFactory();
		
		Cruiser heavyCruiser = starshipFactory.manufactureCruiser(CruiserType.HEAVY);
		heavyCruiser.launch();		
		
		Cruiser attackCruiser = starshipFactory.manufactureCruiser(CruiserType.ATTACK);
		attackCruiser.lightSpeedFlight();
		attackCruiser.land();
		attackCruiser.attack();
		
		starshipFactory = new ReptilianStarshipFactory();
		
		heavyCruiser = starshipFactory.manufactureCruiser(CruiserType.HEAVY);
		heavyCruiser.land();
		
		attackCruiser = starshipFactory.manufactureCruiser(CruiserType.ATTACK);
		attackCruiser.attack();
	}
}
