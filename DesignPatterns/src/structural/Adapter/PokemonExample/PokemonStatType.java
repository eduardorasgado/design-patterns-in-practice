package structural.Adapter.PokemonExample;

public enum PokemonStatType {
	ID(0, "ID", false),
	NAME(1, "NAME", false),
	ATTACK(2, "ATTACK", true),
	DEFENSE(3, "DEFENSE", true),
	TYPE(4, "TYPE", true),
	LEVEL(5, "LEVEL", true);
	
	private int index;
	private String descriptor;
	private boolean isStat;

	private PokemonStatType(int index, String descriptor, boolean isStat) {
		this.index = index;
		this.descriptor = descriptor;
		this.isStat = isStat;
	}

	public int getIndex() {
		return index;
	}

	public String getDescriptor() {
		return descriptor;
	}

	public boolean isStat() {
		return isStat;
	}
}
