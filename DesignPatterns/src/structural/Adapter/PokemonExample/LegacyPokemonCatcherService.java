package structural.Adapter.PokemonExample;

import java.util.List;
import java.util.Optional;

public class LegacyPokemonCatcherService implements IPokemonCatcherService {

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

	public List<List<String>> getOwnedPokemons() {
		return ownedPokemons;
	}
}
