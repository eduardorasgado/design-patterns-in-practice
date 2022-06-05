package structural.Bridge.RemoteControlExample;

public class RemoteControl {
	private Device device;
	
	public RemoteControl(Device device) {
		this.device = device;
	}
	
	protected Device getDevice() {
		return device;
	}

	public void togglePower() {
		if(device.isEnabled()) {
			device.disable();
		} else {
			device.enable();
		}
	}

	public void volumeUp() {
		device.setVolume(device.getVolume() + 1);
	}
	
	public void volumeDown() {
		device.setVolume(device.getVolume() - 1);
	}
	
	public void channelUp() {
		device.setChannel(device.getChannel() + 1);
	}

	public void channelDown() {
		device.setChannel(device.getChannel() - 1);
	}
	
	public static void main(String[] args) {
		Device tv = new Tv();
		RemoteControl simpleRemote = new RemoteControl(tv);
		System.out.println("tv is turned on: " + tv.isEnabled());
		simpleRemote.togglePower();
		System.out.println("tv is turned on: " + tv.isEnabled());
		simpleRemote.volumeDown();
		System.out.println("tv volume: " + tv.getVolume());
		simpleRemote.volumeDown();
		System.out.println("tv volume: " + tv.getVolume());
		simpleRemote.volumeDown();
		System.out.println("tv volume: " + tv.getVolume());
		simpleRemote.volumeUp();
		System.out.println("tv volume: " + tv.getVolume());
		System.out.println("current tv channel is: " + Tv.channels.get(tv.getChannel()));
		simpleRemote.channelDown();
		System.out.println("current tv channel is: " + Tv.channels.get(tv.getChannel()));
		simpleRemote.channelUp();
		System.out.println("current tv channel is: " + Tv.channels.get(tv.getChannel()));
		simpleRemote.channelUp();
		System.out.println("current tv channel is: " + Tv.channels.get(tv.getChannel()));
		simpleRemote.togglePower();
		System.out.println("tv is turned on: " + tv.isEnabled());
	}
}
