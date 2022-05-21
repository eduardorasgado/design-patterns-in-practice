package structural.Adapter.PokemonExample.LegacyAccessor;

import java.util.ArrayList;
import java.util.List;

// External service, we dont have access to its internal implementation.
public class LegacyExternalPokedexSingleton {

	// id, name, attack, defense, type(integer), level(integer)
	private List<List<String>> POKEMONS;
	
	private static LegacyExternalPokedexSingleton instance;
	
	private LegacyExternalPokedexSingleton() {
		POKEMONS = new ArrayList<>() {{
			add(new ArrayList<>() {{
				add("1");
				add("Bulbasaur");
				add("33");
				add("44");
				add("1");
				add("5");
			}});
			
			add(new ArrayList<>() {{
				add("2");
				add("Squirtle");
				add("43");
				add("64");
				add("2");
				add("5");
			}});
			
			add(new ArrayList<>() {{
				add("3");
				add("Charmander");
				add("98");
				add("23");
				add("3");
				add("5");
			}});
			
			add(new ArrayList<>() {{
				add("4");
				add("Pikachu");
				add("61");
				add("74");
				add("4");
				add("5");
			}});
			
			add(new ArrayList<>() {{
				add("5");
				add("Caterpie");
				add("0");
				add("32");
				add("5");
				add("5");
			}});
			
			add(new ArrayList<>() {{
				add("6");
				add("Metapod");
				add("33");
				add("44");
				add("5");
				add("5");
			}});
		}};
	}
	
	public final static LegacyExternalPokedexSingleton getInstance() {
		if(instance == null) {
			instance = new LegacyExternalPokedexSingleton();
		}
		return instance;
	}
	
	public final List<List<String>> getPokemons() {
		return POKEMONS;
	}
}
