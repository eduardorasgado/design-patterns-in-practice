package structural.Adapter.PokemonExample;

import java.util.List;
import java.util.Optional;

public class PokemonDemo {
	public static void main(String[] args) {
		// External service, we dont have access to its internal implementation.
		// we cannot change this
		LegacyExternalPokedexSingleton legacyPokemonList = LegacyExternalPokedexSingleton.getInstance();
		
		// This is the common way we handle the legacy pokemon list
		LegacyPokemonCatcherService catcher = new LegacyPokemonCatcherService(legacyPokemonList.getPokemons());
		
		Optional<List<String>> catchedPokemon = catcher.catchPokemon("3");
		
		if(catchedPokemon.isPresent()) {
			System.out.println(catchedPokemon.get());
		}
		
		// now there is a new service an external team currently implemented, we cannot change it.
		// But we can create an adapter to it.
	}
}
