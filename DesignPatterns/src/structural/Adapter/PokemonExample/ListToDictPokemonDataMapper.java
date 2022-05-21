package structural.Adapter.PokemonExample;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListToDictPokemonDataMapper extends BasePokemonDataMapper
		implements IPokemonDataMapper<List<String>, Map<String, AbstractMap<String, Integer>>> {

	@Override
	public void mapPokemonData(List<String> collectionSource,
			Map<String, AbstractMap<String, Integer>> collectionDestiny) {

		String name = collectionSource.get(PokemonStatType.NAME.getIndex());
		AbstractMap<String, Integer> statMap = new HashMap<>();

		PokemonStatType[] pokemonTypes = PokemonStatType.values();
		for (int i = 0; i < pokemonTypes.length; i++) {
			PokemonStatType pokemonType = pokemonTypes[i];

			String statValue = collectionSource.get(pokemonType.getIndex());
			if (pokemonType.isStat() && !statValue.isBlank() && isParseableToInteger(statValue)) {
				statMap.put(pokemonType.getDescriptor(), Integer.parseInt(statValue));
			}
		}
		collectionDestiny.put(name, statMap);
	}
}
