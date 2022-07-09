package behavioral.Iterator.RadioExample;

import java.util.List;

public class StationListIterator implements Iterator<RadioStation> {
	private List<RadioStation> stations;
	private int nextPosition;
	
	public StationListIterator(StationList stationList) {
		this.stations = stationList.getAllStations();
	}

	@Override
	public boolean hasNext() {
		if(nextPosition < stations.size()) {
			return true;
		}
		return false;
	}

	@Override
	public RadioStation next() {
		if(hasNext()) {
			return stations.get(nextPosition++);
		}
		return null;
	}
}
