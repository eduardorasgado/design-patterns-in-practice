package structural.Adapter.PokemonExample;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

public class PokemonDemo {
	public static void main(String[] args) {
		List<List<String>> ownedPokemons = new ArrayList<>();
		
		// This is the common way we handle the legacy pokemon list
		IPokemonCatcherService catcher = new LegacyPokemonCatcherService(ownedPokemons);
		
		catcher.insertOrUpdate("3");
		catcher.insertOrUpdate("6");
		System.out.println(((LegacyPokemonCatcherService) catcher).getOwnedPokemons());
		
		// now there is a new service an external team currently implemented, we cannot change it.
		// But we can create an adapter to it.
		Map<String, AbstractMap<String, Integer>> newPokemonMap = new HashMap<String, AbstractMap<String, Integer>>();
		
		PokedexMapService newPokedexService = new PokedexMapService(newPokemonMap);
		IPokemonDataMapper<List<String>, Map<String, AbstractMap<String, Integer>>> pokemonDataMapper = new ListToDictPokemonDataMapper();
		IPokemonCatcherService newPokedexAdapter = new LegacyToMapPokedexAdapter(newPokedexService, pokemonDataMapper);
		
		newPokedexAdapter.insertOrUpdate("3");
		newPokedexAdapter.insertOrUpdate("6");
		
		System.out.println(newPokedexService.getPokemons());
	}
}