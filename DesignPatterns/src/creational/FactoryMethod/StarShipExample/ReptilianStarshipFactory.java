package creational.FactoryMethod.StarShipExample;

import java.util.HashMap;
import java.util.Map;

public class ReptilianStarshipFactory implements StarshipFactory {

	private static final Map<CruiserType, Getter<Cruiser>> CRUISERS = new HashMap<>() {
		private static final long serialVersionUID = 1L;

	{
		put(CruiserType.ATTACK, () -> new ReptilianAttackCruiser());
		put(CruiserType.HEAVY, () -> new ReptilianHeavyCruiser());
		put(CruiserType.STAR, () -> new ReptilianStarCruiser());
	}};
	
	@Override
	public Cruiser manufactureCruiser(CruiserType cruiserType) {
		return CRUISERS.get(cruiserType).get();
	}

}
