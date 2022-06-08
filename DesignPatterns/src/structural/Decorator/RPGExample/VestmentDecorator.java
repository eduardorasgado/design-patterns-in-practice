package structural.Decorator.RPGExample;

public class VestmentDecorator implements CharacterVestment {
	private CharacterVestment wrappee;
	
	
	public VestmentDecorator(CharacterVestment wrappee) {
		this.wrappee = wrappee;
	}

	@Override
	public int getDefense() {
		return wrappee.getDefense();
	}

}
