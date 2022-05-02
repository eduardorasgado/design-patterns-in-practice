package creational.FactoryMethod.CoinExample;

import java.util.function.Supplier;

public enum CoinType {
	GOLD(GoldCoin::new),
	COOPER(CooperCoin::new);

	private final Supplier<Coin> constructor;

	private CoinType(Supplier<Coin> constructor) {
		this.constructor = constructor;
	}
	public Supplier<Coin> getConstructor() {
		return constructor;
	}
}
