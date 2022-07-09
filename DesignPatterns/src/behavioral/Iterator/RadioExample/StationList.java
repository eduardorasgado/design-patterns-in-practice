package behavioral.Iterator.RadioExample;

import java.util.ArrayList;
import java.util.List;

public class StationList implements IterableObject {
	private List<RadioStation> stations;

	public StationList() {
		stations = new ArrayList<>();
	}
	public void addStation(RadioStation radio) {
		if(!stations.contains(radio)) {
			stations.add(radio);
		}
	}

	public void removeStation(RadioStation radio) {
		if(stations.contains(radio)) {
			stations.remove(radio);
		}
	}

	@Override
	public Iterator<RadioStation> getIterator() {
		return new StationListIterator(this);
	}

	
	public List<RadioStation> getAllStations() {
		return stations;
	}

}
