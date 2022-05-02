package creational.AbstractFactory.KindomExample;

public abstract class FactoryMaker {
	
	public static KingdomFactory getKingdomFactory(KingdomType type) {
		switch(type) {
		case ORC:
			return new OrcKingdomFactory();
		case ELF:
			return new ElfKingdomFactory();
		default:
			throw new IllegalArgumentException();
		}
	}
}
