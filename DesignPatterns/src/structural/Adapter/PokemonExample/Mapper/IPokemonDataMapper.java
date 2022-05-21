package structural.Adapter.PokemonExample.Mapper;

public interface IPokemonDataMapper<F, T> {
	void mapPokemonData(F collectionSource, T collectionDestiny);
}
