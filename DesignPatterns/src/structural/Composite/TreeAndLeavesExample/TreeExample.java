package structural.Composite.TreeAndLeavesExample;

public class TreeExample {
	public static void main(String[] args) {
		
		Branch tree = new Branch();
		
		LifeProvider leaf1 = new Leaf(100, 0);
		LifeProvider leaf2 = new Leaf(80, 20);
		LifeProvider leaf3 = new Leaf(40, 60);
		
		Branch branch1 = new Branch();
		Branch branch2 = new Branch();
		
		tree.addChild(leaf1);
		tree.addChild(leaf2);
		tree.addChild(leaf3);
		tree.addChild(branch1);
		tree.addChild(branch2);
		
		LifeProvider leaf4 = new Leaf(10, 90);
		LifeProvider leaf5 = new Leaf(20, 80);
		branch1.addChild(leaf4);
		branch1.addChild(leaf5);
		
		Branch branch3 = new Branch();
		LifeProvider leaf6 = new Leaf(40, 60);
		branch2.addChild(leaf6);
		branch2.addChild(branch3);
		
		LifeProvider leaf7 = new Leaf(100, 0);
		branch3.addChild(leaf7);
		
		tree.provide(Chemical.OXYGEN);
		tree.provide(Chemical.CO2);
		
	}
}
