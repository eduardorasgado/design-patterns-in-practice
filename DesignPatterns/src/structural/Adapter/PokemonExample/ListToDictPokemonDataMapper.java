package structural.Adapter.PokemonExample;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.AbstractMap.SimpleEntry;
import java.util.Map.Entry;

public class ListToDictPokemonDataMapper
		implements IPokemonDataMapper<List<String>, Map<String, AbstractMap<String, Integer>>> {

	@Override
	public void mapPokemonData(List<String> pokemonData, Map<String, AbstractMap<String, Integer>> pokemonMap) {

		String name = pokemonData.get(PokemonStatType.NAME.getIndex());
		AbstractMap<String, Integer> statMap= new HashMap<>();

		PokemonStatType[] pokemonTypes = PokemonStatType.values();
		for (int i = 0; i < pokemonTypes.length; i++) {
			PokemonStatType pokemonType = pokemonTypes[i];

			String statValue = pokemonData.get(pokemonType.getIndex());
			if (pokemonType.isStat() && !statValue.isBlank() && isParseableToInteger(statValue)) {
				statMap.put(pokemonType.getDescriptor(), Integer.parseInt(statValue));
			}
		}
		pokemonMap.put(name, statMap);
	}

	private boolean isParseableToInteger(String value) {
		try {
			Integer.parseInt(value);
			return true;
		} catch (NumberFormatException ex) {
			return false;
		}
	}
}
