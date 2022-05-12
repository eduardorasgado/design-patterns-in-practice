package creational.Prototype.UIExample;

public interface Interactable extends Cloneable {
	Interactable clone();

	void startInteraction();

	void finishInteraction();
}
