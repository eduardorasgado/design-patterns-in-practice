package creational.Factory.CoinExample;

public class CooperCoin implements Coin {

	public static final String DESCRIPTION = "This is a copper coin";
	
	@Override
	public String getDescription() {
		return DESCRIPTION;
	}

}
