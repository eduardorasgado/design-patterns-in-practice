package behavioral.Iterator.RadioExample;

public class RadioDemo {
	
	public static void main(String[] args) {
		RadioStation radio1 = new RadioStation("185.3");
		RadioStation radio2 = new RadioStation("142.4");
		RadioStation radio3 = new RadioStation("111.1");
		RadioStation radio4 = new RadioStation("112.2");
		RadioStation radio5 = new RadioStation("154.2");
		RadioStation radio6 = new RadioStation("100.8");
		
		StationList stationList = new StationList();
		
		stationList.addStation(radio1);
		stationList.addStation(radio2);
		stationList.addStation(radio3);
		stationList.addStation(radio4);
		stationList.addStation(radio5);
		stationList.addStation(radio6);
		
		Iterator<RadioStation> stationListIterator = stationList.getIterator();
		while(stationListIterator.hasNext()) {
			System.out.println("Playing radio: " + stationListIterator.next().getFrequency());
		}
		
		stationList.removeStation(radio3);
		System.out.println("\nRemoving radio: " + radio3.getFrequency());
		System.out.println();
		
		stationListIterator = stationList.getIterator();
		
		while(stationListIterator.hasNext()) {
			System.out.println("Playing radio: " + stationListIterator.next().getFrequency());
		}
	}
}
