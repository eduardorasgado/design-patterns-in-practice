package structural.Adapter.PokemonExample.LegacyAccessor;

import java.util.List;

public class LegacyPokemonExtractor {
	
	public static List<List<String>> getLegacyPokemonList() {
		return LegacyExternalPokedexSingleton.getInstance().getPokemons();
	}
}
