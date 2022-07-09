package behavioral.Iterator.SocialNetworkExample;

public class SocialSpammer {

	public void send(ProfileIterator iterator, String message) {
		while (iterator.hasMore()) {
			Profile profile = iterator.next();
			System.out.println("Sending spam to: " + profile.getEmail() + ", message: " + message);
		}
	}
}
