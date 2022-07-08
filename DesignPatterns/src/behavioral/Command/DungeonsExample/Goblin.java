package behavioral.Command.DungeonsExample;

public class Goblin extends Target {

	public Goblin() {
		super(Size.NORMAL, Visibility.VISIBLE);
	}
	
	public void changeSize() {
		Size newSize = (getSize() == Size.NORMAL) ? Size.SMALL : Size.NORMAL;
		setSize(newSize);
	}

	public void changeVisibility() {
		Visibility newVisibility = (getVisibility() == Visibility.VISIBLE) ? Visibility.INVISIBLE : Visibility.VISIBLE;
		setVisibility(newVisibility);
	}

	public void showStatus() {
		System.out.println("Goblin size: " + getSize());
		System.out.println("Goblin visibility: " + getVisibility());
		System.out.println("----------");
	}

}
