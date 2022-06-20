package structural.Flyweight.ForestExample;

public class Tree {
	private int x, y;
	private TreeType treeType;
	
	public Tree(int x, int y, TreeType treeType) {
		this.x = x;
		this.y = y;
		this.treeType = treeType;
	}

	public Tree(TreeType treeType) {
		this.treeType = treeType;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void draw(ICanvas canvas) {
		treeType.draw(x, y, canvas);
	}
}
