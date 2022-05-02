package creational.Builder.HouseExample;

public enum HouseMaterialType {
	CONCRETE("Concrete"),
	WOOD("Wood");
	
	private String description;
	
	private HouseMaterialType(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}	
}
