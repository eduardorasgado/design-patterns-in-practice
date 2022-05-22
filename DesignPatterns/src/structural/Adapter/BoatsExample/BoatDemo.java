package structural.Adapter.BoatsExample;

public class BoatDemo {
	
	public static void main(String[] args) {
		FishingBoat fishingBoat = new FishingBoat();
		RowingBoat boatAdapter = new FishingBoatAdapter(fishingBoat);
		
		Captain captain = new Captain(boatAdapter);
		captain.row();
	}
}
