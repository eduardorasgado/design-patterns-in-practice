package structural.Adapter.PokemonExample;

public interface IPokemonDataMapper<F, T> {
	void mapPokemonData(F collectionSource, T collectionDestiny);
}
