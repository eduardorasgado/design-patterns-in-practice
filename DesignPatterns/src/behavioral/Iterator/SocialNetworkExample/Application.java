package behavioral.Iterator.SocialNetworkExample;

public class Application {
	private SocialSpammer spammer;
	private SocialNetwork network;

	public Application(SocialSpammer spammer, SocialNetwork facebook) {
		this.spammer = spammer;
		this.network = facebook;
	}

	public void sendSpamTo(Profile profile, ProfileType profileType) {
		spammer.send(network.getIterator(profile.getId(), profileType), "Very importand message");
	}
}
