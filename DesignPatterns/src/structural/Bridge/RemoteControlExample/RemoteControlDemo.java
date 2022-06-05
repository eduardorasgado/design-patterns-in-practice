package structural.Bridge.RemoteControlExample;

import java.util.Map;

public class RemoteControlDemo {

	public static void main(String[] args) {
		Device tv = new Tv();
		Device radio = new Radio();

		RemoteControl simpleRemote = new RemoteControl(radio);
		
		controlInteract(radio, simpleRemote, Radio.channels);
		
		System.out.println("-----------------------------");
		
		Device anotherTv = new Tv();
		simpleRemote = new RemoteControl(anotherTv);
		
		controlInteract(anotherTv, simpleRemote, Radio.channels);
		
		System.out.println("-----------------------------");
		
		AdvanceRemoteControl advanceRemote = new AdvanceRemoteControl(tv);
		controlInteract(tv, advanceRemote, Tv.channels);
		advanceRemote.mute();
		System.out.println(tv.getName() + " volume: " + tv.getVolume());
	}
	
	public static void controlInteract(Device device, RemoteControl remoteControl, Map<Integer, String> channels) {
		System.out.println(device.getName() + " is turned on: " + device.isEnabled());
		remoteControl.togglePower();
		System.out.println(device.getName() + " is turned on: " + device.isEnabled());
		remoteControl.volumeDown();
		System.out.println(device.getName() + " volume: " + device.getVolume());
		remoteControl.volumeDown();
		System.out.println(device.getName() + " volume: " + device.getVolume());
		remoteControl.volumeDown();
		System.out.println(device.getName() + " volume: " + device.getVolume());
		remoteControl.volumeUp();
		System.out.println(device.getName() + " volume: " + device.getVolume());
		System.out.println("current" + device.getName() +  " channel is: " + channels.get(device.getChannel()));
		remoteControl.channelDown();
		System.out.println("current" + device.getName() +  " channel is: " + channels.get(device.getChannel()));
		remoteControl.channelUp();
		System.out.println("current" + device.getName() +  " channel is: " + channels.get(device.getChannel()));
		remoteControl.channelUp();
		System.out.println("current" + device.getName() +  " channel is: " + channels.get(device.getChannel()));
		remoteControl.togglePower();
		System.out.println(device.getName() +  " is turned on: " + device.isEnabled());
	}
}
