package structural.Adapter.PokemonExample;

import java.util.AbstractMap;
import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;

public class LegacyToMapPokedexAdapter implements IPokemonCatcherService {

	private PokedexMapService newPokedexService;
	private IPokemonDataMapper<List<String>, Map<String, AbstractMap<String, Integer>>> pokemonDataMapper;

	public LegacyToMapPokedexAdapter(PokedexMapService newPokedexService,
			IPokemonDataMapper<List<String>, Map<String, AbstractMap<String, Integer>>> pokemonDataMapper) {
		this.newPokedexService = newPokedexService;
		this.pokemonDataMapper = pokemonDataMapper;
	}

	@Override
	public void insertOrUpdate(String id) {
		Optional<List<String>> pokemon = LegacyPokemonExtractor.getLegacyPokemonList().stream()
				.filter(p -> p.get(0) == id).findFirst();

		if (pokemon.isPresent()) {
			
			Map<String, AbstractMap<String, Integer>> pokemonMap = new HashMap<String, AbstractMap<String, Integer>>();

			pokemonDataMapper.mapPokemonData(pokemon.get(), pokemonMap);

			newPokedexService.insertOrUpdate(pokemonMap);
		}
	}
}
