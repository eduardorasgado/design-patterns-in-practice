package structural.Adapter.PokemonExample;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DictToListPokemonDataMapper extends BasePokemonDataMapper
		implements IPokemonDataMapper<Map<String, AbstractMap<String, Integer>>, List<String>> {

	@Override
	public void mapPokemonData(Map<String, AbstractMap<String, Integer>> collectionSource,
			List<String> collectionDestiny) {
		PokemonStatType[] values = PokemonStatType.values();

		Iterator<String> iterator = collectionSource.keySet().iterator();
		if (iterator.hasNext()) {
			String name = iterator.next();
			AbstractMap<String, Integer> statMap = collectionSource.get(name);

			// pokemon map does not store legacy id
			collectionDestiny.add("");
			collectionDestiny.add(name);

			for (int i = 0; i < values.length; i++) {
				PokemonStatType statType = values[i];

				if (statType.isStat()) {
					String statKey = statType.getDescriptor();
					String statValue = "";
					if (statMap.containsKey(statKey) && isParseableToInteger(String.valueOf(statMap.get(statKey)))) {
						statValue = String.valueOf(statMap.get(statKey));
					}
					collectionDestiny.add(statValue);
				}
			}
		}
	}
}
