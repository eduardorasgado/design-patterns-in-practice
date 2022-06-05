package structural.Bridge.RemoteControlExample;

import java.util.HashMap;
import java.util.Map;

public class Tv implements Device {
	private final String name = "TV";
	private int volumePercent;
	private int currentChannel;
	private boolean turnedOn;
	
	public static Map<Integer, String> channels;
	
	static {
		channels = new HashMap<>();
		channels.put(1, "Formula 1");
		channels.put(2, "MTV");
		channels.put(3, "ESPN");
		channels.put(4, "NAT GEO");
		channels.put(5, "CNN");
	}
	
	public Tv() {
		volumePercent = 100;
		currentChannel = 1;
		turnedOn = false;
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public boolean isEnabled() {
		return isTurnedOn() == true;
	}

	@Override
	public void enable() {
		if(!isEnabled()) {
			toggleTurnedOn();
		}
	}

	@Override
	public void disable() {
		if(isEnabled()) {
			toggleTurnedOn();
		}
	}

	@Override
	public int getVolume() {
		return volumePercent;
	}

	@Override
	public void setVolume(int percent) {
		volumePercent = percent >= 100 ? 100 : percent;
	}

	@Override
	public int getChannel() {
		//System.out.println("current channel is: " + tvChannels.get(currentChannel));
		return currentChannel;
	}

	@Override
	public void setChannel(int channel) {
		if(channels.containsKey(channel)) {
			currentChannel = channel;
		}
	}

	private boolean isTurnedOn() {
		return turnedOn;
	}

	private void setTurnedOn(boolean turnedOn) {
		this.turnedOn = turnedOn;
	}
	
	private void toggleTurnedOn() {
		setTurnedOn(!isTurnedOn());
	}
	
	public static void main(String[] args) {
		Device tv = new Tv();
		System.out.println("is enable: " + tv.isEnabled());
		tv.enable();
		System.out.println("is enable: " + tv.isEnabled());
		tv.getChannel();
		tv.setChannel(3);
		int channel = tv.getChannel();
		tv.setVolume(80);
		System.out.println("tv volume: " + tv.getVolume());
		tv.setVolume(150);
		System.out.println("tv volume: " + tv.getVolume());
		tv.setVolume(25);
		System.out.println("tv volume: " + tv.getVolume());
		tv.disable();
		System.out.println("is enable: " + tv.isEnabled());
	}
}
