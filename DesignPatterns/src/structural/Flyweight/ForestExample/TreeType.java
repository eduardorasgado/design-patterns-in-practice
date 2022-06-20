package structural.Flyweight.ForestExample;

public class TreeType implements GraphicElement {
	String name;
	ColorEnum color;
	String texture;

	public TreeType(String name, ColorEnum color, String texture) {
		this.name = name;
		this.color = color;
		this.texture = texture;
	}

	public TreeType(TreeTypeEnum treeTypeEnum) {
		this(treeTypeEnum.getName(), treeTypeEnum.getColor(), treeTypeEnum.getTexture());
	}

	@Override
	public void draw(int x, int y, ICanvas canvas) {
		canvas.addGraphicElement(x, y, texture);	
	}
}
