package structural.Adapter.PokemonExample;

public class BasePokemonDataMapper {
	protected boolean isParseableToInteger(String value) {
		try {
			Integer.parseInt(value);
			return true;
		} catch (NumberFormatException ex) {
			return false;
		}
	}
}
