package behavioral.Iterator.TreasureChestExample;

import java.util.logging.Logger;

public class TreasureChestDemo {

	public static Logger LOGGER = Logger.getLogger(TreasureChestDemo.class.getName());

	public static void main(String[] args) {
		IterableObject<Item> tChest = new TreasureChest();
		Iterator<Item> chestItemIterator = tChest.getIterator(ItemType.POTION);

		while (chestItemIterator.hasNext()) {
			LOGGER.info(chestItemIterator.next().toString());
		}

		if (chestItemIterator.next() == null) {
			LOGGER.warning("next element is null");
		}
	}
}
