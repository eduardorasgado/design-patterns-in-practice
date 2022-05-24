package structural.Bridge.ShapesExample.After.Model;

public abstract class Color {
	private String name;
	
	public Color(String name) {
		this.name = name;
	}
	
	protected abstract String getHexRepresentation();

	public String getName() {
		return name;
	}
}
