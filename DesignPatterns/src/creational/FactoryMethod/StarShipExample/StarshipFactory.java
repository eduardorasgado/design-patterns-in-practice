package creational.FactoryMethod.StarShipExample;

public interface StarshipFactory {
	Cruiser manufactureCruiser(CruiserType cruiserType);	
}
