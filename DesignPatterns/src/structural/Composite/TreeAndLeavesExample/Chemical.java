package structural.Composite.TreeAndLeavesExample;

public enum Chemical {
	OXYGEN("Oxygen"),
	CO2("CO2");
	
	private String name;
	
	private Chemical(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
