package structural.Composite.TreeAndLeavesExample;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class Leaf implements LifeProvider {
	private int accumulativeOxygen;
	private int accumulativeCo2;
	
	private final Map<Chemical, Supplier<Integer>> providers;
	
	public Leaf(int accummulativeOxygen, int accummulativeCo2) {
		this.accumulativeOxygen = accummulativeOxygen;
		this.accumulativeCo2 = accummulativeCo2;
		
		providers = new HashMap<>();
		providers.put(Chemical.OXYGEN, () -> getAccumulativeOxygen());
		providers.put(Chemical.CO2, () -> getAccumulativeCo2());
	}
	
	@Override
	public void provide(Chemical chemical) {
		System.out.println("providing " + providers.get(chemical).get() + " of " + chemical.getName());
	}

	public int getAccumulativeOxygen() {
		return accumulativeOxygen;
	}

	public int getAccumulativeCo2() {
		return accumulativeCo2;
	}

	public Map<Chemical, Supplier<Integer>> getProviders() {
		return providers;
	}
}
