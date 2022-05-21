package structural.Adapter.PokemonExample;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import structural.Adapter.PokemonExample.Mapper.DictToListPokemonDataMapper;
import structural.Adapter.PokemonExample.Mapper.IPokemonDataMapper;
import structural.Adapter.PokemonExample.Mapper.ListToDictPokemonDataMapper;
import structural.Adapter.PokemonExample.Service.IPokemonCatcherService;
import structural.Adapter.PokemonExample.Service.LegacyPokemonCatcherService;
import structural.Adapter.PokemonExample.Service.PokedexMapService;

public class PokemonDemo {

	public static void main(String[] args) {
		List<List<String>> ownedPokemons = new ArrayList<>();

		// This is the common way we handle the legacy pokemon list
		IPokemonCatcherService<List<List<String>>> catcher = new LegacyPokemonCatcherService(ownedPokemons);

		catcher.insertOrUpdate("3");
		catcher.insertOrUpdate("6");

		System.out.println("---------Printing the pokemon catched legacy list:----------");
		System.out.println(catcher.getAllCatched());

		// now there is a new service an external team currently implemented, we cannot
		// change it.
		// But we can create an adapter to it.
		Map<String, AbstractMap<String, Integer>> newPokemonMap = new HashMap<String, AbstractMap<String, Integer>>();
		PokedexMapService newPokedexService = new PokedexMapService(newPokemonMap);

		IPokemonDataMapper<List<String>, Map<String, AbstractMap<String, Integer>>> legacyToMapPokemonDataMapper = new ListToDictPokemonDataMapper();
		IPokemonDataMapper<Map<String, AbstractMap<String, Integer>>, List<String>> mapToLegacyPokemonDataMapper = new DictToListPokemonDataMapper();
		IPokemonCatcherService<List<List<String>>> newPokedexAdapter = new LegacyToMapPokedexAdapter(newPokedexService,
				legacyToMapPokemonDataMapper, mapToLegacyPokemonDataMapper);

		newPokedexAdapter.insertOrUpdate("3");
		newPokedexAdapter.insertOrUpdate("1");
		newPokedexAdapter.insertOrUpdate("6");

		System.out.println("--------------Printing the newPokedexService pokemon catched map:------------");
		System.out.println(newPokedexService.getPokemons());
		System.out.println("--------------Printing the newPokedexAdapter pokemon catched legacy list:------------");
		System.out.println(newPokedexAdapter.getAllCatched());
	}
}