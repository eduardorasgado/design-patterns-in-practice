package structural.Bridge.RemoteControlExample;

public interface Device {

	String getName();
	
	boolean isEnabled();

	void enable();

	void disable();

	int getVolume();

	void setVolume(int percent);

	int getChannel();

	void setChannel(int channel);
}
