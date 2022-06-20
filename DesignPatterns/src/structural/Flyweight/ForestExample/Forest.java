package structural.Flyweight.ForestExample;

import java.util.List;

public class Forest {
	List<Tree> trees;
	private TreeFactory treeFactory;
	
	public Forest(List<Tree> trees, TreeFactory treeFactory) {
		this.trees = trees;
		this.treeFactory = treeFactory;
	}
	
	public void draw(ICanvas canvas) {
		for(Tree tree : trees) {
			tree.draw(canvas);
		}
		canvas.render();
	}

	public void plantTree(int x, int y, TreeTypeEnum treeType) {
		Tree tree = treeFactory.createTree(treeType);
		tree.setX(x);
		tree.setY(y);
		
		trees.add(tree);
	}
}
