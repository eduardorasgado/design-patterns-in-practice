package creational.FactoryMethod.CoinExample;

public class GoldCoin implements Coin {
	
	public static final String DESCRIPTION = "This is a gold coin";

	@Override
	public String getDescription() {
		return DESCRIPTION;
	}
}
