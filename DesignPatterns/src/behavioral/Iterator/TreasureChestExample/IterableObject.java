package behavioral.Iterator.TreasureChestExample;

public interface IterableObject<T> {
	Iterator<T> getIterator(ItemType type);
}
