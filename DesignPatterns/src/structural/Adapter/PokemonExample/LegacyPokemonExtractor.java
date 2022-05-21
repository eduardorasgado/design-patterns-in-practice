package structural.Adapter.PokemonExample;

import java.util.List;

public class LegacyPokemonExtractor {
	
	public static List<List<String>> getLegacyPokemonList() {
		return LegacyExternalPokedexSingleton.getInstance().getPokemons();
	}
}
