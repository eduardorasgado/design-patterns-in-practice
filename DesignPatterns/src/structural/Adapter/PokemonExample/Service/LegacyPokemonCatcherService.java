package structural.Adapter.PokemonExample.Service;

import java.util.List;
import java.util.Optional;

import structural.Adapter.PokemonExample.LegacyAccessor.LegacyPokemonExtractor;

public class LegacyPokemonCatcherService implements IPokemonCatcherService<List<List<String>>> {

	private List<List<String>> ownedPokemons;

	public LegacyPokemonCatcherService(List<List<String>> ownedPokemons) {
		this.ownedPokemons = ownedPokemons;
	}

	@Override
	public void insertOrUpdate(String id) {
		Optional<List<String>> pokemon = LegacyPokemonExtractor.getLegacyPokemonList().stream()
				.filter(p -> p.get(0) == id).findFirst();
		
		if (pokemon.isPresent()) {
			ownedPokemons.add(pokemon.get());
		}
	}

	@Override
	public List<List<String>> getAllCatched() {
		return ownedPokemons;
	}
}
