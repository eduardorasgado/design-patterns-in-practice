package structural.Adapter.BoatsExample;

// lets suppose we have this boat, captain cant afford it. There is no way captain use it now...
// the only option is to use the fishing boat
public class ExpensiveRowingBoat implements RowingBoat {
	private int cost;
	private int paid;

	public ExpensiveRowingBoat(int paid) {
		this.paid = paid;
		this.cost = 1000;
	}

	@Override
	public void row() {
		if(getPaid() < getCost()) {
			System.out.println("Cant buy this boat");
		} else {
			System.out.println("rowing this boat");
		}
	}

	public int getCost() {
		return cost;
	}

	public int getPaid() {
		return paid;
	}
}
