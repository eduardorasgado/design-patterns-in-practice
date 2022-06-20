package structural.Flyweight.ForestExample;

import java.util.List;
import java.util.Map;

import static java.util.Objects.isNull;

import java.util.HashMap;

public class TreeFactory {
	private static Map<TreeTypeEnum, TreeType> treeTypes;

	static {
		treeTypes = new HashMap<>();
	}
	
	public Tree createTree(TreeTypeEnum treeTypeEnum) {
		TreeType treeType = treeTypes.get(treeTypeEnum);
		
		if(isNull(treeType)) {
			treeType = new TreeType(treeTypeEnum);
			treeTypes.put(treeTypeEnum, treeType);
		}
		System.out.println(System.identityHashCode(treeType));
		return new Tree(treeType);
	}
}
