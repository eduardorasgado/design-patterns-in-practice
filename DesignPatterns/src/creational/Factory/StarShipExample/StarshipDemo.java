package creational.Factory.StarShipExample;

public class StarshipDemo {
	public static void main(String[] args) {
		StarshipFactory starshipFactory = new HumanStarshipFactory();
		Cruiser heavyCruiser = starshipFactory.manufactureCruiser(CruiserType.HEAVY);
		heavyCruiser.launch();		
	}
}
