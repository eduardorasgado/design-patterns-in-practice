package behavioral.Iterator.TreasureChestExample;

import java.util.List;

public class TreasureChestItemIterator implements Iterator<Item> {
	private List<Item> treasureChestItems;
	private ItemType type;
	private int currentIndex;
	private int nextIndex;
	
	public TreasureChestItemIterator(TreasureChest treasureChest, ItemType type) {
		this.treasureChestItems = treasureChest.getItems();
		this.type = type;
		
		currentIndex = 0;
	}

	@Override
	public boolean hasNext() {
		return hasNext(currentIndex + 1);
	}
	
	public boolean hasNext(int nextIndex) {
		this.nextIndex = nextIndex;
		
		if (nextIndex >= treasureChestItems.size()) {
			return false;
		}
		
		else if(treasureChestItems.get(nextIndex).getType().equals(type)) {
			return true;
		}
		
		return hasNext(nextIndex + 1);
	}

	@Override
	public Item next() {
		currentIndex = nextIndex;
		
		if(currentIndex >= treasureChestItems.size()) {
			return null;
		}
		
		return treasureChestItems.get(currentIndex);
	}

}
