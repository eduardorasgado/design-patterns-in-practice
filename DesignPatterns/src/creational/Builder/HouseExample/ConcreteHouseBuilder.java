package creational.Builder.HouseExample;

public class ConcreteHouseBuilder implements HouseBuilder {

	private House house;
	
	public ConcreteHouseBuilder() {
		house = new House();
	}
	
	@Override
	public HouseBuilder buildFloor() {
		house.setFloor(HouseMaterialType.CONCRETE);
		return this;
	}

	@Override
	public HouseBuilder buildWall() {
		house.setWall(HouseMaterialType.CONCRETE);
		return this;
	}

	@Override
	public HouseBuilder buildRoof() {
		house.setRoof(HouseMaterialType.CONCRETE);
		return this;
	}

	@Override
	public House build() {
		return house;
	}

}
