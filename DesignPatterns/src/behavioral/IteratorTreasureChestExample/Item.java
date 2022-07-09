package behavioral.IteratorTreasureChestExample;

public class Item {
	private ItemType type;
	private String name;
	
	public Item(ItemType type, String name) {
		this.type = type;
		this.name = name;
	}
	
	public ItemType getType() {
		return type;
	}
	
	public void setType(ItemType type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		return "Item [name=" + name + ", type=" + type + "]";
	}
}
