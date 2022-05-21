package structural.Adapter.PokemonExample.Service;

public interface IPokemonCatcherService<T> {
	void insertOrUpdate(String id);

	T getAllCatched();
}
