package creational.Builder.HouseExample;

public class HouseBuildDirector {
	private HouseBuilder houseBuilder;
	
	public HouseBuildDirector(HouseBuilder houseBuilder) {
		this.houseBuilder = houseBuilder;
	}
	
	public House construct() {
		return houseBuilder.buildFloor().buildWall().buildRoof().build();
	}
}
