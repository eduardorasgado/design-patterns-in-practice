package structural.Bridge.RemoteControlExample;

import java.util.HashMap;
import java.util.Map;

public class Radio implements Device {
	// from 0 to 1
	private final String name = "RADIO";
	private double analogVolume;
	private double maxVolume;
	private String currentChannel;
	public static Map<Integer, String> channels;
	// power on is 100 out of a physical resistance
	private int analogPower;
	private int maxPower;
	
	static {
		channels = new HashMap<>();
		channels.put(1, "10.5 FM");
		channels.put(2, "15.6 FM");
		channels.put(3, "43.1 FM");
		channels.put(4, "75.5 FM");
		channels.put(5, "80.2 FM");
	}
	
	public Radio() {
		analogVolume = 1.0;
		maxVolume = 1.0;
		currentChannel = channels.get(1);
		analogPower = 0;
		maxPower = 80;
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public boolean isEnabled() {
		return analogPower == maxPower;
	}

	@Override
	public void enable() {
		if(!isEnabled()) {
			analogPower += maxPower;
		}
	}

	@Override
	public void disable() {
		if(isEnabled()) {
			analogPower -= maxPower;
		}
	}

	@Override
	public int getVolume() {
		return (int) (analogVolume * 100.0);
	}

	@Override
	public void setVolume(int percent) {
		double newAnalogVolume = (percent / 100.0);
		analogVolume =  newAnalogVolume >= maxVolume ? maxVolume : newAnalogVolume;
		//System.out.println("new volume is: " + analogVolume);
	}

	@Override
	public int getChannel() {
		for(Map.Entry<Integer, String> channel : channels.entrySet()) {
			if(channel.getValue().equals(currentChannel)) {
				//System.out.println("current channel is: " + channel.getValue());
				return channel.getKey();
			}
		}
		return 0;
	}

	@Override
	public void setChannel(int channel) {		
		if(channels.containsKey(channel)) {
			String newChannel = channels.get(channel);
			//System.out.println("new channel: " + newChannel);
			currentChannel = newChannel;
		}
	}
	
	public static void main(String[] args) {
		Device radio = new Radio();
		System.out.println("is enable: " + radio.isEnabled());
		radio.enable();
		System.out.println("is enable: " + radio.isEnabled());
		radio.getChannel();
		radio.setChannel(3);
		int channel = radio.getChannel();
		radio.setVolume(120);
		System.out.println("radio volume: " + radio.getVolume());
		radio.setVolume(20);
		System.out.println("radio volume: " + radio.getVolume());
		radio.disable();
		System.out.println("is enable: " + radio.isEnabled());
	}
}
