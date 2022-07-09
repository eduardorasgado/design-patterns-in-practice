package behavioral.IteratorTreasureChestExample;

public interface IterableObject<T> {
	Iterator<T> getIterator(ItemType type);
}
