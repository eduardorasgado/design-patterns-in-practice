package creational.Builder.HouseExample;

public interface HouseBuilder {
	HouseBuilder buildFloor();
	HouseBuilder buildWall();
	HouseBuilder buildRoof();
	House build();
}
