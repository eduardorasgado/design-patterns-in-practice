package structural.Flyweight.ForestExample;

import java.util.ArrayList;
import java.util.List;

public class ForestDemo {
	public static void main(String[] args) {
 		System.out.println("-----------MY FORREST------------------");
		List<Tree> trees = new ArrayList<>();
		TreeFactory treeFactory = new TreeFactory();
		Forest forest = new Forest(trees, treeFactory);
		
		forest.plantTree(5, 7, TreeTypeEnum.AHUEHUETE);
		forest.plantTree(10, 13, TreeTypeEnum.AHUEHUETE);
		forest.plantTree(49, 0, TreeTypeEnum.AHUEHUETE);
		
		forest.plantTree(15, 49, TreeTypeEnum.JACARANDA);
		forest.plantTree(4, 2, TreeTypeEnum.JACARANDA);
		forest.plantTree(37, 35, TreeTypeEnum.JACARANDA);
		forest.plantTree(11, 46, TreeTypeEnum.JACARANDA);
		
		forest.plantTree(9, 8, TreeTypeEnum.ALMENDRO);
		forest.plantTree(40, 29, TreeTypeEnum.ALMENDRO);
		
		forest.plantTree(41, 16, TreeTypeEnum.PAROTA);
		forest.plantTree(3, 4, TreeTypeEnum.PAROTA);		
		forest.plantTree(8, 6, TreeTypeEnum.PAROTA);
		
		ICanvas canvas = new Canvas(50, 50);
		forest.draw(canvas);
	}
}
