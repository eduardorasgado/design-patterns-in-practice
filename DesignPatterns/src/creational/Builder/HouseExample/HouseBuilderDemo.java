package creational.Builder.HouseExample;

public class HouseBuilderDemo {
	public static void main(String[] args) {
		HouseBuilder houseBuilder = new ConcreteHouseBuilder();
		HouseBuildDirector director = new HouseBuildDirector(houseBuilder);
		House house = director.construct();
		System.out.println(house.toString());
		
		houseBuilder = new WoodHouseBuilder();
		director = new HouseBuildDirector(houseBuilder);
		house = director.construct();
		System.out.println(house.toString());
	}
}
