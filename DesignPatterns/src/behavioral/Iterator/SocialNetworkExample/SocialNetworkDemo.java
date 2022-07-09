package behavioral.Iterator.SocialNetworkExample;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class SocialNetworkDemo {
	private static final Logger LOGGER = Logger.getLogger(SocialNetworkDemo.class.getName());
	
	public static void main(String[] args) {
		
		SocialNetwork facebook = new Facebook();
		SocialSpammer spammer = new SocialSpammer();
		
		List<Profile> profiles = new ArrayList<>();
		
		Profile profile1 = new Profile("sys1", "profile1.gmail.com");
		Profile profile2 = new Profile("sys2", "profile2.gmail.com");
		Profile profile3 = new Profile("sys3", "profile3.gmail.com");
		Profile profile4 = new Profile("sys4", "profile4.gmail.com");
		Profile profile5 = new Profile("sys5", "profile5.gmail.com");
		Profile profile6 = new Profile("sys6", "profile6.gmail.com");
		Profile profile7 = new Profile("sys7", "profile7.gmail.com");
		Profile profile8 = new Profile("sys8", "profile8.gmail.com");
		Profile profile9 = new Profile("sys9", "profile9.gmail.com");
		Profile profile10 = new Profile("sys10", "profile10.gmail.com");
		
		profile1.addToNetwork(profile10, ProfileType.COWORKER);
		profile1.addToNetwork(profile9, ProfileType.COWORKER);
		profile1.addToNetwork(profile8, ProfileType.COWORKER);
		profile1.addToNetwork(profile7, ProfileType.FRIEND);
		
		
		profile2.addToNetwork(profile1, ProfileType.FRIEND);
		profile2.addToNetwork(profile3, ProfileType.FRIEND);
		profile2.addToNetwork(profile4, ProfileType.FRIEND);
		profile2.addToNetwork(profile5, ProfileType.COWORKER);
		
		profile3.addToNetwork(profile5, ProfileType.FRIEND);
		profile3.addToNetwork(profile6, ProfileType.FRIEND);
		profile3.addToNetwork(profile8, ProfileType.FRIEND);
		profile3.addToNetwork(profile9, ProfileType.FRIEND);
		profile3.addToNetwork(profile10, ProfileType.FRIEND);
		profile3.addToNetwork(profile1, ProfileType.COWORKER);
		
		profiles.add(profile1);
		profiles.add(profile2);
		profiles.add(profile3);
		profiles.add(profile4);
		profiles.add(profile5);
		profiles.add(profile6);
		profiles.add(profile7);
		profiles.add(profile8);
		profiles.add(profile9);
		profiles.add(profile10);
		
		facebook.addProfiles(profiles);
		
		Application application = new Application(spammer, facebook);
		
		application.sendSpamTo(profile1, ProfileType.COWORKER);
		System.out.println();
		application.sendSpamTo(profile3, ProfileType.FRIEND);
	}
}
