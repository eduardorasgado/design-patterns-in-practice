package structural.Adapter.PokemonExample;

import java.util.List;
import java.util.Optional;

public class LegacyPokemonCatcherService {
	// fields are:
	// id, name, attack, defense, type(integer), level(integer) 
	private List<List<String>> pokemonList;
	
	public LegacyPokemonCatcherService(List<List<String>> pokemonList) {
		this.pokemonList = pokemonList;
	}

	public Optional<List<String>> catchPokemon(String id) {
		return pokemonList.stream().filter(pokemon -> pokemon.get(0) == id).findFirst();
	}
}
