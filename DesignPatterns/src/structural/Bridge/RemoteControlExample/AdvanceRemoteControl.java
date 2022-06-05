package structural.Bridge.RemoteControlExample;

public class AdvanceRemoteControl extends RemoteControl {
	private final int MUTE_VOLUME = 0;
	
	public AdvanceRemoteControl(Device device) {
		super(device);
	}
	
	public void mute() {
		getDevice().setVolume(MUTE_VOLUME);
	}
	
	public static void main(String[] args) {
		Device tv = new Tv();
		AdvanceRemoteControl advacedRemote = new AdvanceRemoteControl(tv);
		advacedRemote.togglePower();
		System.out.println("tv is turned on: " + tv.isEnabled());
		advacedRemote.volumeDown();
		System.out.println("tv volume: " + tv.getVolume());
		advacedRemote.volumeDown();
		System.out.println("tv volume: " + tv.getVolume());
		advacedRemote.volumeUp();
		System.out.println("tv volume: " + tv.getVolume());
		advacedRemote.mute();
		System.out.println("tv volume: " + tv.getVolume());
		System.out.println("current tv channel is: " + Tv.channels.get(tv.getChannel()));
		advacedRemote.channelUp();
		System.out.println("current tv channel is: " + Tv.channels.get(tv.getChannel()));
		advacedRemote.togglePower();
		System.out.println("tv is turned on: " + tv.isEnabled());
	}
}
