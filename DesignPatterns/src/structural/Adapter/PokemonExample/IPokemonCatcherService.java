package structural.Adapter.PokemonExample;

public interface IPokemonCatcherService<T> {
	void insertOrUpdate(String id);

	T getAllCatched();
}
