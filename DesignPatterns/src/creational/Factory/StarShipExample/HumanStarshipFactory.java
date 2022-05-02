package creational.Factory.StarShipExample;

import java.util.HashMap;
import java.util.Map;

public class HumanStarshipFactory implements StarshipFactory {

	private static final Map<CruiserType, Getter<Cruiser>> CRUISERS = new HashMap<>() {
		private static final long serialVersionUID = 1L;

	{
		put(CruiserType.ATTACK, () -> new HumanAttackCruiser());
		put(CruiserType.HEAVY, () -> new HumanHeavyCruiser());
		put(CruiserType.STAR, () -> new HumanStarCruiser());
	}};
	
	
	
	@Override
	public Cruiser manufactureCruiser(CruiserType cruiserType) {
		return CRUISERS.get(cruiserType).get();
	}
}
