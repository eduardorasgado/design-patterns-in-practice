package structural.Adapter.PokemonExample;

import java.util.List;
import java.util.Optional;

public interface IPokemonCatcherService {
	Optional<List<String>> catchPokemon();
}
