package creational.Factory.CoinExample;

public class CoinFactory {
	public static Coin getCoin(CoinType type) {
		return type.getConstructor().get();
	}
}
