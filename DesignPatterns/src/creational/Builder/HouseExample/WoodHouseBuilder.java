package creational.Builder.HouseExample;

public class WoodHouseBuilder implements HouseBuilder {
	private House house;

	public WoodHouseBuilder() {
		house = new House();
	}
	
	@Override
	public HouseBuilder buildFloor() {
		house.setFloor(HouseMaterialType.WOOD);
		return this;
	}

	@Override
	public HouseBuilder buildWall() {
		house.setWall(HouseMaterialType.WOOD);
		return this;
	}

	@Override
	public HouseBuilder buildRoof() {
		house.setRoof(HouseMaterialType.WOOD);
		return this;
	}

	@Override
	public House build() {
		return house;
	}	
}
