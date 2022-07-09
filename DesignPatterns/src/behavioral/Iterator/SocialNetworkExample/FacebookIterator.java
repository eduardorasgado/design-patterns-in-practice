package behavioral.Iterator.SocialNetworkExample;

import java.util.ArrayList;
import java.util.List;

public class FacebookIterator implements ProfileIterator {
	private Facebook facebook;
	private String profileId;
	private ProfileType profileType;

	private int currentPosition;
	private List<Profile> cache;

	public FacebookIterator(Facebook facebook, String profileId, ProfileType profileType) {
		this.facebook = facebook;
		this.profileId = profileId;
		this.profileType = profileType;
		currentPosition = 0;
	}

	private void lazyInit() {
		if (cache == null) {
			cache = facebook.socialGraphRequest(profileId, profileType);
		}
	}

	@Override
	public boolean hasMore() {
		lazyInit();
		if (currentPosition < cache.size()) {
			return true;
		}
		return false;
	}

	@Override
	public Profile next() {
		if (hasMore()) {
			return cache.get(currentPosition++);
		}
		return null;
	}
}
