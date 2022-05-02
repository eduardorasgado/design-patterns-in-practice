package creational.Builder.HouseExample;

public class House {
	
	private HouseMaterialType floor;
	private HouseMaterialType wall;
	private HouseMaterialType roof;
	
	public HouseMaterialType getFloor() {
		return floor;
	}

	public void setFloor(HouseMaterialType floor) {
		this.floor = floor;
	}

	public HouseMaterialType getWall() {
		return wall;
	}

	public void setWall(HouseMaterialType wall) {
		this.wall = wall;
	}

	public HouseMaterialType getRoof() {
		return roof;
	}

	public void setRoof(HouseMaterialType roof) {
		this.roof = roof;
	}

	@Override
	public String toString() {
		return "House [floor=" + floor.getDescription() + ", wall=" + wall.getDescription() + ", Roof=" + roof.getDescription() + "]";
	}
}
