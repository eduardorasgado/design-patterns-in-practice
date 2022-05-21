package structural.Adapter.PokemonExample;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;

public class LegacyToMapPokedexAdapter implements IPokemonCatcherService<List<List<String>>> {

	private PokedexMapService newPokedexService;
	private IPokemonDataMapper<List<String>, Map<String, AbstractMap<String, Integer>>> listToMapPokemonDataMapper;
	private IPokemonDataMapper<Map<String, AbstractMap<String, Integer>>, List<String>> mapToListPokemonDataMapper;

	public LegacyToMapPokedexAdapter(PokedexMapService newPokedexService,
			IPokemonDataMapper<List<String>, Map<String, AbstractMap<String, Integer>>> listToMapPokemonDataMapper,
			IPokemonDataMapper<Map<String, AbstractMap<String, Integer>>, List<String>> mapToListPokemonDataMapper) {
		super();
		this.newPokedexService = newPokedexService;
		this.listToMapPokemonDataMapper = listToMapPokemonDataMapper;
		this.mapToListPokemonDataMapper = mapToListPokemonDataMapper;
	}

	@Override
	public void insertOrUpdate(String id) {
		Optional<List<String>> pokemon = LegacyPokemonExtractor.getLegacyPokemonList().stream()
				.filter(p -> p.get(0) == id).findFirst();

		if (pokemon.isPresent()) {

			Map<String, AbstractMap<String, Integer>> pokemonMap = new HashMap<String, AbstractMap<String, Integer>>();

			listToMapPokemonDataMapper.mapPokemonData(pokemon.get(), pokemonMap);

			newPokedexService.insertOrUpdate(pokemonMap);
		}
	}

	@Override
	public List<List<String>> getAllCatched() {
		List<List<String>> destinyCollection = new ArrayList<>();
		Map<String, AbstractMap<String, Integer>> pokemons = newPokedexService.getPokemons();

		for (Entry<String, AbstractMap<String, Integer>> pokemonEntry : pokemons.entrySet()) {
			List<String> pokemonData = new ArrayList<>();
			Map<String, AbstractMap<String, Integer>> pokemonMap = new HashMap<>();
			pokemonMap.put(pokemonEntry.getKey(), pokemonEntry.getValue());

			mapToListPokemonDataMapper.mapPokemonData(pokemonMap, pokemonData);
			destinyCollection.add(pokemonData);
		}

		return destinyCollection;
	}
}
